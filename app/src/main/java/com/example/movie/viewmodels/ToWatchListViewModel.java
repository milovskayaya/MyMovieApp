package com.example.movie.viewmodels;

import android.content.Context;

import com.example.movie.R;
import com.example.movie.data.MovieApp;
import com.example.movie.data.Repository;
import com.example.movie.data.entities.MovieEntityList;

import java.util.List;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ToWatchListViewModel extends ViewModel {
    private Repository repository;
    LiveData<List<MovieEntityList>> movieData;

    public void loadData(Context context,String title, String API_KEY){
        if (movieData == null) {
            repository = ((MovieApp)context.getApplicationContext()).getRepository();
            movieData = repository.getToWatchList(title, API_KEY);
//            repository.sheduleUpdate();
        }
    }

    public LiveData<List<MovieEntityList>> getMovieData() {
        return movieData;
    }
}