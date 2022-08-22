package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class People {

    private String middleName;
//    example: Cushman
    private String lastName;
//    example: Fryer

    private String latitude;
//    example:

    private String url;
//    Link to more information about the asset, if available

    private String longitude;
    private String bodyText;
//    example: <p>Though trained as an actress, <strong>Pauline Cushman-Fryer</strong>'s legacy is her service as a spy for the Union during the Civil War...

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private List<RelatedOrganizations> relatedOrganizations;

    private String title;
//    example: Pauline Cushman-Fryer
//    Asset title

    private List<Images> images;

    private String listingDescription;
//    example: Actress and Civil War spy, Pauline Cushman-Fryer narrowly escaped execution for her service to the Union cause. Undercover in Tennessee she performed an illness to escape hanging. She is buried in the Officer's section of the San Francisco National Cemetery at the Presidio.
//    Short description of the content

    private List<QuickFacts> quickFacts;

    private String latLong;
//    geospatial coordinates

    private String id;
//    example: 7013F68B-9DAC-4C96-B1C5-0256CC6D1494
//    Uniquely identifies person record

    private String firstName;
//    example: Pauline

    private List<RelatedParksPeople> relatedParks;

    static People fill(JSONObject jsonobj) throws JSONException {
        People entity = new People();
        if (jsonobj.has("middleName")) {
            entity.setMiddleName(jsonobj.getString("middleName"));
        }
        if (jsonobj.has("lastName")) {
            entity.setLastName(jsonobj.getString("lastName"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getString("latitude"));
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
        if (jsonobj.has("relatedOrganizations")) {
            entity.setRelatedOrganizations((List<RelatedOrganizations>) jsonobj.getJSONArray("relatedOrganizations"));
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
        if (jsonobj.has("quickFacts")) {
            entity.setQuickFacts((List<QuickFacts>) jsonobj.getJSONArray("quickFacts"));
        }
        if (jsonobj.has("latLong")) {
            entity.setLatLong(jsonobj.getString("latLong"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("firstName")) {
            entity.setFirstName(jsonobj.getString("firstName"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParksPeople>) jsonobj.getJSONArray("relatedParks"));
        }
        return entity;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

    public List<RelatedOrganizations> getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(List<RelatedOrganizations> relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
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

    public List<QuickFacts> getQuickFacts() {
        return quickFacts;
    }

    public void setQuickFacts(List<QuickFacts> quickFacts) {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<RelatedParksPeople> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParksPeople> relatedParks) {
        this.relatedParks = relatedParks;
    }
}

class RelatedOrganizations{
    private String relatedOrganizations;
}

class QuickFacts{

    private String id;
//    example: F7A67C96-173F-4675-B374-7E3D3A1818B2

    private String value;
//    example: Civil War Spy

    private String name;
//    example: Significance:


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class RelatedParksPeople{

    private List<States> states;
//    example: CA

    private String fullName;
//    example: Golden Gate National Recreation Area

    private String url;
//    example: https://www.nps.gov/goga/index.htm

    private String parkCode;
//    example: goga

    private String designation;
//    example: National Recreation Area

    private String name;
//    example: Golden Gate


    public List<States> getStates() {
        return states;
    }

    public void setStates(List<States> states) {
        this.states = states;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class States{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
