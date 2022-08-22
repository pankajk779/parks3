package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class ParkingLot {

    private String managedByOrganization;
//    example: NPS
//    which organization manages this parkinglot

    private String name;
//    Parkinglot name

    private String latitude;
//    The latitude of the parkinglot location

    private List<FeesParkingLot> fees;
    private List<AccessibilityParkingLot> accessibility;
    private List<OperatingHours> operatingHours;

    private String longitude;
//    The longitude of the parkinglot location

    private List<Contacts> contacts;

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String webcamUrl;
//    URL of parkinglot webcam

    private String altName;
//    alternative names for this parklinglot

    private List<Images> images;

    private String timeZone;
//    example: ET
//    the time zone in which this parkinglot is found

    private String id;
//    Unique identifier for the parking lot

    private String description;
//    General description of the parkinglot

    private List<RelatedParks> relatedParks;
    private List<LiveStatusParkingLot> liveStatus;

    static ParkingLot fill(JSONObject jsonobj) throws JSONException {
        ParkingLot entity = new ParkingLot();
        if (jsonobj.has("managedByOrganization")) {
            entity.setManagedByOrganization(jsonobj.getString("managedByOrganization"));
        }
        if (jsonobj.has("name")) {
            entity.setName(jsonobj.getString("name"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getString("latitude"));
        }
        if (jsonobj.has("fees")) {
            entity.setFees((List<FeesParkingLot>) jsonobj.getJSONArray("fees"));
        }
        if (jsonobj.has("accessibility")) {
            entity.setAccessibility((List<AccessibilityParkingLot>) jsonobj.getJSONArray("accessibility"));
        }
        if (jsonobj.has("operatingHours")) {
            entity.setOperatingHours((List<OperatingHours>) jsonobj.getJSONArray("operatingHours"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getString("longitude"));
        }
        if (jsonobj.has("contacts")) {
            entity.setContacts((List<Contacts>) jsonobj.getJSONArray("contacts"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("webcamUrl")) {
            entity.setWebcamUrl(jsonobj.getString("webcamUrl"));
        }
        if (jsonobj.has("altName")) {
            entity.setAltName(jsonobj.getString("altName"));
        }
        if (jsonobj.has("images")) {
            entity.setImages((List<Images>) jsonobj.getJSONArray("images"));
        }
        if (jsonobj.has("timeZone")) {
            entity.setTimeZone(jsonobj.getString("timeZone"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("relatedParks")) {
            entity.setRelatedParks((List<RelatedParks>) jsonobj.getJSONArray("relatedParks"));
        }
        if (jsonobj.has("liveStatus")) {
            entity.setLiveStatus((List<LiveStatusParkingLot>) jsonobj.getJSONArray("liveStatus"));
        }
        return entity;
    }

    public String getManagedByOrganization() {
        return managedByOrganization;
    }

    public void setManagedByOrganization(String managedByOrganization) {
        this.managedByOrganization = managedByOrganization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public List<FeesParkingLot> getFees() {
        return fees;
    }

    public void setFees(List<FeesParkingLot> fees) {
        this.fees = fees;
    }

    public List<AccessibilityParkingLot> getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(List<AccessibilityParkingLot> accessibility) {
        this.accessibility = accessibility;
    }

    public List<OperatingHours> getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(List<OperatingHours> operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public String getGeometryPoiId() {
        return geometryPoiId;
    }

    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }

    public String getWebcamUrl() {
        return webcamUrl;
    }

    public void setWebcamUrl(String webcamUrl) {
        this.webcamUrl = webcamUrl;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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

    public List<RelatedParks> getRelatedParks() {
        return relatedParks;
    }

    public void setRelatedParks(List<RelatedParks> relatedParks) {
        this.relatedParks = relatedParks;
    }

    public List<LiveStatusParkingLot> getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(List<LiveStatusParkingLot> liveStatus) {
        this.liveStatus = liveStatus;
    }
}

class FeesParkingLot{

        private String cost;
//        example: 30

        private String description;
//        example: From May to October, entrance into the park including Cadillac Mountain and Blue Hill Overlook require paying a park entrance fee. Always display your pass in your vehicle when parking in the park. Please visit our Fees & Passes page for more information.

        private String title;
//        example: Acadia Entrance Fee - Per person or vehicle


    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class AccessibilityParkingLot{

    private String adaFacilitiesDescription;
//    example:

    private Boolean isLotAccessibleToDisabled;
//    example: true

    private int numberOfOversizeVehicleSpaces;
//    example: 0

    private int numberofAdaSpaces;
//    example: 6

    private int numberofAdaStepFreeSpaces;
//    example: 6

    private int numberofAdaVanAccessbileSpaces;
//    example: 6

    private int totalSpaces;
//    example: 145


    public String getAdaFacilitiesDescription() {
        return adaFacilitiesDescription;
    }

    public void setAdaFacilitiesDescription(String adaFacilitiesDescription) {
        this.adaFacilitiesDescription = adaFacilitiesDescription;
    }

    public Boolean getLotAccessibleToDisabled() {
        return isLotAccessibleToDisabled;
    }

    public void setLotAccessibleToDisabled(Boolean lotAccessibleToDisabled) {
        isLotAccessibleToDisabled = lotAccessibleToDisabled;
    }

    public int getNumberOfOversizeVehicleSpaces() {
        return numberOfOversizeVehicleSpaces;
    }

    public void setNumberOfOversizeVehicleSpaces(int numberOfOversizeVehicleSpaces) {
        this.numberOfOversizeVehicleSpaces = numberOfOversizeVehicleSpaces;
    }

    public int getNumberofAdaSpaces() {
        return numberofAdaSpaces;
    }

    public void setNumberofAdaSpaces(int numberofAdaSpaces) {
        this.numberofAdaSpaces = numberofAdaSpaces;
    }

    public int getNumberofAdaStepFreeSpaces() {
        return numberofAdaStepFreeSpaces;
    }

    public void setNumberofAdaStepFreeSpaces(int numberofAdaStepFreeSpaces) {
        this.numberofAdaStepFreeSpaces = numberofAdaStepFreeSpaces;
    }

    public int getNumberofAdaVanAccessbileSpaces() {
        return numberofAdaVanAccessbileSpaces;
    }

    public void setNumberofAdaVanAccessbileSpaces(int numberofAdaVanAccessbileSpaces) {
        this.numberofAdaVanAccessbileSpaces = numberofAdaVanAccessbileSpaces;
    }

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public void setTotalSpaces(int totalSpaces) {
        this.totalSpaces = totalSpaces;
    }
}

class LiveStatusParkingLot{

    private String description;
    private int estimatedWaitTimeInMinutes;
//    example: 0

    private String expirationDate;

    private Boolean isActive;
//    example: true

    private String occupancy;
//    example: Light


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimatedWaitTimeInMinutes() {
        return estimatedWaitTimeInMinutes;
    }

    public void setEstimatedWaitTimeInMinutes(int estimatedWaitTimeInMinutes) {
        this.estimatedWaitTimeInMinutes = estimatedWaitTimeInMinutes;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }
}
