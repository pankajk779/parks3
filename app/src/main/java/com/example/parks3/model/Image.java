package com.example.parks3.model;
   public class Image{
       private String personName;
       private int imageResource;
       private String description;

       public Image(String personName, int imageResource, String description) {
           this.personName=personName;
           this.imageResource=imageResource;
           this.description =description;
       }

       public int getImageResource() {
           return imageResource;
       }

       public void setImageResource(int imageResource) {
           this.imageResource = imageResource;
       }

       public String getDescription() {
           return description;
       }

       public void setDescription(String description) {
           this.description = description;
       }
   }
