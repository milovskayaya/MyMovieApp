package com.example.movie.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movie.R;


public class MovieSearcherActivity extends AppCompatActivity {
    private EditText editText;
    private Button search_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_searcher);

        editText = findViewById(R.id.field_search);
        search_list = findViewById(R.id.search_button);

        //переход к другим активити
        search_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(getString(R.string.title), editText.getText().toString());
                intent.setClass(getApplicationContext(), MovieSearchListActivity.class);
                startActivity(intent);
            }
        });

    }
}




