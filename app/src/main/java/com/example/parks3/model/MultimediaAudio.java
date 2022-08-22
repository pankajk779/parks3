package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class MultimediaAudio {

    private String callToActionUrl;
    private String permalinkUrl;
//    example: https://www.nps.gov/media/video/view.htm?id=6A437071-C23A-4754-ABBD-47027A1464E0

    private double latitude;
//    example: 36.05662798115783

    private String callToAction;

    private double longitude;
//    example: -112.14375972747803

    private String geometryPoiId;

    private List<SplashImage> splashImage;

    private String transcript;
    private String title;
//    example: Theodore Roosevelt A Complicated Legacy

    private List<Tags> tags;

    private String credit;
//    example: Behind the Scenery Podcast

    private double durationMs;
//    example: 1263020

    private String id;
//    example: 6A437071-C23A-4754-ABBD-47027A1464E0
//    unique identifier for this audio asset

    private List<VersionMultimediaAudio> versions;

    private String description;
//    example: No one is infallible, not our heroes, not our leaders, not even those who pioneered for the preservation of the natural world. President Theodore Roosevelt left a complex legacy. While he helped to create the National Park Service and set out to protect and preserve public lands, he excluded Indigenous voices. What would it be like to sit down and talk with Teddy today? —What would you ask him? In this episode, park visitors share how they respond to this multifaceted human and the legacy he left behind.

    private List<RelatedParksMultimediaAudio> relatedParks;

    static MultimediaAudio fill(JSONObject jsonobj) throws JSONException {
        MultimediaAudio entity = new MultimediaAudio();
        if (jsonobj.has("callToActionUrl")) {
            entity.setCallToActionUrl(jsonobj.getString("callToActionUrl"));
        }
        if (jsonobj.has("permalinkUrl")) {
            entity.setPermalinkUrl(jsonobj.getString("permalinkUrl"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getDouble("latitude"));
        }
        if (jsonobj.has("callToAction")) {
            entity.setCallToAction(jsonobj.getString("callToAction"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getDouble("longitude"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("splashImage")) {
            entity.setSplashImage((List<SplashImage>) jsonobj.getJSONArray("splashImage"));
        }
        if (jsonobj.has("transcript")) {
            entity.setTranscript(jsonobj.getString("transcript"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("tags")) {
            entity.setTags((List<Tags>) jsonobj.getJSONArray("tags"));
        }
        if (jsonobj.has("durationMs")) {
            entity.setDurationMs(jsonobj.getDouble("durationMs"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("versions")) {
            entity.setVersions((List<VersionMultimediaAudio>) jsonobj.getJSONArray("versions"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParksMultimediaAudio>) jsonobj.getJSONArray("relatedParks"));
        }
        return entity;
    }

    public String getCallToActionUrl() {
        return callToActionUrl;
    }

    public void setCallToActionUrl(String callToActionUrl) {
        this.callToActionUrl = callToActionUrl;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public List<SplashImage> getSplashImage() {
        return splashImage;
    }

    public void setSplashImage(List<SplashImage> splashImage) {
        this.splashImage = splashImage;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public double getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(double durationMs) {
        this.durationMs = durationMs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<VersionMultimediaAudio> getVersions() {
        return versions;
    }

    public void setVersions(List<VersionMultimediaAudio> versions) {
        this.versions = versions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RelatedParksMultimediaAudio> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParksMultimediaAudio> relatedParks) {
        this.relatedParks = relatedParks;
    }
}

class SplashImage{

    private String url;
//    example: https://www.nps.gov/common/uploads/ser/park/carl//896018B2-B099-D284-F1497C6FEA15018B/896018B2-B099-D284-F1497C6FEA15018B-large.jpg

}

class Tags{

    private String string;
//    example: List [ "Theodore Roosevelt", "Grand Canyon", "Presidency", "CONSERVATION LEGACY", "NATIVE AMERICAN CULTURE", "legacy and national park service", "diversity", "Native American", "American Indian" ]]

}

class VersionMultimediaAudio {

    private double fileSize;
//    example: 50539839

    private String fileType;
//    example: audio/mp3

    private String url;
//    example: https://www.nps.gov/nps-audiovideo/audiovideo/754f468d-0777-4647-b64b-d59c2c7803bd.mp3

}

class RelatedParksMultimediaAudio{

    private String states;
//    example: AZ

    private String parkCode;
//    example: grca

    private String designation;
//    example: National Park

}
