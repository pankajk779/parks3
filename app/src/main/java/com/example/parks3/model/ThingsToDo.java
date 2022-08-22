package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class ThingsToDo {

    private String shortDescription;
//    example: The Bannock Ski Trail is a 2 mile (3.2 km) easy ski that follows the old road bed that once used to supply the mining town of Cooke City, Montana.

    private String longDescription;
//    example: <p>The Bannock Ski Trail is a 2 mile (3.2 km) easy ski that follows the old road bed that once used to supply the mining town of Cooke City, Montana. Begin at Warm Creek picnic area, one mile...

    private String isReservationRequired;
//    example: false
//            true or false

    private List<Season> season;
    private List<Topics> topics;

    private String timeOfDayDescription;
    private String locationDescription;
//    example: The trail begins at Warm Creek picnic area and ends in Silver Gate, Montana.

    private String petsDescription;
//    example: Qualified service animals are welcome throughout the park and in all park facilities. However, they must be leashed and under your control at all times. This trail requires a backcountry access pass for service animals.<br />\n<br />\n<br />\n
//    pet-related information for this Thing To Do

    private String durationDescription;
//    example: The duration will vary depending on fitness level, snow conditions, and length of time spent along the trail.

    private String latitude;
    private String activityDescription;
//    example: Easiest

    private List<Activities> activities;

    private String url;
//    example: https://www.nps.gov/thingstodo/yell-bannock-ski-trail.htm
//    URL for this Thing To Do

    private String longitude;
    private String reservationDescription;
    private String arePetsPermitted;
//    example: false
    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String duration;
//    example: 1-2 hours
//    estimated duration of this Thing To Do

    private List<RelatedOrganizations> relatedOrganizations;

    private String location;
    private String feeDescription;
    private String doFeesApply;
//    example: false
//            true or false

    private String title;
//    example: Bannock Ski Trail

    private List<Images> images;
    private List<TimeOfDay> timeOfDay;
    private List<Tags> tags;

    private String seasonDescription;
    private String id;
//    example: 8B175753-D37B-4DD5-BF96-00383F7BB46C
//    UUID for this Thing To Do

    private String arePetsPermittedwithRestrictions;
//    example: false
//            true or false

    private String ageDescription;
    private List<RelatedParks> relatedParks;
    private String accessibilityInformation;
    private String age;

    static ThingsToDo fill(JSONObject jsonobj) throws JSONException {
        ThingsToDo entity = new ThingsToDo();
        if (jsonobj.has("longDescription")) {
            entity.setLongDescription(jsonobj.getString("longDescription"));
        }
        if (jsonobj.has("shortDescription")) {
            entity.setShortDescription(jsonobj.getString("shortDescription"));
        }
        if (jsonobj.has("isReservationRequired")) {
            entity.setIsReservationRequired(jsonobj.getString("isReservationRequired"));
        }
        if (jsonobj.has("season")) {
            entity.setSeason((List<Season>) jsonobj.getJSONArray("season"));
        }
        if (jsonobj.has("topics")) {
            entity.setTopics((List<Topics>) jsonobj.getJSONArray("topics"));
        }
        if (jsonobj.has("timeOfDayDescription")) {
            entity.setTimeOfDayDescription(jsonobj.getString("timeOfDayDescription"));
        }
        if (jsonobj.has("locationDescription")) {
            entity.setLocationDescription(jsonobj.getString("locationDescription"));
        }
        if (jsonobj.has("petsDescription")) {
            entity.setPetsDescription(jsonobj.getString("petsDescription"));
        }
        if (jsonobj.has("durationDescription")) {
            entity.setDurationDescription(jsonobj.getString("durationDescription"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getString("latitude"));
        }
        if (jsonobj.has("activityDescription")) {
            entity.setActivityDescription(jsonobj.getString("activityDescription"));
        }
        if (jsonobj.has("activities")) {
            entity.setActivities((List<Activities>) jsonobj.getJSONArray("activities"));
        }
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getString("longitude"));
        }
        if (jsonobj.has("reservationDescription")) {
            entity.setReservationDescription(jsonobj.getString("reservationDescription"));
        }
        if (jsonobj.has("arePetsPermitted")) {
            entity.setArePetsPermitted(jsonobj.getString("arePetsPermitted"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("duration")) {
            entity.setDuration(jsonobj.getString("duration"));
        }
        if (jsonobj.has("relatedOrganizations")) {
            entity.setRelatedOrganizations((List<RelatedOrganizations>) jsonobj.getJSONArray("relatedOrganizations"));
        }
        if (jsonobj.has("location")) {
            entity.setLocation(jsonobj.getString("location"));
        }
        if (jsonobj.has("feeDescription")) {
            entity.setFeeDescription(jsonobj.getString("feeDescription"));
        }
        if (jsonobj.has("doFeesApply")) {
            entity.setDoFeesApply(jsonobj.getString("doFeesApply"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("images")) {
            entity.setImages((List<Images>) jsonobj.getJSONArray("images"));
        }
        if (jsonobj.has("timeOfDay")) {
            entity.setTimeOfDay((List<TimeOfDay>) jsonobj.getJSONArray("timeOfDay"));
        }
        if (jsonobj.has("tags")) {
            entity.setTags((List<Tags>) jsonobj.getJSONArray("tags"));
        }
        if (jsonobj.has("seasonDescription")) {
            entity.setSeasonDescription(jsonobj.getString("seasonDescription"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("arePetsPermittedwithRestrictions")) {
            entity.setArePetsPermittedwithRestrictions(jsonobj.getString("arePetsPermittedwithRestrictions"));
        }
        if (jsonobj.has("ageDescription")) {
            entity.setAgeDescription(jsonobj.getString("ageDescription"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParks>) jsonobj.getJSONArray("relatedParks"));
        }
        if (jsonobj.has("accessibilityInformation")) {
            entity.setAccessibilityInformation(jsonobj.getString("accessibilityInformation"));
        }
        if (jsonobj.has("age")) {
            entity.setAge(jsonobj.getString("age"));
        }
        return entity;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getIsReservationRequired() {
        return isReservationRequired;
    }

    public void setIsReservationRequired(String isReservationRequired) {
        this.isReservationRequired = isReservationRequired;
    }

    public List<Season> getSeason() {
        return season;
    }

    public void setSeason(List<Season> season) {
        this.season = season;
    }

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public String getTimeOfDayDescription() {
        return timeOfDayDescription;
    }

    public void setTimeOfDayDescription(String timeOfDayDescription) {
        this.timeOfDayDescription = timeOfDayDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getPetsDescription() {
        return petsDescription;
    }

    public void setPetsDescription(String petsDescription) {
        this.petsDescription = petsDescription;
    }

    public String getDurationDescription() {
        return durationDescription;
    }

    public void setDurationDescription(String durationDescription) {
        this.durationDescription = durationDescription;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
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

    public String getReservationDescription() {
        return reservationDescription;
    }

    public void setReservationDescription(String reservationDescription) {
        this.reservationDescription = reservationDescription;
    }

    public String getArePetsPermitted() {
        return arePetsPermitted;
    }

    public void setArePetsPermitted(String arePetsPermitted) {
        this.arePetsPermitted = arePetsPermitted;
    }

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<RelatedOrganizations> getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(List<RelatedOrganizations> relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFeeDescription() {
        return feeDescription;
    }

    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    public String getDoFeesApply() {
        return doFeesApply;
    }

    public void setDoFeesApply(String doFeesApply) {
        this.doFeesApply = doFeesApply;
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

    public List<TimeOfDay> getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(List<TimeOfDay> timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    public void setSeasonDescription(String seasonDescription) {
        this.seasonDescription = seasonDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArePetsPermittedwithRestrictions() {
        return arePetsPermittedwithRestrictions;
    }

    public void setArePetsPermittedwithRestrictions(String arePetsPermittedwithRestrictions) {
        this.arePetsPermittedwithRestrictions = arePetsPermittedwithRestrictions;
    }

    public String getAgeDescription() {
        return ageDescription;
    }

    public void setAgeDescription(String ageDescription) {
        this.ageDescription = ageDescription;
    }

    public List<RelatedParks> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParks> relatedParks) {
        this.relatedParks = relatedParks;
    }

    public String getAccessibilityInformation() {
        return accessibilityInformation;
    }

    public void setAccessibilityInformation(String accessibilityInformation) {
        this.accessibilityInformation = accessibilityInformation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

class Season{
    private String season;
//    example: winter
//    description:

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}

class TimeOfDay{
    private String timeOfDay;
//    example: Day
//    description:


    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}

