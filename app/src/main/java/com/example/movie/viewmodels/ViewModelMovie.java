package com.example.movie.viewmodels;

import android.content.Context;
import android.util.Log;


import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.movie.data.Repository;
import com.example.movie.data.entities.MovieEntityList;

public class ViewModelMovie extends ViewModel {
    private Repository repository;
    LiveData<List<MovieEntityList>> movieData;

    public void loadData(Context context, String title, String API_KEY) {
        if(movieData == null) {
            Log.e("fdd","viewmodel");
            repository = new Repository(context);
            // TODO
            movieData = repository.getMovieDetail(title, API_KEY);
        }
    }

    public LiveData<List<MovieEntityList>> getMovieDetailData() {
        return movieData;
    }
}