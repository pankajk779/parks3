package com.example.parks3.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

class VisitorCenters {

   private String url;
   //URL for the Visitor Center

   private String name;
   //Unique identifier for the Visitor Center

   private String id;
   //Name of the Visitor Center

   private String directionsInfo;
//   General overview of how to get to the facility

   private List<Addresses> addresses;

   private String latitude;
//   example: 63.7308262

   private List<OperatingHours> operatingHours;

   private String longitude;
//   example: -148.9171829

   private List<ContactsVisitorCenters> contacts;

   private String geometryPoiId;
//   example: 8793be28-0d54-493f-8556-877e7ecbe937
//   Id for Geometry Point of Interest

   private String parkCode;
//   A variable width character code used to identify a specific park

   private String latLong;
//   example: {lat:63.7308262, lng:-148.9171829}
//   Facility latitude and longitude

   private String directionsUrl;
//   Link to page, if available, that provides additional detail on getting to the facility

   private String description;
//   General description of the facility

   static VisitorCenters fill(JSONObject jsonobj) throws JSONException {
      VisitorCenters entity = new VisitorCenters();
      if (jsonobj.has("url")) {
         entity.setUrl(jsonobj.getString("url"));
      }
      if (jsonobj.has("name")) {
         entity.setName(jsonobj.getString("name"));
      }
      if (jsonobj.has("id")) {
         entity.setId(jsonobj.getString("id"));
      }
      if (jsonobj.has("directionsInfo")) {
         entity.setDirectionsInfo(jsonobj.getString("directionsInfo"));
      }
      if (jsonobj.has("addresses")) {
         entity.setAddresses((List<Addresses>) jsonobj.getJSONArray("addresses"));
      }
      if (jsonobj.has("latitude")) {
         entity.setLatitude(jsonobj.getString("latitude"));
      }
      if (jsonobj.has("operatingHours")) {
         entity.setOperatingHours((List<OperatingHours>) jsonobj.getJSONArray("operatingHours"));
      }
      if (jsonobj.has("longitude")) {
         entity.setLongitude(jsonobj.getString("longitude"));
      }
      if (jsonobj.has("contacts")) {
         entity.setContacts((List<ContactsVisitorCenters>) jsonobj.getJSONArray("contacts"));
      }
      if (jsonobj.has("geometryPoiId")) {
         entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
      }
      if (jsonobj.has("parkCode")) {
         entity.setParkCode(jsonobj.getString("parkCode"));
      }
      if (jsonobj.has("latLong")) {
         entity.setLatLong(jsonobj.getString("latLong"));
      }
      if (jsonobj.has("directionsUrl")) {
         entity.setDirectionsUrl(jsonobj.getString("directionsUrl"));
      }
      if (jsonobj.has("description")) {
         entity.setDescription(jsonobj.getString("description"));
      }
      return entity;
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

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getDirectionsInfo() {
      return directionsInfo;
   }

   public void setDirectionsInfo(String directionsInfo) {
      this.directionsInfo = directionsInfo;
   }

   public List<Addresses> getAddresses() {
      return addresses;
   }

   public void setAddresses(List<Addresses> addresses) {
      this.addresses = addresses;
   }

   public String getLatitude() {
      return latitude;
   }

   public void setLatitude(String latitude) {
      this.latitude = latitude;
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

   public List<ContactsVisitorCenters> getContacts() {
      return contacts;
   }

   public void setContacts(List<ContactsVisitorCenters> contacts) {
      this.contacts = contacts;
   }

   public String getGeometryPoiId() {
      return geometryPoiId;
   }

   public void setGeometryPoiId(String geometryPoiId) {
      this.geometryPoiId = geometryPoiId;
   }

   public String getParkCode() {
      return parkCode;
   }

   public void setParkCode(String parkCode) {
      this.parkCode = parkCode;
   }

   public String getLatLong() {
      return latLong;
   }

   public void setLatLong(String latLong) {
      this.latLong = latLong;
   }

   public String getDirectionsUrl() {
      return directionsUrl;
   }

   public void setDirectionsUrl(String directionsUrl) {
      this.directionsUrl = directionsUrl;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}

class ContactsVisitorCenters{

   private String contacts;
//   description:Information about contacting staff at the facility
//   properties:Map { "phoneNumbers": Map { "type": "array", "items": Map { "type": "object", "properties": Map { "phoneNumber": Map { "type": "string" }, "description": Map { "type": "string" }, "extension": Map { "type": "string" }, "type": Map { "type": "string", "enum": List [ "Voice", "Fax", "TTY" ] } } } }, "emailAddresses": Map { "type": "array", "items": Map { "type": "object", "properties": Map { "emailAddress": Map { "type": "string" }, "description": Map { "type": "string" } } } } }

}
