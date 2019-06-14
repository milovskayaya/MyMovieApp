package com.example.movie.viewmodels;

import android.content.Context;

import com.example.movie.R;
import com.example.movie.data.Repository;
import com.example.movie.data.entities.MovieEntityList;

import android.content.Context;
import com.example.movie.data.MovieApp;



import java.util.List;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelMovieList extends ViewModel {
    private Repository repository;
    LiveData<List<MovieEntityList>>  movieData;

    public void loadData(Context context,String title, String API_KEY){
        if (movieData == null) {
            repository = new Repository(context);
            movieData = repository.getMovieSearchList(title, API_KEY);
            //repository.sheduleUpdate()
        }
    }

    public LiveData<List<MovieEntityList>> getMovieData() {
        return movieData;
    }
    public void updatePreferences(MovieEntityList movieEntityList) {
        repository.updatePreferences(movieEntityList);
    }
}

