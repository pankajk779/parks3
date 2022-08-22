package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class PassportStampLocations {

    private String label;
//    example: Anaktuvuk Pass Ranger Station

    private String id;
//    example: B13EC2AF-3E68-430D-8846-293320E2D018

    private String type;
//    example: Visitor Center

    private List<RelatedParks> parks;

    static PassportStampLocations fill(JSONObject jsonobj) throws JSONException {
        PassportStampLocations entity = new PassportStampLocations();
        if (jsonobj.has("label")) {
            entity.setLabel(jsonobj.getString("label"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("type")) {
            entity.setType(jsonobj.getString("type"));
        }
        if (jsonobj.has("parks")) {
            entity.setParks((List<RelatedParks>) jsonobj.getJSONArray("parks"));
        }
        return entity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<RelatedParks> getParks() {
        return parks;
    }

    public void setParks(List<RelatedParks> parks) {
        this.parks = parks;
    }
}
