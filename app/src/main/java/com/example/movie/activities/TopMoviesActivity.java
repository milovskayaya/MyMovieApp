package com.example.movie.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movie.R;
import com.example.movie.data.entities.Genres;


public class TopMoviesActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_movies);
        Button action = (Button) findViewById(R.id.action);
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Action_Genre.class);
                startActivity(intent);
            }
        });
        Button adventure = (Button) findViewById(R.id.adventure);
        adventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Adventure_Genre.class);
                startActivity(intent);
            }
        });
        Button animation = (Button) findViewById(R.id.animation);
        animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Animation_Genre.class);
                startActivity(intent);
            }
        });
        Button comedy = (Button) findViewById(R.id.comedy);
        comedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Comedy_Genre.class);
                startActivity(intent);
            }
        });
        Button crime = (Button) findViewById(R.id.crime);
        crime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Crime_Genre.class);
                startActivity(intent);
            }
        });
        Button drama = (Button) findViewById(R.id.drama);
        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Drama_Genre.class);
                startActivity(intent);
            }
        });
        Button fantasy = (Button) findViewById(R.id.fantasy);
        fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Fantasy_Genre.class);
                startActivity(intent);
            }
        });
        Button horror = (Button) findViewById(R.id.horror);
        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Horror_Genre.class);
                startActivity(intent);
            }
        });
        Button romance = (Button) findViewById(R.id.romance);
        romance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Romance_Genre.class);
                startActivity(intent);
            }
        });
        Button scifi = (Button) findViewById(R.id.sci_fi);
        scifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Scifi_Genre.class);
                startActivity(intent);
            }
        });
        Button superhero = (Button) findViewById(R.id.superhero);
        superhero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Superhero_Genre.class);
                startActivity(intent);
            }
        });
        Button thriller = (Button) findViewById(R.id.thriller);
        thriller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Genres.Thriller_Genre.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {
        v.setVisibility(View.INVISIBLE);
    }
}

