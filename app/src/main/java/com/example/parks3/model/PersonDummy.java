package com.example.parks3.model;

import android.net.Uri;

import java.net.URI;
import java.util.ArrayList;

public class PersonDummy {
    private String originalName;
    private Gender gender;
    private ArrayList<Image> images=new ArrayList<>();

    public PersonDummy(String originalName, Gender gender, ArrayList<Image> images) {
        this.originalName = originalName;
        this.gender = gender;
        this.images=images;
    }

    public String getOriginalName() {
        return originalName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<Image> getImages() {
        return images;
    }
}

