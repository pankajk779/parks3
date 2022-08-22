package com.example.parks3.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Images
{
    //description:Park images

   private String credit;
   private String title;
   private String altText;
   private String caption;
   private String url;
   private String description;
   private List<Crops> crops;
   private String path;
   private String imageId;
   private String ordinal;


    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
    public String getImageId() { return imageId; }
    public void setImageId(String imageId) { this.imageId = imageId; }
    public String getOrdinal() { return ordinal; }
    public void setOrdinal(String ordinal) { this.ordinal = ordinal; }
    public void setCredit(String credit){
       this.credit = credit;
   }
    public String getCredit(){
       return this.credit;
   }
    public void setTitle(String title){
       this.title = title;
   }
    public String getTitle(){
       return this.title;
   }
    public void setAltText(String altText){
       this.altText = altText;
   }
    public String getAltText(){
       return this.altText;
   }
    public void setCaption(String caption){
       this.caption = caption;
   }
    public String getCaption(){
       return this.caption;
   }
    public void setUrl(String url){
       this.url = url;
   }
    public String getUrl(){
       return this.url;
   }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<Crops> getCrops() { return crops; }
    public void setCrops(List<Crops> crops) { this.crops = crops; }

    static Images fill(JSONObject jsonobj) throws JSONException {
        Images entity = new Images();
        if (jsonobj.has("credit")) {
            entity.setCredit(jsonobj.getString("credit"));
        }
        if (jsonobj.has("path")) {
            entity.setPath(jsonobj.getString("path"));
        }
        if (jsonobj.has("imageId")) {
            entity.setImageId(jsonobj.getString("imageId"));
        }
        if (jsonobj.has("ordinal")) {
            entity.setOrdinal(jsonobj.getString("ordinal"));
        }
        if (jsonobj.has("title")) {
            entity.setTitle(jsonobj.getString("title"));
        }
        if (jsonobj.has("altText")) {
            entity.setAltText(jsonobj.getString("altText"));
        }
        if (jsonobj.has("caption")) {
            entity.setCaption(jsonobj.getString("caption"));
        }
        if (jsonobj.has("url")) {
            entity.setUrl(jsonobj.getString("url"));
        }
        if(jsonobj.has("description")){
            entity.setDescription(jsonobj.getString("description"));
        }
        if(jsonobj.has("crops")){
            entity.setCrops(Crops.fillList(jsonobj.getJSONArray("crops")));
        }
        return entity;
    }

    static List<Images> fillList(JSONArray jsonarray) throws JSONException {
        if (jsonarray == null || jsonarray.length() == 0)
            return null;
        List<Images> olist = new ArrayList<Images>();
        for (int i = 0; i < jsonarray.length(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }


}

class Crops{
    private String crops;

    public String getCrops() {
        return crops;
    }
    public void setCrops(String crops) {
        this.crops = crops;
    }

    static Crops fill(JSONObject jsonObject) throws JSONException{
        Crops entity=new Crops();
        if(jsonObject.has("crops")){
            entity.setCrops("crops");
        }
        return entity;
    }

    static List<Crops> fillList(JSONArray jsonArray) throws JSONException{
        if(jsonArray.length()==0 || jsonArray==null)
            return null;
        List<Crops> oList= new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            oList.add(fill(jsonArray.getJSONObject(i)));
        }
        return oList;
    }

}
