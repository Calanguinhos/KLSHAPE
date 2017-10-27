package com.calangos.mainApp.dao;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by rafael on 27/10/17.
 */

public class webServiceClient extends AsyncTask<String, String, String> {

    private String afPostExecute;

    @Override
    protected String doInBackground(String... urls) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(urls[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();

            String line = "";
            while((line = reader.readLine()) != null){
                buffer.append(line);
            }

            String finalljson = buffer.toString();

            JSONObject parentObject = new JSONObject(finalljson);
            JSONArray parentArray = parentObject.getJSONArray("movies");

            StringBuffer finalBufferedData = new StringBuffer();
            for (int i=0; i<parentArray.length(); i++) {

                JSONObject finalObject = parentArray.getJSONObject(i);

                String movieName = finalObject.getString("movie");
                int movieYear = finalObject.getInt("year");
                finalBufferedData.append(movieName+" - "+ movieYear + "\n");

            }

            return finalBufferedData.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

    @Override
    protected void onPostExecute(String result){
        super.onPostExecute(result);
        setAfPostExecute(result);
    }

    public String getAfPostExecute() {
        return afPostExecute;
    }

    public void setAfPostExecute(String afPostExecute) {
        this.afPostExecute = afPostExecute;
    }
}

