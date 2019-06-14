package com.example.movie.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.movie.R;

public class MovieDetailActivity extends AppCompatActivity {
    private EditText editText;
    private Button search_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        editText = findViewById(R.id.field_search);
        search_detail = findViewById(R.id.search_detail);

        //переход к другим активити
        search_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(getString(R.string.title), editText.getText().toString());
                intent.setClass(getApplicationContext(), MovieDetailInformationActivity.class);
                startActivity(intent);
            }
        });
    }

}

