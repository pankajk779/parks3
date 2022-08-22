package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class AmenitiesCampground {
//    description:Detailed information about amenities available in the campground.

    private String dumpstation;
    private String campstore;
    private String cellphonereception;
    private List<Toilets> toilets;
    private List<PotableWater> potablewater;
    private List<Showers> showers;
    private String ampitheater;
    private String amphitheater;
    private String firewoodforsale;
    private String iceavailableforsale;
    private String stafforvolunteerhostonsite;
    private String trashrecyclingcollection;
    private String internetconnectivity;
    private String laundry;
    private String foodStorageLockers;


    static AmenitiesCampground fill(JSONObject jsonobj) throws JSONException {
        AmenitiesCampground entity = new AmenitiesCampground();
        if (jsonobj.has("dumpstation")) {
            entity.setDumpstation(jsonobj.getString("dumpstation"));
        }
        if (jsonobj.has("campstore")) {
            entity.setCampstore(jsonobj.getString("campstore"));
        }
        if (jsonobj.has("cellphonereception")) {
            entity.setCellphonereception(jsonobj.getString("cellphonereception"));
        }
        if (jsonobj.has("toilets")) {
            entity.setToilets((List<Toilets>) jsonobj.getJSONArray("toilets"));
        }
        if (jsonobj.has("potablewater")) {
            entity.setPotablewater((List<PotableWater>) jsonobj.getJSONArray("potablewater"));
        }
        if (jsonobj.has("showers")) {
            entity.setShowers((List<Showers>) jsonobj.getJSONArray("showers"));
        }
        if (jsonobj.has("ampitheater")) {
            entity.setAmpitheater(jsonobj.getString("ampitheater"));
        }
        if (jsonobj.has("amphitheater")) {
            entity.setAmphitheater(jsonobj.getString("amphitheater"));
        }
        if (jsonobj.has("firewoodforsale")) {
            entity.setFirewoodforsale(jsonobj.getString("firewoodforsale"));
        }
        if (jsonobj.has("iceavailableforsale")) {
            entity.setIceavailableforsale(jsonobj.getString("iceavailableforsale"));
        }
        if (jsonobj.has("stafforvolunteerhostonsite")) {
            entity.setStafforvolunteerhostonsite(jsonobj.getString("stafforvolunteerhostonsite"));
        }
        if (jsonobj.has("trashrecyclingcollection")) {
            entity.setTrashrecyclingcollection(jsonobj.getString("trashrecyclingcollection"));
        }
        if (jsonobj.has("internetconnectivity")) {
            entity.setInternetconnectivity(jsonobj.getString("internetconnectivity"));
        }
        if (jsonobj.has("laundry")) {
            entity.setLaundry(jsonobj.getString("laundry"));
        }
        if (jsonobj.has("foodStorageLockers")) {
            entity.setFoodStorageLockers(jsonobj.getString("foodStorageLockers"));
        }
        return entity;
    }

    public String getDumpstation() {
        return dumpstation;
    }

    public void setDumpstation(String dumpstation) {
        this.dumpstation = dumpstation;
    }

    public String getCampstore() {
        return campstore;
    }

    public void setCampstore(String campstore) {
        this.campstore = campstore;
    }

    public String getCellphonereception() {
        return cellphonereception;
    }

    public void setCellphonereception(String cellphonereception) {
        this.cellphonereception = cellphonereception;
    }

    public List<Toilets> getToilets() {
        return toilets;
    }

    public void setToilets(List<Toilets> toilets) {
        this.toilets = toilets;
    }

    public List<PotableWater> getPotablewater() {
        return potablewater;
    }

    public void setPotablewater(List<PotableWater> potablewater) {
        this.potablewater = potablewater;
    }

    public List<Showers> getShowers() {
        return showers;
    }

    public void setShowers(List<Showers> showers) {
        this.showers = showers;
    }

    public String getAmpitheater() {
        return ampitheater;
    }

    public void setAmpitheater(String ampitheater) {
        this.ampitheater = ampitheater;
    }

    public String getAmphitheater() {
        return amphitheater;
    }

    public void setAmphitheater(String amphitheater) {
        this.amphitheater = amphitheater;
    }

    public String getFirewoodforsale() {
        return firewoodforsale;
    }

    public void setFirewoodforsale(String firewoodforsale) {
        this.firewoodforsale = firewoodforsale;
    }

    public String getIceavailableforsale() {
        return iceavailableforsale;
    }

    public void setIceavailableforsale(String iceavailableforsale) {
        this.iceavailableforsale = iceavailableforsale;
    }

    public String getStafforvolunteerhostonsite() {
        return stafforvolunteerhostonsite;
    }

    public void setStafforvolunteerhostonsite(String stafforvolunteerhostonsite) {
        this.stafforvolunteerhostonsite = stafforvolunteerhostonsite;
    }

    public String getTrashrecyclingcollection() {
        return trashrecyclingcollection;
    }

    public void setTrashrecyclingcollection(String trashrecyclingcollection) {
        this.trashrecyclingcollection = trashrecyclingcollection;
    }

    public String getInternetconnectivity() {
        return internetconnectivity;
    }

    public void setInternetconnectivity(String internetconnectivity) {
        this.internetconnectivity = internetconnectivity;
    }

    public String getLaundry() {
        return laundry;
    }

    public void setLaundry(String laundry) {
        this.laundry = laundry;
    }

    public String getFoodStorageLockers() {
        return foodStorageLockers;
    }

    public void setFoodStorageLockers(String foodStorageLockers) {
        this.foodStorageLockers = foodStorageLockers;
    }
}

class Toilets{

    private String toilets;

    public String getToilets() {
        return toilets;
    }

    public void setToilets(String toilets) {
        this.toilets = toilets;
    }
}

class PotableWater{
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

class Showers{
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
