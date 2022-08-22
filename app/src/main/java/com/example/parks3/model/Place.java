package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class Place {

    private String isManagedByNps;
//    example: 1

    private String audioDescription;
    private String latitude;
//    example: 38.871843

    private String managedByOrg;
//    example:

    private String url;
//    example: https://www.nps.gov/places/fox-hollow-trailhead.htm
//    Link to more information about the asset, if available

    private String longitude;
//    example: -78.203699

    private String bodyText;
//    HTML and text

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String npmapId;

    private List<RelatedOrganizations> relatedOrganizations;

    private List<Amenities> amenities;

    private String title;
//    Asset title

    private List<Images> images;

    private String listingDescription;
//    Short description of the content

    private String isOpenToPublic;
//    example: 1

    private List<Tags> tags;

    private String managedByUrl;
//    example:

    private String quickFacts;
//    example:

    private String latLong;
//    example: 38.871843,-78.203699
//    geospatial coordinates

    private String id;
//    example: 770F90DA-DE86-4C87-8F65-00369A398BC9
//    Uniquely identifies place record

    private List<RelatedParks>relatedParks;

    static Place fill(JSONObject jsonobj) throws JSONException {
        Place entity = new Place();
        if (jsonobj.has("isManagedByNps")) {
            entity.setIsManagedByNps(jsonobj.getString("isManagedByNps"));
        }
        if (jsonobj.has("audioDescription")) {
            entity.setAudioDescription(jsonobj.getString("audioDescription"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getString("latitude"));
        }
        if (jsonobj.has("managedByOrg")) {
            entity.setManagedByOrg(jsonobj.getString("managedByOrg"));
        }
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getString("longitude"));
        }
        if (jsonobj.has("bodyText")) {
            entity.setBodyText(jsonobj.getString("bodyText"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("npmapId")) {
            entity.setNpmapId(jsonobj.getString("npmapId"));
        }
        if (jsonobj.has("relatedOrganizations")) {
            entity.setRelatedOrganizations((List<RelatedOrganizations>) jsonobj.getJSONArray("relatedOrganizations"));
        }
        if (jsonobj.has("amenities")) {
            entity.setAmenities((List<Amenities>) jsonobj.getJSONArray("amenities"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("images")) {
            entity.setImages((List<Images>) jsonobj.getJSONArray("images"));
        }
        if (jsonobj.has("listingDescription")) {
            entity.setListingDescription(jsonobj.getString("listingDescription"));
        }
        if (jsonobj.has("isOpenToPublic")) {
            entity.setIsOpenToPublic(jsonobj.getString("isOpenToPublic"));
        }
        if (jsonobj.has("tags")) {
            entity.setTags((List<Tags>) jsonobj.getJSONArray("tags"));
        }
        if (jsonobj.has("managedByUrl")) {
            entity.setManagedByUrl(jsonobj.getString("managedByUrl"));
        }
        if (jsonobj.has("quickFacts")) {
            entity.setQuickFacts(jsonobj.getString("quickFacts"));
        }
        if (jsonobj.has("latLong")) {
            entity.setLatLong(jsonobj.getString("latLong"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParks>) jsonobj.getJSONArray("relatedParks"));
        }
        return entity;
    }

    public String getIsManagedByNps() {
        return isManagedByNps;
    }

    public void setIsManagedByNps(String isManagedByNps) {
        this.isManagedByNps = isManagedByNps;
    }

    public String getAudioDescription() {
        return audioDescription;
    }

    public void setAudioDescription(String audioDescription) {
        this.audioDescription = audioDescription;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getManagedByOrg() {
        return managedByOrg;
    }

    public void setManagedByOrg(String managedByOrg) {
        this.managedByOrg = managedByOrg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public String getNpmapId() {
        return npmapId;
    }

    public void setNpmapId(String npmapId) {
        this.npmapId = npmapId;
    }

    public List<RelatedOrganizations> getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(List<RelatedOrganizations> relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }

    public List<Amenities> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenities> amenities) {
        this.amenities = amenities;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public String getListingDescription() {
        return listingDescription;
    }

    public void setListingDescription(String listingDescription) {
        this.listingDescription = listingDescription;
    }

    public String getIsOpenToPublic() {
        return isOpenToPublic;
    }

    public void setIsOpenToPublic(String isOpenToPublic) {
        this.isOpenToPublic = isOpenToPublic;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getManagedByUrl() {
        return managedByUrl;
    }

    public void setManagedByUrl(String managedByUrl) {
        this.managedByUrl = managedByUrl;
    }

    public String getQuickFacts() {
        return quickFacts;
    }

    public void setQuickFacts(String quickFacts) {
        this.quickFacts = quickFacts;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<RelatedParks> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParks> relatedParks) {
        this.relatedParks = relatedParks;
    }
}
