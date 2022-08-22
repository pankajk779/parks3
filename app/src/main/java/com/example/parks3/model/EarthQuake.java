package com.example.parks3.model;


import org.json.JSONException;
import org.json.JSONObject;

public class EarthQuake {
    private String place;
    private double magnitude;
    private long time;
    private String detailLink;
    private String type;
    private double lat;
    private double lon;

    static EarthQuake fill(JSONObject jsonobj) throws JSONException {
        EarthQuake entity = new EarthQuake();
        if (jsonobj.has("place")) {
            entity.setPlace(jsonobj.getString("place"));
        }
        if (jsonobj.has("magnitude")) {
            entity.setMagnitude(jsonobj.getDouble("magnitude"));
        }
        if (jsonobj.has("time")) {
            entity.setTime(jsonobj.getLong("time"));
        }
        if (jsonobj.has("detailLink")) {
            entity.setDetailLink(jsonobj.getString("detailLink"));
        }
        if (jsonobj.has("type")) {
            entity.setType(jsonobj.getString("type"));
        }
        if (jsonobj.has("lat")) {
            entity.setLat(jsonobj.getDouble("lat"));
        }
        if (jsonobj.has("lon")) {
            entity.setLon(jsonobj.getDouble("lon"));
        }
        return entity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
