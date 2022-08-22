package com.example.parks3.controller;

import static android.net.ConnectivityManager.*;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

import java.net.NetworkInterface;
import java.net.URL;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.HttpsURLConnection;

class CheckNetworkConnection
{


    private ConnectivityManager cm;
    private HashSet<Network> validNetworks=new HashSet<>();

    public CheckNetworkConnection(Context context) {
        cm= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

//    @Override
//    protected void onActive() {
//        super.onActive();
//
//    }

//    private ConnectivityManager.NetworkCallback createNetworkCallback(ConnectivityManager.NetworkCallback n){
//
//
//    }

    private Boolean isNetworkAvailable(){

        if(cm==null) return false;

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
            NetworkCapabilities nc=cm.getNetworkCapabilities(cm.getActiveNetwork());
            if(nc==null) return false;
            return nc.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);

        }else if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
            Network[] networks=cm.getAllNetworks();
            for (Network network : networks) {
                NetworkInfo networkInfo=cm.getNetworkInfo(network);
                if(networkInfo !=null && networkInfo.isConnected()) return true;
            }

        }else{
            NetworkInfo[] networkInfos=cm.getAllNetworkInfo();
            for (NetworkInfo info: networkInfos){
                if(info!=null && info.isConnected()) return true;
            }
        }
        return false;

    }

    public synchronized void checkInternetConnection(){

        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                 if(isNetworkAvailable()){
                     try{
                         HttpsURLConnection urlConnection= (HttpsURLConnection) new URL("https://clients3.google.com/generate_204")
                                 .openConnection();
                         urlConnection.setRequestProperty("User-Agent","Android");
                         urlConnection.setRequestProperty("Connection","close");
                         urlConnection.connect();
                         boolean isConnected=urlConnection.getResponseCode()==204 && urlConnection.getContentLength()==0;
//                         postCallback(callback,isConnected);


                     }catch(Exception e){

                     }

                 }
            }
        });

    }
}
