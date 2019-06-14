package com.example.movie.data.entities;

import java.util.List;
public class SearchRoot
{
    private List<com.example.movie.data.entities.Search> Search;

    private String totalResults;

    private String Response;

    public void setSearch(List<com.example.movie.data.entities.Search> Search){
        this.Search = Search;
    }
    public List<Search> getSearch(){
        return this.Search;
    }
    public void setTotalResults(String totalResults){
        this.totalResults = totalResults;
    }
    public String getTotalResults(){
        return this.totalResults;
    }
    public void setResponse(String Response){
        this.Response = Response;
    }
    public String getResponse(){
        return this.Response;
    }
}

