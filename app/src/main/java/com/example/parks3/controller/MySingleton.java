package com.example.parks3.controller;

import android.app.Application;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton extends Application {

    private static MySingleton instance;
    private RequestQueue requestQueue;


    public static MySingleton getInstance(){
        if(instance==null){
            synchronized (MySingleton.class){
                instance=new MySingleton();
            }

        }
        return instance;
    }

    public RequestQueue getRequestQueue(Context context){
        if(requestQueue==null){
            requestQueue= Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req,Context context) {
        getRequestQueue(context).add(req);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
