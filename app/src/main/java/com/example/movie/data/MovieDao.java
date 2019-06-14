package com.example.movie.data;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.movie.data.entities.MovieEntityList;

@Dao
public interface MovieDao {

    @Query("SELECT * FROM movielist")
    LiveData<List<MovieEntityList>> getMovieList();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertMovieList(List<MovieEntityList> movieEntities);

    @Query("SELECT * FROM `movieList` WHERE `isToWatch`;")
    LiveData<List<MovieEntityList>> getToWatchMovieList();
}
