package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

class Amenities {

    private String id;
    //Unique identifier for this amenity

    private String name;
    //This amenity’s name

    static Amenities fill(JSONObject jsonobj) throws JSONException {
        Amenities entity = new Amenities();
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
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
}
