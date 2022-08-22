package com.example.parks3.model;

import android.media.MediaExtractor;

import java.util.ArrayList;

public class Movie {
    String cast;
    private String movieName, synopsis, releaseDate;
    private ArrayList<Actor> actors=new ArrayList<Actor>();
    private ArrayList<Producer> producers=new ArrayList<>();
    private ArrayList<Director> directors=new ArrayList<>();

    public Movie(String movieName, String synopsis, String releaseDate, String cast, ArrayList<Producer> producers, ArrayList<Director> directors) {
        this.movieName = movieName;
        this.synopsis = synopsis;
        this.releaseDate = releaseDate;
        this.cast = cast;
        this.producers = producers;
        this.directors = directors;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public ArrayList<Producer> getProducers() {
        return producers;
    }

    public void setProducers(ArrayList<Producer> producers) {
        this.producers = producers;
    }

    public ArrayList<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(ArrayList<Director> directors) {
        this.directors = directors;
    }
}
