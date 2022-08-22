package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class AmenitiesParksVisitorCenters {

    private String id;

    private String name;

    private List<Park> parks;

    static AmenitiesParksVisitorCenters fill(JSONObject jsonobj) throws JSONException {
        AmenitiesParksVisitorCenters entity = new AmenitiesParksVisitorCenters();
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
        }
        if (jsonobj.has("parks")) {
            entity.setParks((List<Park>) jsonobj.getJSONArray("parks"));
        }
        return entity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Park> getParks() {
        return parks;
    }

    public void setParks(List<Park> parks) {
        this.parks = parks;
    }
}
