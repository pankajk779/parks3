package com.example.parks3.model;

import android.nfc.Tag;
import android.provider.ContactsContract;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Events {

    private String datetimeupdated;
    private String infourl;
//    URL for more information about the event

    private String sitetype;
//    Site type of the associated site for event

    private String regresurl;
//    URL for required reservation or registration for event

    private String recurrencedatestart;
//    ($date-time)
//    Date the event recurrence starts

    private String parkfullname;
//    Name and designation of the park associated with event

    private String isallday;
//    The event takes place all day

    private List<Dates> dates;
    private List<Times> times;

    private String createuser;

    private String contactname;
//    Name of event contact

    private String latitude;
//    The latitude of the event location

    private String recurrencerule;
//    Recurrence rule for event

    private String contacttelephoneNumber;
//    Phone number for event contact

    private String dateend;
//    ($date-time)
//    End date for event

    private String datetimecreated;
    private String date;
//    ($date-time)
//    Date of next upcoming event

    private String longitude;
//    The longitude of the event location

    private String isrecurring;
//    The event has recurrence

    private String geometryPoiId;
//    example: 8793be28-0d54-493f-8556-877e7ecbe937
//    Id for Geometry Point of Interest

    private String feeinfo;
//    Fee information for event

    private String imageidlist;
    private String datestart;
//    ($date-time)
//    Start date for event

    private String sitecode;
//    Site code of the associated site for event

    private String eventid;
//    example: 0

    private String isregresrequired;
//    The event requires registration or reservation

    private String location;
//    The location the event takes place

    private String isfree;
//    The event is free

    private String portalname;
//    Name of the portal site associated with event

    private String subjectname;
//    Name of associated subject site for event

    private String contactemailaddress;
//    Email address for event contact

    private String title;
//    Event title

    private List<ImagesEvents> images;
    private List<TagsEvents> tags;
    private List<TypesEvents> types;

    private String categoryid;
//    example: 1

    private String regresinfo;
//    Additional information on required reservation or registration for event

    private String timeinfo;
//    Additional information about times for event

    private String id;
//    example: F0092036-921D-2344-8498FB0012847F3C
//    Unique identifier for this event

    private String description;
//    Event description

    private String recurrencedateend;
//    ($date-time)
//    Date the event recurrence ends

    private String category;
//    Category for event

    private String organizationname;
//    Name of the organization associated with event

     public static Events fill(JSONObject jsonobj) throws JSONException {
        Events entity = new Events();
        if (jsonobj.has("datetimeupdated")) {
            entity.setDatetimeupdated(jsonobj.getString("datetimeupdated"));
        }
        if (jsonobj.has("infourl")) {
            entity.setInfourl(jsonobj.getString("infourl"));
        }
        if (jsonobj.has("sitetype")) {
            entity.setSitetype(jsonobj.getString("sitetype"));
        }
        if (jsonobj.has("regresurl")) {
            entity.setRegresurl(jsonobj.getString("regresurl"));
        }
        if (jsonobj.has("recurrencedatestart")) {
            entity.setRecurrencedatestart(jsonobj.getString("recurrencedatestart"));
        }
        if (jsonobj.has("parkfullname")) {
            entity.setParkfullname(jsonobj.getString("parkfullname"));
        }
        if (jsonobj.has("isallday")) {
            entity.setIsallday(jsonobj.getString("isallday"));
        }
        if (jsonobj.has("dates")) {
            JSONArray jsonArray =jsonobj.getJSONArray("dates");
            List<Dates> datesList =new ArrayList<>();
            for (int i = 0; i < jsonArray.length(); i++) {
                Dates dates=new Dates();
                dates.setDates(jsonArray.getString(i));
                datesList.add(dates);
            }
            entity.setDates(datesList);
        }
        if (jsonobj.has("times")) {
            JSONArray jsonArray=jsonobj.getJSONArray("times");
            List<Times> timesList=new ArrayList<>();
            for (int i = 0; i <jsonArray.length() ; i++) {
                JSONObject jsonObject=jsonArray.getJSONObject(i);
                Times times=new Times();
                times.setTimestart(jsonObject.getString("timestart"));
                times.setTimeend(jsonObject.getString("timeend"));
                times.setSunsetend(jsonObject.getString("sunsetend"));
                times.setSunrisestart(jsonObject.getString("sunrisestart"));
                timesList.add(times);
            }
            entity.setTimes(timesList);
        }
        if (jsonobj.has("createuser")) {
            entity.setCreateuser(jsonobj.getString("createuser"));
        }
        if (jsonobj.has("contactname")) {
            entity.setContactname(jsonobj.getString("contactname"));
        }
        if (jsonobj.has("latitude")) {
            entity.setLatitude(jsonobj.getString("latitude"));
        }
        if (jsonobj.has("recurrencerule")) {
            entity.setRecurrencerule(jsonobj.getString("recurrencerule"));
        }
        if (jsonobj.has("contacttelephoneNumber")) {
            entity.setContacttelephoneNumber(jsonobj.getString("contacttelephoneNumber"));
        }
        if (jsonobj.has("dateend")) {
            entity.setDateend(jsonobj.getString("dateend"));
        }
        if (jsonobj.has("datetimecreated")) {
            entity.setDatetimecreated(jsonobj.getString("datetimecreated"));
        }
        if (jsonobj.has("date")) {
            entity.setDate(jsonobj.getString("date"));
        }
        if (jsonobj.has("longitude")) {
            entity.setLongitude(jsonobj.getString("longitude"));
        }
        if (jsonobj.has("isrecurring")) {
            entity.setIsrecurring(jsonobj.getString("isrecurring"));
        }
        if (jsonobj.has("geometryPoiId")) {
            entity.setGeometryPoiId(jsonobj.getString("geometryPoiId"));
        }
        if (jsonobj.has("feeinfo")) {
            entity.setFeeinfo(jsonobj.getString("feeinfo"));
        }
        if (jsonobj.has("imageidlist")) {
            entity.setImageidlist(jsonobj.getString("imageidlist"));
        }
        if (jsonobj.has("datestart")) {
            entity.setDatestart(jsonobj.getString("datestart"));
        }
        if (jsonobj.has("sitecode")) {
            entity.setSitecode(jsonobj.getString("sitecode"));
        }
        if (jsonobj.has("eventid")) {
            entity.setEventid(jsonobj.getString("eventid"));
        }
        if (jsonobj.has("isregresrequired")) {
            entity.setIsregresrequired(jsonobj.getString("isregresrequired"));
        }
        if (jsonobj.has("location")) {
            entity.setLocation(jsonobj.getString("location"));
        }
        if (jsonobj.has("isfree")) {
            entity.setIsfree(jsonobj.getString("isfree"));
        }
        if (jsonobj.has("portalname")) {
            entity.setPortalname(jsonobj.getString("portalname"));
        }
        if (jsonobj.has("subjectname")) {
            entity.setSubjectname(jsonobj.getString("subjectname"));
        }
        if (jsonobj.has("contactemailaddress")) {
            entity.setContactemailaddress(jsonobj.getString("contactemailaddress"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("images")) {
            entity.setImages(ImagesEvents.fillList(jsonobj.getJSONArray("images")));
        }
        if (jsonobj.has("tags")) {
            entity.setTags(TagsEvents.fillList(jsonobj.getJSONArray("tags")));
        }
        if (jsonobj.has("types")) {
            entity.setTypes(TypesEvents.fillList(jsonobj.getJSONArray("types")));
        }
        if (jsonobj.has("categoryid")) {
            entity.setCategoryid(jsonobj.getString("categoryid"));
        }
        if (jsonobj.has("regresinfo")) {
            entity.setRegresinfo(jsonobj.getString("regresinfo"));
        }
        if (jsonobj.has("timeinfo")) {
            entity.setTimeinfo(jsonobj.getString("timeinfo"));
        }
        if (jsonobj.has("id")) {
            entity.setId(jsonobj.getString("id"));
        }
        if (jsonobj.has("description")) {
            entity.setDescription(jsonobj.getString("description"));
        }
        if (jsonobj.has("recurrencedateend")) {
            entity.setRecurrencedateend(jsonobj.getString("recurrencedateend"));
        }
        if (jsonobj.has("category")) {
            entity.setCategory(jsonobj.getString("category"));
        }
        if (jsonobj.has("organizationname")) {
            entity.setOrganizationname(jsonobj.getString("organizationname"));
        }
        return entity;
    }

    public static List<Events> fillList(JSONArray jsonArray)throws JSONException{
         List<Events> eventsList=new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            Events events=fill(jsonArray.getJSONObject(i));
            eventsList.add(events);

        }
        return eventsList;
    }

    public String getDatetimeupdated() {
        return datetimeupdated;
    }
    public void setDatetimeupdated(String datetimeupdated) { this.datetimeupdated = datetimeupdated; }
    public String getInfourl() {
        return infourl;
    }
    public void setInfourl(String infourl) {
        this.infourl = infourl;
    }
    public String getSitetype() {
        return sitetype;
    }
    public void setSitetype(String sitetype) {
        this.sitetype = sitetype;
    }
    public String getRegresurl() {
        return regresurl;
    }
    public void setRegresurl(String regresurl) {
        this.regresurl = regresurl;
    }
    public String getRecurrencedatestart() {
        return recurrencedatestart;
    }
    public void setRecurrencedatestart(String recurrencedatestart) { this.recurrencedatestart = recurrencedatestart; }
    public String getParkfullname() {
        return parkfullname;
    }
    public void setParkfullname(String parkfullname) {
        this.parkfullname = parkfullname;
    }
    public String getIsallday() {
        return isallday;
    }
    public void setIsallday(String isallday) {
        this.isallday = isallday;
    }
    public List<Dates> getDates() {
        return dates;
    }
    public void setDates(List<Dates> dates) {
        this.dates = dates;
    }
    public List<Times> getTimes() {
        return times;
    }
    public void setTimes(List<Times> times) { this.times = times; }
    public String getCreateuser() {
        return createuser;
    }
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }
    public String getContactname() {
        return contactname;
    }
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getRecurrencerule() {
        return recurrencerule;
    }
    public void setRecurrencerule(String recurrencerule) {
        this.recurrencerule = recurrencerule;
    }
    public String getContacttelephoneNumber() {
        return contacttelephoneNumber;
    }
    public void setContacttelephoneNumber(String contacttelephoneNumber) { this.contacttelephoneNumber = contacttelephoneNumber; }
    public String getDateend() {
        return dateend;
    }
    public void setDateend(String dateend) {
        this.dateend = dateend;
    }
    public String getDatetimecreated() {
        return datetimecreated;
    }
    public void setDatetimecreated(String datetimecreated) { this.datetimecreated = datetimecreated; }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getIsrecurring() {
        return isrecurring;
    }
    public void setIsrecurring(String isrecurring) {
        this.isrecurring = isrecurring;
    }
    public String getGeometryPoiId() {
        return geometryPoiId;
    }
    public void setGeometryPoiId(String geometryPoiId) {
        this.geometryPoiId = geometryPoiId;
    }
    public String getFeeinfo() {
        return feeinfo;
    }
    public void setFeeinfo(String feeinfo) {
        this.feeinfo = feeinfo;
    }
    public String getImageidlist() {
        return imageidlist;
    }
    public void setImageidlist(String imageidlist) {
        this.imageidlist = imageidlist;
    }
    public String getDatestart() {
        return datestart;
    }
    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }
    public String getSitecode() {
        return sitecode;
    }

    public void setSitecode(String sitecode) {
        this.sitecode = sitecode;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public String getIsregresrequired() {
        return isregresrequired;
    }

    public void setIsregresrequired(String isregresrequired) {
        this.isregresrequired = isregresrequired;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsfree() {
        return isfree;
    }

    public void setIsfree(String isfree) {
        this.isfree = isfree;
    }

    public String getPortalname() {
        return portalname;
    }

    public void setPortalname(String portalname) {
        this.portalname = portalname;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getContactemailaddress() {
        return contactemailaddress;
    }

    public void setContactemailaddress(String contactemailaddress) {
        this.contactemailaddress = contactemailaddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ImagesEvents> getImages() {
        return images;
    }

    public void setImages(List<ImagesEvents> images) {
        this.images = images;
    }

    public List<TagsEvents> getTags() {
        return tags;
    }

    public void setTags(List<TagsEvents> tags) {
        this.tags = tags;
    }

    public List<TypesEvents> getTypes() {
        return types;
    }

    public void setTypes(List<TypesEvents> types) {
        this.types = types;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getRegresinfo() {
        return regresinfo;
    }

    public void setRegresinfo(String regresinfo) {
        this.regresinfo = regresinfo;
    }

    public String getTimeinfo() {
        return timeinfo;
    }

    public void setTimeinfo(String timeinfo) {
        this.timeinfo = timeinfo;
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

    public String getRecurrencedateend() {
        return recurrencedateend;
    }

    public void setRecurrencedateend(String recurrencedateend) {
        this.recurrencedateend = recurrencedateend;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }
}

class Dates{
//    description:Array of event dates

    private String dates;
//    ($date-time)

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }
}

class ImagesEvents{
//    description:Event image

    private String altText;
//    Image alt text

    private String caption;
//    Image caption

    private String credit;
//    Image credit

    private String imageId;
//    example: 21803

    private String ordinal;
//    example: 0

    private String path;
//    example: /common/uploads/event_calendar/1B853925-E059-D529-0C87BCF597BE816B.jpg

    private String title;
//    Image title

    private String url;
//    Image URL


    public String getAltText() {
        return altText;
    }
    public void setAltText(String altText) {
        this.altText = altText;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit) {
        this.credit = credit;
    }
    public String getImageId() {
        return imageId;
    }
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public String getOrdinal() {
        return ordinal;
    }
    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }


    static ImagesEvents fill(JSONObject jsonObject)throws JSONException{
        ImagesEvents entity=new ImagesEvents();
        if(jsonObject.has("altText")){
            entity.setAltText(jsonObject.getString("altText"));
        }
        if(jsonObject.has("caption")){
            entity.setCaption(jsonObject.getString("caption"));
        }
        if(jsonObject.has("credit")){
            entity.setCredit(jsonObject.getString("credit"));
        }
        if(jsonObject.has("imageId")){
            entity.setImageId(jsonObject.getString("imageId"));
        }
        if(jsonObject.has("ordinal")){
            entity.setOrdinal(jsonObject.getString("ordinal"));
        }
        if(jsonObject.has("path")){
            entity.setPath(jsonObject.getString("path"));
        }
        if(jsonObject.has("title")){
            entity.setTitle(jsonObject.getString("title"));
        }
        if(jsonObject.has("url")){
            entity.setUrl(jsonObject.getString("url"));
        }
        return entity;
    }
    
    
    static List<ImagesEvents> fillList(JSONArray jsonArray)throws JSONException{
        List<ImagesEvents> oList=new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject=jsonArray.getJSONObject(i);
            ImagesEvents imagesEvents=new ImagesEvents();
            imagesEvents=fill(jsonObject);
            oList.add(imagesEvents);
        }
        return oList;
    }




}

class TagsEvents{
//    description:Tags associated with event

    private String string;
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    static TagsEvents fill(String string)throws JSONException{
        TagsEvents tagsEvents=new TagsEvents();
        tagsEvents.setString(string);

        return tagsEvents;
    }

    static List<TagsEvents> fillList(JSONArray jsonArray)throws JSONException{
        List<TagsEvents> oList=new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            TagsEvents tagsEvents=fill(jsonArray.getString(i));
            oList.add(tagsEvents);
        }
        return oList;
    }
}

class TypesEvents{
//    description:Type(s) of event

    private String types;

    public String getTypes() {
        return types;
    }
    public void setTypes(String types) {
        this.types = types;
    }

    static TypesEvents fill(String string)throws JSONException{
        TypesEvents typesEvents=new TypesEvents();
        typesEvents.setTypes(string);

        return typesEvents;
    }

    static List<TypesEvents> fillList(JSONArray jsonArray)throws JSONException{
        List<TypesEvents> oList=new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            TypesEvents typesEvents=fill(jsonArray.getString(i));
            oList.add(typesEvents);
        }
        return oList;
    }

}
