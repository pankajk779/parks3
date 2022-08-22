package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class Tours {

    private List<Topics> topics;
    private List<RelatedParks> park;
    private List<Activities> activities;
    private String durationMax;
//    example: 120
    private List<Stops> stops;

    private String durationUnit;
//    example: m
    private String title;
//    example: API Test

    private List<Images> images;

    private List<TagsTours>tags;

    private String id;
//    example: 6880801D-EDC4-00AF-FBD5EAFFB3B7FD32

    private String description;
//    example: A tour that exists purely to ensure tours show up in the API successfully.

    private String durationMin;
//    example: 60

    static Tours fill(JSONObject jsonobj) throws JSONException {
        Tours entity = new Tours();
        if (jsonobj.has("topics")) {
            entity.setTopics((List<Topics>) jsonobj.getJSONArray("topics"));
        }
        if (jsonobj.has("park")) {
            entity.setPark((List<RelatedParks>) jsonobj.getJSONArray("park"));
        }
        if (jsonobj.has("activities")) {
            entity.setActivities((List<Activities>) jsonobj.getJSONArray("activities"));
        }
        if (jsonobj.has("durationMax")) {
            entity.setDurationMax(jsonobj.getString("durationMax"));
        }
        if (jsonobj.has("stops")) {
            entity.setStops((List<Stops>) jsonobj.getJSONArray("stops"));
        }
        if (jsonobj.has("durationUnit")) {
            entity.setDurationUnit(jsonobj.getString("durationUnit"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("images")) {
            entity.setImages((List<Images>) jsonobj.getJSONArray("images"));
        }
        if (jsonobj.has("tags")) {
            entity.setTags((List<TagsTours>) jsonobj.getJSONArray("tags"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("durationMin")) {
            entity.setDurationMin(jsonobj.getString("durationMin"));
        }
        return entity;
    }

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public List<RelatedParks> getPark() {
        return park;
    }

    public void setPark(List<RelatedParks> park) {
        this.park = park;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    public String getDurationMax() {
        return durationMax;
    }

    public void setDurationMax(String durationMax) {
        this.durationMax = durationMax;
    }

    public List<Stops> getStops() {
        return stops;
    }

    public void setStops(List<Stops> stops) {
        this.stops = stops;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
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

    public List<TagsTours> getTags() {
        return tags;
    }

    public void setTags(List<TagsTours> tags) {
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(String durationMin) {
        this.durationMin = durationMin;
    }
}

class Stops{

        private String significance;
        private String assetId;
//        example: CD74CF08-6C88-418B-A2C2-F7B957975C76

        private String assetName;
//        example: Savage River

        private String assetType;
//        example: Place

        private String id;
//        example: 6886BB60-C11B-1A87-589FEABEE387E9E4

        private String ordinal;
//        example: 1

        private String directionsToNextStop;

    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public String getDirectionsToNextStop() {
        return directionsToNextStop;
    }

    public void setDirectionsToNextStop(String directionsToNextStop) {
        this.directionsToNextStop = directionsToNextStop;
    }
}

class TagsTours{

    private String id;
//    example: 6880801D-EDC4-00AF-FBD5EAFFB3B7FD32

    private String description;
//    example: A tour that exists purely to ensure tours show up in the API successfully.

    private String durationMin;
//    example: 60


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(String durationMin) {
        this.durationMin = durationMin;
    }
}
