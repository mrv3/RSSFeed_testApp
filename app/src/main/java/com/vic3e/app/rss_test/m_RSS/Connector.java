package com.vic3e.app.rss_test.m_RSS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Victory on 11/27/2017.
 */

public class Connector {

    public static Object connect(String urlAddress)
    {
        try
        {
            URL url=new URL(urlAddress);
            HttpURLConnection con= (HttpURLConnection) url.openConnection();
            //set properties
            con.setRequestMethod("GET");
            con.setConnectTimeout(15000);
            con.setReadTimeout(15000);
            con.setDoInput(true);
            return con;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return ErrorTracker.WRONG_URL_FORMAT;
        } catch (IOException e) {
            e.printStackTrace();
            return ErrorTracker.CONNECTION_ERROR;
        }
    }
}
