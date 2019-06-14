package com.example.movie.data.entities;

public class Ratings
{
    private String Source;

    private String Value;

    public void setSource(String Source){
        this.Source = Source;
    }
    public String getSource(){
        return this.Source;
    }
    public void setValue(String Value){
        this.Value = Value;
    }
    public String getValue(){
        return this.Value;
    }
}