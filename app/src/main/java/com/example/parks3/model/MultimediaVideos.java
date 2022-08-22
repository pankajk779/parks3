package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class MultimediaVideos {

    private String callToActionURL;
//    example:

    private Boolean audioDescribedBuiltIn;
//    example: false

    private String permalinkUrl;
//    example: https://www.nps.gov/media/video/view.htm?id=CA91ADBF-BCE3-4434-B3D6-7691D7347758

    private String audiodescription;
    private String audioDescriptionUrl;

    private Double latitude;
//    example: 25.48297691345215

    private String callToAction;
//    example:

    private double longitude;
//    example: -80.21793365478516

    private List<CaptionFiles> captionFiles;

    private Boolean hasOpenCaptions;
//    example: false

    private String geometryPoiId;

    private List<SplashImage> splashImage;

    private Boolean isBRoll;
//    example: false

    private String transcript;
//    example: Hi! I'm Park Ranger Astrid Rybeck and together we'll explore the six shipwrecks that make up Biscayne National Park's Maritime...

    private String title;
//    example: Cowboy Gives Tour of Family Homestead

    private List<TagsMultimediaVideos> tags;

    private String credit;
//    example: Thomas M. Strom

    private double durationMs;
//    example: 263000

    private String id;
//    example: CA91ADBF-BCE3-4434-B3D6-7691D7347758

    private List<VersionMultimediaVideo> versions;

    private String description;
//    example: Find out what homesteading means to this cowboy.

    private List<RelatedParksMultimediaVideos> relatedParks;

    static MultimediaVideos fill(JSONObject jsonobj) throws JSONException {
        MultimediaVideos entity = new MultimediaVideos();
        if (jsonobj.has("callToActionURL")) {
            entity.setCallToActionURL(jsonobj.getString("callToActionURL"));
        }
        if (jsonobj.has("audioDescribedBuiltIn")) {
            entity.setAudioDescribedBuiltIn(jsonobj.getBoolean("audioDescribedBuiltIn"));
        }
        if (jsonobj.has("permalinkUrl")) {
            entity.setPermalinkUrl(jsonobj.getString("permalinkUrl"));
        }
        if (jsonobj.has("audiodescription")) {
            entity.setAudiodescription(jsonobj.getString("audiodescription"));
        }
        if (jsonobj.has("audioDescriptionUrl")) {
            entity.setAudioDescriptionUrl(jsonobj.getString("audioDescriptionUrl"));
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
        if (jsonobj.has("captionFiles")) {
            entity.setCaptionFiles((List<CaptionFiles>) jsonobj.getJSONArray("captionFiles"));
        }
        if (jsonobj.has("hasOpenCaptions")) {
            entity.setHasOpenCaptions(jsonobj.getBoolean("hasOpenCaptions"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("splashImage")) {
            entity.setSplashImage((List<SplashImage>) jsonobj.getJSONArray("splashImage"));
        }
        if (jsonobj.has("isBRoll")) {
            entity.setBRoll(jsonobj.getBoolean("isBRoll"));
        }
        if (jsonobj.has("transcript")) {
            entity.setTranscript(jsonobj.getString("transcript"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("tags")) {
            entity.setTags((List<TagsMultimediaVideos>) jsonobj.getJSONArray("tags"));
        }
        if (jsonobj.has("durationMs")) {
            entity.setDurationMs(jsonobj.getDouble("durationMs"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("versions")) {
            entity.setVersions((List<VersionMultimediaVideo>) jsonobj.getJSONArray("versions"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        return entity;
    }

    public String getCallToActionURL() {
        return callToActionURL;
    }

    public void setCallToActionURL(String callToActionURL) {
        this.callToActionURL = callToActionURL;
    }

    public Boolean getAudioDescribedBuiltIn() {
        return audioDescribedBuiltIn;
    }

    public void setAudioDescribedBuiltIn(Boolean audioDescribedBuiltIn) {
        this.audioDescribedBuiltIn = audioDescribedBuiltIn;
    }

    public String getPermalinkUrl() {
        return permalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        this.permalinkUrl = permalinkUrl;
    }

    public String getAudiodescription() {
        return audiodescription;
    }

    public void setAudiodescription(String audiodescription) {
        this.audiodescription = audiodescription;
    }

    public String getAudioDescriptionUrl() {
        return audioDescriptionUrl;
    }

    public void setAudioDescriptionUrl(String audioDescriptionUrl) {
        this.audioDescriptionUrl = audioDescriptionUrl;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
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

    public List<CaptionFiles> getCaptionFiles() {
        return captionFiles;
    }

    public void setCaptionFiles(List<CaptionFiles> captionFiles) {
        this.captionFiles = captionFiles;
    }

    public Boolean getHasOpenCaptions() {
        return hasOpenCaptions;
    }

    public void setHasOpenCaptions(Boolean hasOpenCaptions) {
        this.hasOpenCaptions = hasOpenCaptions;
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

    public Boolean getBRoll() {
        return isBRoll;
    }

    public void setBRoll(Boolean BRoll) {
        isBRoll = BRoll;
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

    public List<TagsMultimediaVideos> getTags() {
        return tags;
    }

    public void setTags(List<TagsMultimediaVideos> tags) {
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

    public List<VersionMultimediaVideo> getVersions() {
        return versions;
    }

    public void setVersions(List<VersionMultimediaVideo> versions) {
        this.versions = versions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RelatedParksMultimediaVideos> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParksMultimediaVideos> relatedParks) {
        this.relatedParks = relatedParks;
    }
}

class CaptionFiles{
    private String language;
//    example: english

    private String fileType;
//    example: text/vtt

    private String url;
//    example: https://www.nps.gov/nps-audiovideo/closed-caption/5E069AB9-EE15-33B2-27A194C84A61BCBE.vtt


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

class TagsMultimediaVideos{
    private String tags;
//    Example:List [ "Biscayne", "national", "park", "introduction", "underwater", "Shipwreck", "ocean", "miami", "homestead", "south", "Florida", "fl", "FLA", "dive", "history", "podcast", "video", "astrid", "rybeck", "bnp", "bisc" ]


    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}

class VersionMultimediaVideo{

    private double fileSizeKb;
//    example: 10012

    private String fileType;
//    example: video/mp4

    private double aspectRatio;
//    example: 1.778

    private double heightPixels;
//    example: 360

    private String url;
//    example: https://www.nps.gov/nps-audiovideo/audiovideo/f0f43726-f2b5-4492-b11c-9e89a13527d9360p.mp4

    private double widthPixels;
//    example: 640


    public double getFileSizeKb() {
        return fileSizeKb;
    }

    public void setFileSizeKb(double fileSizeKb) {
        this.fileSizeKb = fileSizeKb;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public double getHeightPixels() {
        return heightPixels;
    }

    public void setHeightPixels(double heightPixels) {
        this.heightPixels = heightPixels;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getWidthPixels() {
        return widthPixels;
    }

    public void setWidthPixels(double widthPixels) {
        this.widthPixels = widthPixels;
    }
}

class RelatedParksMultimediaVideos{

    private String states;
//    example: NM,TX

    private String parkCode;
//    example: bisc

    private String designation;
//    example: National Park

    private String fullName;
//    example: Biscayne National Park

    private String url;
//    example: https://www.nps.gov/bisc/index.htm

    private String name;
//    example: Biscayne


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


