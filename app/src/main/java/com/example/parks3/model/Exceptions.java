package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Exceptions {
    private ExceptionHours exceptionHours;

    private Date startDate;

    private String name;

    private Date endDate;

    static Exceptions fill(JSONObject jsonobj) throws JSONException {
        Exceptions entity = new Exceptions();
        if (jsonobj.has("exceptionHours")) {
            // entity.setExceptionHours(jsonobj.ge("exceptionHours"));
        }
        if (jsonobj.has("startDate")) {
            entity.setStartDate((Date) jsonobj.get("startDate"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
        }
        if (jsonobj.has("endDate")) {
            //entity.setEndDate(jsonobj.getDate("endDate"));
        }
        return entity;
    }

    static List<Exceptions> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<Exceptions> olist = new ArrayList<Exceptions>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    ExceptionHours getExceptionHours() {
        return this.exceptionHours;
    }

    void setExceptionHours(ExceptionHours exceptionHours) {
        this.exceptionHours = exceptionHours;
    }

    Date getStartDate() {
        return this.startDate;
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Date getEndDate() {
        return this.endDate;
    }

    void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

class ExceptionHours {
    static ExceptionHours fill(JSONObject jsonobj) {
        ExceptionHours entity = new ExceptionHours();
        return entity;
    }

    static List<ExceptionHours> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<ExceptionHours> olist = new ArrayList<ExceptionHours>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}
