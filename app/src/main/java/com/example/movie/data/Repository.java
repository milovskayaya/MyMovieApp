package com.example.movie.data;

import android.content.Context;

import com.example.movie.data.entities.MovieEntityList;
import com.example.movie.data.entities.Root;
import com.example.movie.data.entities.SearchRoot;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import androidx.lifecycle.LiveData;

public class Repository {

    private LocalDataSource localDataSource;
    private RemoteDataSource remoteDataSource;

    public Repository(Context context) {
        localDataSource = new LocalDataSource(context);
        remoteDataSource = new RemoteDataSource();
    }

    public LiveData<List<MovieEntityList>> getMovieSearchList(final String title, final String API_KEY) {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run()  {
                SearchRoot search = remoteDataSource.getMovieList(title,API_KEY);
                Log.e("Income","" + search.getSearch().get(1).getTitle());
                final List<MovieEntityList> movieList = new ArrayList<>();
                for(int i = 0; i < search.getSearch().size(); i++) {
                    MovieEntityList movieEntity = new MovieEntityList();
                    movieEntity.id = i;
                    movieEntity.Title = search.getSearch().get(i).getTitle();
                    movieEntity.Year = search.getSearch().get(i).getYear();
                    movieEntity.Type = search.getSearch().get(i).getType();
                    movieList.add(movieEntity);
                }
                localDataSource.storeMovieList(movieList);
            }
        });
        return localDataSource.getMovieList();
    }


    public LiveData<List<MovieEntityList>> getMovieDetail(final String id,final String API_KEY) {
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                Root root = remoteDataSource.getMovieDetail(id,API_KEY);
                MovieEntityList movieEntityDetail = new MovieEntityList();
                movieEntityDetail.id = 0;
                final List<MovieEntityList> movieDetail = new ArrayList<>();
                Log.e("Income", "title" + movieEntityDetail.id);
                movieEntityDetail.Title = root.getTitle();
                movieEntityDetail.Year = root.getYear();
                movieEntityDetail.Genre = root.getGenre();
                movieEntityDetail.Director = root.getDirector();
                movieEntityDetail.Released = root.getReleased();
                movieEntityDetail.Country = root.getCountry();
                movieEntityDetail.Actors = root.getActors();
                movieEntityDetail.Runtime = root.getRuntime();
                movieEntityDetail.Writer = root.getWriter();
                movieEntityDetail.Rated = root.getRated();
                movieEntityDetail.Plot = root.getPlot();
                movieEntityDetail.imdbRating = root.getImdbRating();
                movieEntityDetail.Awards = root.getAwards();
                movieDetail.add(movieEntityDetail);
                localDataSource.storeMovieList(movieDetail);
            }
        });
        return localDataSource.getMovieList();
    }
    public LiveData<List<MovieEntityList>> getToWatchList(final String title, final String API_KEY) {
        return localDataSource.getMovieToWatchList();
    }
    public void updatePreferences(MovieEntityList movieEntityList) {
        final List<MovieEntityList> movieList = new ArrayList<>();
        movieEntityList.isToWatch = true;
        movieList.add(movieEntityList);
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {
                localDataSource.storeMovieList(movieList);
            }
        });
    }

}
