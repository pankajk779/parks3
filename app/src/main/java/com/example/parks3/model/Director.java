package com.example.parks3.model;

public class Director {

    private String name;
    private Gender gender;

    public Director(String originalName, String characterName, Gender gender) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
