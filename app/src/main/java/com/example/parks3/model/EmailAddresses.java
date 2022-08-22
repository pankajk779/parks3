package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class EmailAddresses {
    private String description;

    private String emailAddress;

    static EmailAddresses fill(JSONObject jsonobj) throws JSONException {
        EmailAddresses entity = new EmailAddresses();
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("emailAddress")) {
            entity.setEmailAddress(jsonobj.getString("emailAddress"));
        }
        return entity;
    }

    static List<EmailAddresses> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<EmailAddresses> olist = new ArrayList<EmailAddresses>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    String getDescription() {
        return this.description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    String getEmailAddress() {
        return this.emailAddress;
    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
