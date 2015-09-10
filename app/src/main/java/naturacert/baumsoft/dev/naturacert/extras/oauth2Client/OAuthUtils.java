package naturacert.baumsoft.dev.naturacert.extras.oauth2Client;


import android.util.Base64;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import naturacert.baumsoft.dev.naturacert.extras.httpConections;

public class OAuthUtils {
    public static String getProtectedResource(Token token, String path) {
        String resourceURL = httpConections.SERVER + path;
        HttpGet get = new HttpGet(resourceURL);
        get.addHeader(OAuthConstants.AUTHORIZATION,
                getAuthorizationHeaderForAccessToken(token
                        .getAccessToken()));
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = null;
        String responseString = "";
        int code = -1;
        try {
            response = httpClient.execute(get);
            code = response.getStatusLine().getStatusCode();
            if (code >= 400) {
                throw new RuntimeException(
                        "Could not access protected resource. Server returned http code: "
                                + code);
            }

            HttpEntity entity = response.getEntity();
            responseString = EntityUtils.toString(entity, "UTF-8");
            System.out.println(responseString);
            //handleResponse(response);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                response.getEntity().consumeContent();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return responseString;
    }

    public static Token getAccessToken(OAuth2Config oauthDetails) {
        HttpPost post = new HttpPost(oauthDetails.getTokenEndPointUrl());
        String clientId = oauthDetails.getClientId();
        String clientSecret = oauthDetails.getClientSecret();
        String scope = oauthDetails.getScope();

        List<BasicNameValuePair> parametersBody = new ArrayList<BasicNameValuePair>();
        parametersBody.add(new BasicNameValuePair(OAuthConstants.GRANT_TYPE,
                oauthDetails.getGrantType()));
        parametersBody.add(new BasicNameValuePair(OAuthConstants.USERNAME,
                oauthDetails.getUsername()));
        parametersBody.add(new BasicNameValuePair(OAuthConstants.PASSWORD,
                oauthDetails.getPassword()));

        if (isValid(clientId)) {
            parametersBody.add(new BasicNameValuePair(OAuthConstants.CLIENT_ID,
                    clientId));
        }
        if (isValid(clientSecret)) {
            parametersBody.add(new BasicNameValuePair(
                    OAuthConstants.CLIENT_SECRET, clientSecret));
        }
        if (isValid(scope)) {
            parametersBody.add(new BasicNameValuePair(OAuthConstants.SCOPE,
                    scope));
        }

        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = null;
        Token accessToken = null;

        try {
            post.setEntity(new UrlEncodedFormEntity(parametersBody));
            response = client.execute(post);
            int code = response.getStatusLine().getStatusCode();
            if (code >= 400) {
                System.out.println("Authorization server expects Basic authentication");
                // Add Basic Authorization header
                post.addHeader(
                        OAuthConstants.AUTHORIZATION,
                        getBasicAuthorizationHeader(oauthDetails.getUsername(),
                                oauthDetails.getPassword()));
                System.out.println("Retry with login credentials");
                try {
                    response.getEntity().consumeContent();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                response = client.execute(post);
                code = response.getStatusLine().getStatusCode();
                if (code >= 400) {
                    System.out.println("Retry with client credentials");
                    post.removeHeaders(OAuthConstants.AUTHORIZATION);
                    post.addHeader(
                            OAuthConstants.AUTHORIZATION,
                            getBasicAuthorizationHeader(
                                    oauthDetails.getClientId(),
                                    oauthDetails.getClientSecret()));
                    try {
                        response.getEntity().consumeContent();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    response = client.execute(post);
                    code = response.getStatusLine().getStatusCode();
                    if (code >= 400) {
                        throw new RuntimeException(
                                "Could not retrieve access token for user: "
                                        + oauthDetails.getUsername());
                    }
                }
            }
            Map<String, Object> map = handleJsonResponse(response);
            accessToken = new Token(new Long((Integer) map.get(OAuthConstants.EXPIRES_IN)), (String) map.get(OAuthConstants.TOKEN_TYPE), (String) map.get(OAuthConstants.REFRESH_TOKEN), (String) map.get(OAuthConstants.ACCESS_TOKEN));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return accessToken;
    }
    public static Token refreshAccessToken(Token token, OAuth2Config oauthDetails) {
        HttpPost post = new HttpPost(oauthDetails.getTokenEndPointUrl());
        String clientId = oauthDetails.getClientId();
        String clientSecret = oauthDetails.getClientSecret();

        List<BasicNameValuePair> parametersBody = new ArrayList<BasicNameValuePair>();
        parametersBody.add(new BasicNameValuePair(OAuthConstants.GRANT_TYPE,
                "refresh_token"));
        parametersBody.add(new BasicNameValuePair(OAuthConstants.REFRESH_TOKEN,
                token.getRefreshToken()));


        if (isValid(clientId)) {
            parametersBody.add(new BasicNameValuePair(OAuthConstants.CLIENT_ID,
                    clientId));
        }
        if (isValid(clientSecret)) {
            parametersBody.add(new BasicNameValuePair(
                    OAuthConstants.CLIENT_SECRET, clientSecret));
        }

        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = null;
        Token accessToken = null;
        try {
            post.setEntity(new UrlEncodedFormEntity(parametersBody, HTTP.UTF_8));

            response = client.execute(post);
            System.out.println(response.getStatusLine().getStatusCode());
            int code = response.getStatusLine().getStatusCode();
            if (code >= 400) {
                System.out.println("Retry with client credentials");
                post.removeHeaders(OAuthConstants.AUTHORIZATION);
                post.addHeader(
                        OAuthConstants.AUTHORIZATION,
                        getBasicAuthorizationHeader(
                                oauthDetails.getClientId(),
                                oauthDetails.getClientSecret()));

                try {
                    response.getEntity().consumeContent();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


                response = client.execute(post);
                code = response.getStatusLine().getStatusCode();
                if (code >= 400) {
                    throw new RuntimeException(
                            "Could not retrieve access token");
                }
            }

            Map<String, Object> map = handleJsonResponse(response);
            accessToken = new Token(new Long((Integer) map.get(OAuthConstants.EXPIRES_IN)), (String) map.get(OAuthConstants.TOKEN_TYPE), (String) map.get(OAuthConstants.REFRESH_TOKEN), (String) map.get(OAuthConstants.ACCESS_TOKEN));
        } catch (ClientProtocolException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return accessToken;
    }

    public static String getAuthorizationHeaderForAccessToken(String accessToken) {
        return OAuthConstants.BEARER + " " + accessToken;
    }

    public static String getBasicAuthorizationHeader(String username,
                                                     String password) {
        return OAuthConstants.BASIC + " "
                + encodeCredentials(username, password);
    }

    public static String encodeCredentials(String username, String password) {
        String cred = username + ":" + password;
        String encodedValue = null;
        byte[] encodedBytes = Base64.encode(cred.getBytes(), Base64.NO_WRAP);
        encodedValue = new String(encodedBytes);
        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.decode(encodedBytes, Base64.NO_WRAP);
        System.out.println("decodedBytes " + new String(decodedBytes));
        return encodedValue;
    }


    public static boolean isValid(String str) {
        return (str != null && str.trim().length() > 0);
    }

    public static Map handleJsonResponse(HttpResponse response) {
        JSONObject oauthLoginResponse = null;
        String contentType = response.getEntity().getContentType().getValue();
        try {
            oauthLoginResponse = new JSONObject(EntityUtils.toString(response.getEntity()));
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (JSONException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        System.out.println();
        System.out.println("********** JSON Response Received **********");

        Map<String, Object> outMap = new HashMap<>();
        Iterator<String> keysIterator = oauthLoginResponse.keys();
        while (keysIterator.hasNext())
        {
            String keyStr = (String)keysIterator.next();
            Object value = null;
            try {
                value = oauthLoginResponse.get(keyStr);
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            outMap.put(keyStr,value);
            System.out.println(String.format("  %s = %s", keyStr, value));
        }

        return outMap;
    }
}
