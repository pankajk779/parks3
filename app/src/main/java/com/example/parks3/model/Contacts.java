package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class Contacts {
    //    description:Information about contacting the park
    private List<PhoneNumbers> phoneNumbers;

    private List<EmailAddresses> emailAddresses;

    static Contacts fill(JSONObject jsonobj) throws JSONException {
        Contacts entity = new Contacts();
        if (jsonobj.has("phoneNumbers")) {
            entity.setPhoneNumbers((List<PhoneNumbers>) jsonobj.getJSONArray("phoneNumbers"));
        }
        if (jsonobj.has("emailAddresses")) {
            entity.setEmailAddresses((List<EmailAddresses>) jsonobj.getJSONArray("emailAddresses"));
        }
        return entity;
    }

    static List<Contacts> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<Contacts> olist = new ArrayList<Contacts>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    List<PhoneNumbers> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    List<EmailAddresses> getEmailAddresses() {
        return this.emailAddresses;
    }

    void setEmailAddresses(List<EmailAddresses> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
