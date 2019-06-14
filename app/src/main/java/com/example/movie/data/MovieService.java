package com.example.movie.data;

import com.example.movie.data.entities.Root;
import com.example.movie.data.entities.SearchRoot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieService {
    /*http://www.omdbapi.com/?t=titanic&apikey=caee16f2*/
    /*http://www.omdbapi.com/?s=titanic&apikey=caee16f2*/
    @GET("/?")
    Call<Root> getMovieDetail(@Query("t")String title, @Query("apikey")String API_KEY);
    @GET("/?")
    Call<SearchRoot> getMovieList(@Query("s")String title, @Query("apikey")String API_KEY);

}
