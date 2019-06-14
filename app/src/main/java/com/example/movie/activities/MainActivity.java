package com.example.movie.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movie.R;

public class MainActivity extends AppCompatActivity {
    private Button search;
    private Button top_movies;
    private Button search_detail;
    private Button to_watch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализируем все вьюхи
        search = findViewById(R.id.search);
        search_detail = findViewById(R.id.search_detail);
        top_movies = findViewById(R.id.top_movies);
        to_watch = findViewById(R.id.to_watch);
        //переход к другим активити
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MovieSearcherActivity.class);
                startActivity(intent);
            }
        });
        top_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), TopMoviesActivity.class);
                startActivity(intent);
            }
        });
        search_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MovieDetailActivity.class);
                startActivity(intent);
            }
        });
        to_watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), ToWatchListActivity.class);
                startActivity(intent);
            }
        });
    }
}

