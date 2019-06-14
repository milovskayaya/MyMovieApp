package com.example.movie.data.entities;

import com.example.movie.data.entities.Ratings;
import com.google.gson.annotations.SerializedName;

import java.util.List;
public class Root
{
    private String Title;

    private String Year;

    private String Rated;

    private String Released;

    private String Runtime;

    private String Genre;

    private String Director;

    private String Writer;

    private String Actors;

    private String Plot;

    private String Language;

    private String Country;

    private String Awards;

    private String Poster;

    private List<com.example.movie.data.entities.Ratings> Ratings;

    private String Metascore;

    private String imdbRating;

    private String imdbVotes;

    private String imdbID;

    private String Type;

    private String DVD;

    private String BoxOffice;

    private String Production;

    private String Website;

    private String Response;

    public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTitle(){
        return this.Title;
    }
    public void setYear(String Year){
        this.Year = Year;
    }
    public String getYear(){
        return this.Year;
    }
    public void setRated(String Rated){
        this.Rated = Rated;
    }
    public String getRated(){
        return this.Rated;
    }
    public void setReleased(String Released){
        this.Released = Released;
    }
    public String getReleased(){
        return this.Released;
    }
    public void setRuntime(String Runtime){
        this.Runtime = Runtime;
    }
    public String getRuntime(){
        return this.Runtime;
    }
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
    public String getGenre(){
        return this.Genre;
    }
    public void setDirector(String Director){
        this.Director = Director;
    }
    public String getDirector(){
        return this.Director;
    }
    public void setWriter(String Writer){
        this.Writer = Writer;
    }
    public String getWriter(){
        return this.Writer;
    }
    public void setActors(String Actors){
        this.Actors = Actors;
    }
    public String getActors(){
        return this.Actors;
    }
    public void setPlot(String Plot){
        this.Plot = Plot;
    }
    public String getPlot(){
        return this.Plot;
    }
    public void setLanguage(String Language){
        this.Language = Language;
    }
    public String getLanguage(){
        return this.Language;
    }
    public void setCountry(String Country){
        this.Country = Country;
    }
    public String getCountry(){
        return this.Country;
    }
    public void setAwards(String Awards){
        this.Awards = Awards;
    }
    public String getAwards(){
        return this.Awards;
    }
    public void setPoster(String Poster){
        this.Poster = Poster;
    }
    public String getPoster(){
        return this.Poster;
    }
    public void setRatings(List<Ratings> Ratings){
        this.Ratings = Ratings;
    }
    public List<Ratings> getRatings(){
        return this.Ratings;
    }
    public void setMetascore(String Metascore){
        this.Metascore = Metascore;
    }
    public String getMetascore(){
        return this.Metascore;
    }
    public void setImdbRating(String imdbRating){
        this.imdbRating = imdbRating;
    }
    public String getImdbRating(){
        return this.imdbRating;
    }
    public void setImdbVotes(String imdbVotes){
        this.imdbVotes = imdbVotes;
    }
    public String getImdbVotes(){
        return this.imdbVotes;
    }
    public void setImdbID(String imdbID){
        this.imdbID = imdbID;
    }
    public String getImdbID(){
        return this.imdbID;
    }
    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return this.Type;
    }
    public void setDVD(String DVD){
        this.DVD = DVD;
    }
    public String getDVD(){
        return this.DVD;
    }
    public void setBoxOffice(String BoxOffice){
        this.BoxOffice = BoxOffice;
    }
    public String getBoxOffice(){
        return this.BoxOffice;
    }
    public void setProduction(String Production){
        this.Production = Production;
    }
    public String getProduction(){
        return this.Production;
    }
    public void setWebsite(String Website){
        this.Website = Website;
    }
    public String getWebsite(){
        return this.Website;
    }
    public void setResponse(String Response){
        this.Response = Response;
    }
    public String getResponse(){
        return this.Response;
    }
}
