package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Topics {
    private String id;
    private String name;

    static Topics fill(JSONObject jsonobj) throws JSONException {
        Topics entity = new Topics();
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

