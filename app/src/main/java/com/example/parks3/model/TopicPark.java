package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class TopicPark {

    private String id;
//    example: F40AC1EE-420B-457B-B519-EC6EE5280F0C
//    Unique identifier for topic park record

    private String name;
//    example: animals
//    Name of topic park record

    private List<RelatedParks> parks;

    static TopicPark fill(JSONObject jsonobj) throws JSONException {
        TopicPark entity = new TopicPark();
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
        }
        if (jsonobj.has("parks")) {
            entity.setParks((List<RelatedParks>) jsonobj.getJSONArray("parks"));
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

    public List<RelatedParks> getParks() {
        return parks;
    }

    public void setParks(List<RelatedParks> parks) {
        this.parks = parks;
    }
}
