package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

class Accessibility {
//        description:Detailed information about accessibility in the campground

        private String rvallowed;
        private String rvmaxlength;
        private String adainfo;
        private List<Classifications> classifications;
        private String wheelchairaccess;
        private List<AccessRoads> accessroads;
        private String internetinfo;
        private String rvinfo;
        private String trailerallowed;
        private String additionalinfo;
        private String trailermaxlength;
        private String firestovepolicy;
        private String cellphoneinfo;

    static Accessibility fill(JSONObject jsonobj) throws JSONException {
        Accessibility entity = new Accessibility();
        if (jsonobj.has("rvallowed")) {
            entity.setRvallowed(jsonobj.getString("rvallowed"));
        }
        if (jsonobj.has("rvmaxlength")) {
            entity.setRvmaxlength(jsonobj.getString("rvmaxlength"));
        }
        if (jsonobj.has("adainfo")) {
            entity.setAdainfo(jsonobj.getString("adainfo"));
        }
        if (jsonobj.has("classifications")) {
            entity.setClassifications((List<Classifications>) jsonobj.getJSONArray("classifications"));
        }
        if (jsonobj.has("wheelchairaccess")) {
            entity.setWheelchairaccess(jsonobj.getString("wheelchairaccess"));
        }
        if (jsonobj.has("accessroads")) {
            entity.setAccessroads((List<AccessRoads>) jsonobj.getJSONArray("accessroads"));
        }
        if (jsonobj.has("internetinfo")) {
            entity.setInternetinfo(jsonobj.getString("internetinfo"));
        }
        if (jsonobj.has("rvinfo")) {
            entity.setRvinfo(jsonobj.getString("rvinfo"));
        }
        if (jsonobj.has("trailerallowed")) {
            entity.setTrailerallowed(jsonobj.getString("trailerallowed"));
        }
        if (jsonobj.has("additionalinfo")) {
            entity.setAdditionalinfo(jsonobj.getString("additionalinfo"));
        }
        if (jsonobj.has("trailermaxlength")) {
            entity.setTrailermaxlength(jsonobj.getString("trailermaxlength"));
        }
        if (jsonobj.has("firestovepolicy")) {
            entity.setFirestovepolicy(jsonobj.getString("firestovepolicy"));
        }
        if (jsonobj.has("cellphoneinfo")) {
            entity.setCellphoneinfo(jsonobj.getString("cellphoneinfo"));
        }

        return entity;

    }

    static List<Accessibility> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<Accessibility> olist = new ArrayList<Accessibility>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }

    public String getRvallowed() {
        return rvallowed;
    }

    public void setRvallowed(String rvallowed) {
        this.rvallowed = rvallowed;
    }

    public String getRvmaxlength() {
        return rvmaxlength;
    }

    public void setRvmaxlength(String rvmaxlength) {
        this.rvmaxlength = rvmaxlength;
    }

    public String getAdainfo() {
        return adainfo;
    }

    public void setAdainfo(String adainfo) {
        this.adainfo = adainfo;
    }

    public List<Classifications> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<Classifications> classifications) {
        this.classifications = classifications;
    }

    public String getWheelchairaccess() {
        return wheelchairaccess;
    }

    public void setWheelchairaccess(String wheelchairaccess) {
        this.wheelchairaccess = wheelchairaccess;
    }

    public List<AccessRoads> getAccessroads() {
        return accessroads;
    }

    public void setAccessroads(List<AccessRoads> accessroads) {
        this.accessroads = accessroads;
    }

    public String getInternetinfo() {
        return internetinfo;
    }

    public void setInternetinfo(String internetinfo) {
        this.internetinfo = internetinfo;
    }

    public String getRvinfo() {
        return rvinfo;
    }

    public void setRvinfo(String rvinfo) {
        this.rvinfo = rvinfo;
    }

    public String getTrailerallowed() {
        return trailerallowed;
    }

    public void setTrailerallowed(String trailerallowed) {
        this.trailerallowed = trailerallowed;
    }

    public String getAdditionalinfo() {
        return additionalinfo;
    }

    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo;
    }

    public String getTrailermaxlength() {
        return trailermaxlength;
    }

    public void setTrailermaxlength(String trailermaxlength) {
        this.trailermaxlength = trailermaxlength;
    }

    public String getFirestovepolicy() {
        return firestovepolicy;
    }

    public void setFirestovepolicy(String firestovepolicy) {
        this.firestovepolicy = firestovepolicy;
    }

    public String getCellphoneinfo() {
        return cellphoneinfo;
    }

    public void setCellphoneinfo(String cellphoneinfo) {
        this.cellphoneinfo = cellphoneinfo;
    }
}
    class Classifications{

        private String string;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }

    class AccessRoads{

        private String string;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }
