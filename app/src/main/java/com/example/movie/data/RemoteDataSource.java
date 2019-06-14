package com.example.movie.data;

import com.example.movie.data.entities.Root;
import com.example.movie.data.entities.SearchRoot;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteDataSource {
    // для работы с ретрофитом

    private String API_KEY;
    private MovieService movieService;

    public RemoteDataSource() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.omdbapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        movieService = retrofit.create(MovieService.class);
    }

    public SearchRoot getMovieList(String title,String API_KEY){
        Call<SearchRoot> call = movieService.getMovieList(title,API_KEY);
        try {
            Response<SearchRoot> response = call.execute();
            Log.e("gffgfg","" + response.raw().toString());

            if (response.isSuccessful()) {
                return response.body();
            }
        } catch (IOException ioex) {
            Log.e("Remote","IOEX" + ioex);
        }

        return null;
    }

    public Root getMovieDetail(String title,String API_KEY){
        Call<Root> call = movieService.getMovieDetail(title,API_KEY);
        try {
            Response<Root> response = call.execute();
            Log.e("Message", "" + response.raw().toString());
            if (response.isSuccessful()) {
                return response.body();
            } else {
                Log.e("fdfd", "" + response.raw().request().toString());
            }
        } catch(IOException ioex) {
            Log.e("Remote","IOEX" + ioex);
        }
        return null;
    }

}
