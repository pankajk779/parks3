package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class NewsRelease {

    private String abstract1;
//    Short description of news release content

    private String latitude;
//    The latitude of the news release location

    private String url;
//    Link to full news release

    private String longitude;
//    The longitude of the news release location

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String releasedate;
//            ($date-time)
//    Date news release was released

    private String parkCode;
//    A variable width character code that uniquely identifies a specific park

    private String title;
//    News release title

    private List<RelatedOrgs> relatedOrgs;

    private String id;
//    Unique identifier for the news release

    private List<Images> image;

    private List<RelatedParks> relatedParks;

    static NewsRelease fill(JSONObject jsonobj) throws JSONException {
        NewsRelease entity = new NewsRelease();
        if (jsonobj.has("abstract1")) {
            entity.setAbstract1(jsonobj.getString("abstract1"));
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
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("releasedate")) {
            entity.setReleasedate(jsonobj.getString("releasedate"));
        }
        if (jsonobj.has("parkCode")) {
            entity.setParkCode(jsonobj.getString("parkCode"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("relatedOrgs")) {
            entity.setRelatedOrgs((List<RelatedOrgs>) jsonobj.getJSONArray("relatedOrgs"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("image")) {
            entity.setImage((List<Images>) jsonobj.getJSONArray("image"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParks>) jsonobj.getJSONArray("relatedParks"));
        }
        return entity;
    }


    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
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

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<RelatedOrgs> getRelatedOrgs() {
        return relatedOrgs;
    }

    public void setRelatedOrgs(List<RelatedOrgs> relatedOrgs) {
        this.relatedOrgs = relatedOrgs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Images> getImage() {
        return image;
    }

    public void setImage(List<Images> image) {
        this.image = image;
    }

    public List<RelatedParks> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParks> relatedParks) {
        this.relatedParks = relatedParks;
    }
}

class RelatedOrgs{

    private String id;
//    example: 1ED09DFF-E65B-425F-8596-7087FAC00343

    private String url;
//    example: http://www.nps.gov/orgs/1563/

    private String name;
//    example: Investigative Services


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
