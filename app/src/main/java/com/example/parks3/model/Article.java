package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class Article {
    private String url;
    //Link to article

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String title;
//    Article title

    private String id;
//    Unique identifier for this article

    private String listingDescription;
//    Short description of the content

    private List<ListingImage> listingImages;
    private List<RelatedParks> relatedParks;

    private String latLong;
//    geolocation coordinates

    private double latitude;
    private double longitude;

    static Article fill(JSONObject jsonobj) throws JSONException {
        Article entity = new Article();
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("listingDescription")) {
            entity.setListingDescription(jsonobj.getString("listingDescription"));
        }
        if (jsonobj.has("listingImages")) {
            entity.setListingImages((List<ListingImage>) jsonobj.getJSONArray("listingImages"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParks>) jsonobj.getJSONArray("relatedParks"));
        }
        if (jsonobj.has("latLong")) {
            entity.setLatLong(jsonobj.getString("latLong"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getDouble("latitude"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getDouble("longitude"));
        }
        return entity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListingDescription() {
        return listingDescription;
    }

    public void setListingDescription(String listingDescription) {
        this.listingDescription = listingDescription;
    }

    public List<ListingImage> getListingImages() {
        return listingImages;
    }

    public void setListingImages(List<ListingImage> listingImages) {
        this.listingImages = listingImages;
    }

    public List<RelatedParks> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParks> relatedParks) {
        this.relatedParks = relatedParks;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

class RelatedParks{
    //description:Parks that have a tie to this asset in a comma-delimited list

    private String states;
    private String parkCode;
    private String designation;
    private String fullName;
    private String url;
    private String name;

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ListingImage{
    //description:Small image that accompanies the short description

    private String credit;
    private String altText;
    private String title;
    private String description;
    private String caption;
    private String url;

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
