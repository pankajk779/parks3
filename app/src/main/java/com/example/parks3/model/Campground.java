package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class Campground {

    private String regulationsoverview;
//    Information about campground regulations

    private List<Addresses> addresses;
//    description:Campground addresses (physical and mailing)

    private String regulationsurl;
//    Link to additional information about campground regulations, if available

    private String reservationsurl;
//    Link to website where reservations can be made

    private String reservationssitesreservable;
//    Number of sites that can be booked in advance

    private List<Campsites> campsites;

    private String name;
//    Campground name

    private String latitude;
//    example: 63.4574408

    private String longitude;
//    example: -150.8612003

    private String weatheroverview;
//    General description of the weather in the campground over the course of a year

    private List<Fees> fees;

    private String directionsoverview;
//    General overview of how to get to the campground

    private List<Accessibility> accessibility;
    private List<CampgroundOperatingHours> operatingHours;

    private String reservationssitesfirstcome;
//    Number of sites that are first come, first served (cannot be booked in advance)

    private List<Contacts> contacts;

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String reservationsdescription;
//    General description of the reservation process, if applicable

    private String parkCode;
//    A variable width character code used to identify a specific park

    private List<AmenitiesCampground> amenities;

    private List<ImagesCampground> images;

    private String latLong;
//    example: {lat:63.4574408, lng:-150.8612003}
//    Campground GPS cordinates

    private String id;
//    Campground identification string

    private String directionsUrl;
//    Link to page, if available, that provides additional detail on getting to the campground

    private String description;
//    General description of the campground

}

class Campsites{
//    description:Detailed information about campsites

    private String other;
    private String group;
    private String horse;
    private String totalsites;
    private String tentonly;
    private String electricalhookups;
    private String rvonly;
    private String walkboatto;

    static Campsites fill(JSONObject jsonobj) throws JSONException {
        Campsites entity = new Campsites();
        if (jsonobj.has("other")) {
            entity.setOther(jsonobj.getString("other"));
        }
        if (jsonobj.has("group")) {
            entity.setGroup(jsonobj.getString("group"));
        }
        if (jsonobj.has("horse")) {
            entity.setHorse(jsonobj.getString("horse"));
        }
        if (jsonobj.has("totalsites")) {
            entity.setTotalsites(jsonobj.getString("totalsites"));
        }
        if (jsonobj.has("tentonly")) {
            entity.setTentonly(jsonobj.getString("tentonly"));
        }
        if (jsonobj.has("electricalhookups")) {
            entity.setElectricalhookups(jsonobj.getString("electricalhookups"));
        }
        if (jsonobj.has("rvonly")) {
            entity.setRvonly(jsonobj.getString("rvonly"));
        }
        if (jsonobj.has("walkboatto")) {
            entity.setWalkboatto(jsonobj.getString("walkboatto"));
        }
        return entity;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }

    public String getTotalsites() {
        return totalsites;
    }

    public void setTotalsites(String totalsites) {
        this.totalsites = totalsites;
    }

    public String getTentonly() {
        return tentonly;
    }

    public void setTentonly(String tentonly) {
        this.tentonly = tentonly;
    }

    public String getElectricalhookups() {
        return electricalhookups;
    }

    public void setElectricalhookups(String electricalhookups) {
        this.electricalhookups = electricalhookups;
    }

    public String getRvonly() {
        return rvonly;
    }

    public void setRvonly(String rvonly) {
        this.rvonly = rvonly;
    }

    public String getWalkboatto() {
        return walkboatto;
    }

    public void setWalkboatto(String walkboatto) {
        this.walkboatto = walkboatto;
    }
}

    class Fees{
//        description:Information about the cost of camping
}

    class CampgroundOperatingHours{
//        description:Hours and seasons when the campground is open or closed

    private String string;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }

    class ImagesCampground{
    private String string;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }
