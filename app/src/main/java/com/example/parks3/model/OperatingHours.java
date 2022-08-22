package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class OperatingHours {
    //description:Hours and seasons when the park is open or closed

    private List<Exceptions> exceptions;

    private String description;

    private StandardHours standardHours;

    private String name;


    List<Exceptions> getExceptions() {
        return this.exceptions;
    }
    void setExceptions(List<Exceptions> exceptions) {
        this.exceptions = exceptions;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public StandardHours getStandardHours() {
        return this.standardHours;
    }
    public void setStandardHours(StandardHours standardHours) {
        this.standardHours = standardHours;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    static OperatingHours fill(JSONObject jsonobj) throws JSONException {
        OperatingHours entity = new OperatingHours();
        if (jsonobj.has("exceptions")) {
            //entity.setExceptions(jsonobj.getJSONArray("exceptions"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("standardHours")) {
            entity.setStandardHours((StandardHours) jsonobj.get("standardHours"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
        }
        return entity;
    }

    static List<OperatingHours> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<OperatingHours> olist = new ArrayList<OperatingHours>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

}

 class StandardHours {
    private String wednesday;

    private String monday;

    private String thursday;

    private String sunday;

    private String tuesday;

    private String friday;

    private String saturday;

    static StandardHours fill(JSONObject jsonobj) throws JSONException {
        StandardHours entity = new StandardHours();
        if (jsonobj.has("wednesday")) {
            entity.setWednesday(jsonobj.getString("wednesday"));
        }
        if (jsonobj.has("monday")) {
            entity.setMonday(jsonobj.getString("monday"));
        }
        if (jsonobj.has("thursday")) {
            entity.setThursday(jsonobj.getString("thursday"));
        }
        if (jsonobj.has("sunday")) {
            entity.setSunday(jsonobj.getString("sunday"));
        }
        if (jsonobj.has("tuesday")) {
            entity.setTuesday(jsonobj.getString("tuesday"));
        }
        if (jsonobj.has("friday")) {
            entity.setFriday(jsonobj.getString("friday"));
        }
        if (jsonobj.has("saturday")) {
            entity.setSaturday(jsonobj.getString("saturday"));
        }
        return entity;
    }

    static List<StandardHours> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<StandardHours> olist = new ArrayList<StandardHours>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    public String getWednesday() {
        return this.wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getMonday() {
        return this.monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getThursday() {
        return this.thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getSunday() {
        return this.sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getTuesday() {
        return this.tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getFriday() {
        return this.friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return this.saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }
}
