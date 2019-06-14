package com.example.movie.data.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "movielist")
public class MovieEntityList {

    @PrimaryKey
    public int id;

    public String Title;

    public String Year;

    public String imdbID;

    public String Type;

    public String Poster;

    public String Rated;

    public String Released;

    public String Runtime;

    public String Genre;

    public String Director;

    public String Writer;

    public String Actors;

    public String Plot;

    public String Language;

    public String Country;

    public String Awards;

    public String imdbRating;

    public boolean isToWatch;


}