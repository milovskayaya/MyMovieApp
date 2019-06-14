package com.example.movie.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.movie.data.entities.MovieEntityList;

@Database(entities = {MovieEntityList.class},version = 1,exportSchema = false)
public abstract class MovieDB extends RoomDatabase {
    public abstract MovieDao movieDao();
}