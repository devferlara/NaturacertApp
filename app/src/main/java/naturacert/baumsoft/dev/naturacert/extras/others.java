package naturacert.baumsoft.dev.naturacert.extras;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by imac on 7/26/15.
 */
public class others {
    private static final String LOG_TAG = "Naturacert";

    public static String leerArchivo(String fileName, Context c) {
        try {
            InputStream is = c.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String text = new String(buffer);
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String leerArchivoFlor(String fileName, Context c) {
        try {
            InputStream is = c.getAssets().open("florverde/" + fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String text = new String(buffer);
            return text;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getUrlContent(String page) {
        StringBuilder results = new StringBuilder();
        HttpURLConnection conn = null;
        InputStreamReader in=null;

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
