package com.example.movie.data;

import android.content.Context;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.example.movie.data.entities.MovieEntityList;

public class LocalDataSource {
    //для работы с базой
    final MovieDB dataBase;

    public  LocalDataSource (Context context) {
        dataBase = Room.databaseBuilder(context,MovieDB.class,"activity_movie_search_list").build();
    }

    public  void  storeMovieList(List<MovieEntityList> root) {
        dataBase.movieDao().insertMovieList(root);
    }

    public LiveData<List<MovieEntityList>> getMovieList() {
        return dataBase.movieDao().getMovieList();
    }
    public LiveData<List<MovieEntityList>> getMovieToWatchList() {
        return dataBase.movieDao().getToWatchMovieList();
    }
}
