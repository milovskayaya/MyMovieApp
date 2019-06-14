package com.example.movie.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.movie.R;
import com.example.movie.viewmodels.ViewModelMovie;
import com.example.movie.data.entities.MovieEntityList;

import java.util.List;


public class MovieDetailInformationActivity extends AppCompatActivity implements Observer<List<MovieEntityList>> {
    private TextView titleView;
    private TextView rateView;
    private TextView releaseView;
    private TextView runtimeView;
    private TextView genreView;
    private TextView actorView;
    private TextView plotView;
    private TextView countryView;
    private TextView directorView;
    private TextView writerView;
    private TextView awardView;
    private String title_value;
    private LiveData<List<MovieEntityList>> movieDetailData;
    @Override
    protected void onCreate(Bundle savedInstantseState) {
        super.onCreate(savedInstantseState);
        setContentView(R.layout.activity_movie_detail_information);
//        getSupportActionBar().hide();
        //получим название города
        title_value = getIntent().getStringExtra("title");

        titleView = findViewById(R.id.title);
        rateView = findViewById(R.id.rating);
        releaseView = findViewById(R.id.released);
        runtimeView = findViewById(R.id.runtime);
        genreView = findViewById(R.id.genre);
        plotView = findViewById(R.id.plot);
        actorView = findViewById(R.id.actor);
        directorView = findViewById(R.id.director);
        writerView = findViewById(R.id.writer);
        countryView = findViewById(R.id.country);
        awardView = findViewById(R.id.awards);
        ViewModelMovie viewModelDetail =  ViewModelProviders.of(this).get(ViewModelMovie.class);
        viewModelDetail.loadData(this, title_value, "caee16f2");
        movieDetailData = viewModelDetail.getMovieDetailData();
        movieDetailData.observe(this,this);


    }

    @Override
    public void onChanged(List<MovieEntityList> movieEntityLists) {
        if (movieEntityLists != null && !movieEntityLists.isEmpty()) {
            titleView.setText(movieEntityLists.get(0).Title);
            rateView.setText("Rating: " + movieEntityLists.get(0).imdbRating + "/10");
            releaseView.setText("Release: " + movieEntityLists.get(0).Released);
            runtimeView.setText("Runtime: " + movieEntityLists.get(0).Runtime);
            genreView.setText("Genre: " + movieEntityLists.get(0).Genre);
            plotView.setText("Plot: " + movieEntityLists.get(0).Plot);
            actorView.setText("Actors: " + movieEntityLists.get(0).Actors);
            directorView.setText("Director: " + movieEntityLists.get(0).Director);
            writerView.setText("Writer: " + movieEntityLists.get(0).Writer);
            countryView.setText("Country: " + movieEntityLists.get(0).Country);
            awardView.setText("Awards: " + movieEntityLists.get(0).Awards);

        }

    }
}