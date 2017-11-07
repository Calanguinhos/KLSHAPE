package com.calangos.mainApp.dao;

import android.content.Context;
import android.net.ConnectivityManager;

import com.calangos.mainApp.utils._Default;

/**
 * Created by rafag on 07/11/2017.
 */

public class webService extends _Default {
    public static String webServiceURL = "http://192.168.1.70/klshape/";

    public static boolean Connected(Context context){

        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            String logSync = null;
            String logToUserTitle = null;
            if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) {
                return true;
            } else if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static String getWebServiceURL() {
        return webServiceURL;
    }

    public static void setWebServiceURL(String webServiceURL) {
        webService.webServiceURL = webServiceURL;
    }
}
