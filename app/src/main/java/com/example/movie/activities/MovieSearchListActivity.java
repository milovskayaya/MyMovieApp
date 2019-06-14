package com.example.movie.activities;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.data.MovieApp;
import com.example.movie.R;
import com.example.movie.viewmodels.ViewModelMovieList;
import com.example.movie.adapters.MovieAdapter;
import com.example.movie.data.Repository;
import com.example.movie.data.entities.MovieEntityList;


public class MovieSearchListActivity extends AppCompatActivity implements Observer<List<MovieEntityList>> {

    private MovieAdapter mAdapter;
    private Repository repository;

    private RecyclerView movieList;

    private String title_value;

    private List<MovieEntityList> movieEntities0;

    private LiveData<List<MovieEntityList>> movieData;
    private ViewModelMovieList viewModelMovieList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_search_list);

        title_value = getIntent().getStringExtra(getString(R.string.title));

        movieData = new MutableLiveData<>();

        movieList = findViewById(R.id.rec_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        movieList.setLayoutManager(layoutManager);

        movieList.setHasFixedSize(true);
        movieEntities0 = new ArrayList<>();
        mAdapter = new MovieAdapter(movieEntities0, this);

        movieList.setAdapter(mAdapter);
        viewModelMovieList = ViewModelProviders.of(this).get(ViewModelMovieList.class);

        viewModelMovieList.loadData(this,title_value, "caee16f2" );

        movieData = viewModelMovieList.getMovieData();

        movieData.observe(this,this);
    }

    @Override
    public void onChanged(List<MovieEntityList> movieEntities) { mAdapter.func(movieEntities); }
    public void saveToPreferences(MovieEntityList movieEntityList) {
        viewModelMovieList.updatePreferences(movieEntityList);
    }
}