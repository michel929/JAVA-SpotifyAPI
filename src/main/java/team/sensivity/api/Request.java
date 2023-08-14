package team.sensivity.api;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {

    public static void PUTRequest(String link, String token){
        URL url = null;
        try {
            url = new URL(link);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("PUT");
            httpCon.setRequestProperty ("Authorization", "Bearer " + token);
            httpCon.setRequestProperty("Content-Type", "application/json");

            OutputStreamWriter out = new OutputStreamWriter(
                    httpCon.getOutputStream());
            out.write("Resource content");
            out.close();
            httpCon.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void PUTRequest(String link, String token, String var){
        URL url = null;
        try {
            url = new URL(link + var);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("PUT");
            httpCon.setRequestProperty ("Authorization", "Bearer " + token);
            httpCon.setRequestProperty("Content-Type", "application/json");

            OutputStreamWriter out = new OutputStreamWriter(
                    httpCon.getOutputStream());
            out.write("Resource content");
            out.close();
            httpCon.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void POSTRequest(String link, String token){
        URL url = null;
        try {
            url = new URL(link);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("POST");
            httpCon.setRequestProperty ("Authorization", "Bearer " + token);
            httpCon.setRequestProperty("Content-Type", "application/json");

            OutputStreamWriter out = new OutputStreamWriter(
                    httpCon.getOutputStream());
            out.write("Resource content");
            out.close();
            httpCon.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
