package com.example.movie.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.R;
import com.example.movie.adapters.MovieAdapter;
import com.example.movie.data.MovieApp;
import com.example.movie.data.Repository;
import com.example.movie.data.entities.MovieEntityList;
import com.example.movie.viewmodels.ToWatchListViewModel;
import com.example.movie.viewmodels.ViewModelMovieList;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ToWatchListActivity extends AppCompatActivity implements Observer<List<MovieEntityList>> {
    private MovieAdapter mAdapter;

    private RecyclerView mNumbersList;

    private String title_value;

    private List<MovieEntityList> movieEntities0;

    private LiveData<List<MovieEntityList>> movieData;
    private ToWatchListViewModel toWatchListViewModel;
    private String API_KEY;
    private Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_watch_list);

        movieData = new MutableLiveData<>();

        mNumbersList = findViewById(R.id.to_watch_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumbersList.setLayoutManager(layoutManager);

        mNumbersList.setHasFixedSize(true);
        movieEntities0 = new ArrayList<>();
        mAdapter = new MovieAdapter(movieEntities0, this);

        mNumbersList.setAdapter(mAdapter);
        toWatchListViewModel =
                ViewModelProviders.of(this).get(ToWatchListViewModel.class);

        toWatchListViewModel.loadData(this,title_value, API_KEY);

        movieData = toWatchListViewModel.getMovieData();

        movieData.observe(this,this);

    }

    @Override
    public void onChanged(List<MovieEntityList> movieEntities) {
        mAdapter.func(movieEntities);
    }
}


