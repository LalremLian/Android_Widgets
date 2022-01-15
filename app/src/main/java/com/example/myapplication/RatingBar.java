package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RatingBar extends AppCompatActivity {

    //Variables.........
    Button button;
    android.widget.RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        //Hooks........
        button = findViewById(R.id.submit);
        ratingBar = findViewById(R.id.ratingBar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(),rating,Toast.LENGTH_SHORT).show();
            }
        });
    }
}