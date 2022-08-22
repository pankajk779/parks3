package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class PhoneNumbers {
    private String phoneNumber;

    private String description;

    private String extension;

    private String type;
    //type=Enum:
    //[ Voice, Fax, TTY ]

    static PhoneNumbers fill(JSONObject jsonobj) throws JSONException {
        PhoneNumbers entity = new PhoneNumbers();
        if (jsonobj.has("phoneNumber")) {
            entity.setPhoneNumber(jsonobj.getString("phoneNumber"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("extension")) {
            entity.setExtension(jsonobj.getString("extension"));
        }
        if (jsonobj.has("type")) {
            entity.setType(jsonobj.getString("type"));
        }
        return entity;
    }

    static List<PhoneNumbers> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<PhoneNumbers> olist = new ArrayList<PhoneNumbers>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getDescription() {
        return this.description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getExtension() {
        return this.extension;
    }

    void setExtension(String extension) {
        this.extension = extension;
    }

    String getType() {
        return this.type;
    }

    void setType(String type) {
        this.type = type;
    }
}
