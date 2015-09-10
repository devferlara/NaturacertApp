package naturacert.baumsoft.dev.naturacert.extras;


import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by dayessi on 25/03/15.
 */
public class httpConections {
    private static final String LOG_TAG = "Naturacert";
    public static final String SERVER = "http://naturacert.ddns.net/";
    public static final String API = "api/";
    public static final String MEDIA = "media/";


    public String getPostContent(String url, List<NameValuePair> params) {
        HttpClient client = new DefaultHttpClient();
        HttpPost request = new HttpPost(url);
        request.setHeader("Content-Type", "application/x-www-form-urlencoded");
        try {
            // List<NameValuePair> params = new ArrayList<NameValuePair>();
            // params.add(new BasicNameValuePair("dato", "valor"));
            request.setEntity(new UrlEncodedFormEntity(params));
            HttpResponse response = client.execute(request);
            HttpEntity ent = response.getEntity();
            String text = EntityUtils.toString(ent);
            return text;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static String getUrlContent(String page) {
        StringBuilder results = new StringBuilder();
        HttpURLConnection conn = null;
        InputStreamReader in = null;

        try {
            URL url = new URL(page);

            conn = (HttpURLConnection) url.openConnection();
            in = new InputStreamReader(conn.getInputStream());

            // Load the results into a StringBuilder
            int read;
            char[] buff = new char[1024];

            while ((read = in.read(buff)) != -1) {
                results.append(buff, 0, read);
            }
            return results.toString();

        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Error processing Places API URL", e);
            return results.toString();
        } catch (IOException e) {
            Log.e(LOG_TAG, "Error connecting to Places API", e);
            return results.toString();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

}