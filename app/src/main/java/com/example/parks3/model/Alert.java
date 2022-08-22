package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class Alert {
    private String category;
    //Alert type: Danger, Caution, Information, or Park Closure

    private String description;
    //Alert description

    private String id;
    //Unique identifier for an alert record

    private String parkCode;
    //A variable width character code that uniquely identifies a specific park

    private String title;
    //Alert title

    private String url;
    //Link to more information about the alert, if available

    static Alert fill(JSONObject jsonobj) throws JSONException {
        Alert entity = new Alert();
        if (jsonobj.has("category")) {
            entity.setCategory(jsonobj.getString("category"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("parkCode")) {
            entity.setParkCode(jsonobj.getString("parkCode"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }

        return entity;

    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
