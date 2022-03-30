package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.TabLayout.TabLayoutActivity;

public class Page2Activity extends AppCompatActivity {

    //Variables.....................................................................................
    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,
    button13,button14,button15,button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //Hooks.....................................................................................
        button = findViewById(R.id.ratingbtn);
        button1 = findViewById(R.id.webBTN);
        button2 = findViewById(R.id.seekbarBTN);
        button3 = findViewById(R.id.datepckrBTN);
        button4 = findViewById(R.id.timepickrBTN);
        button5 = findViewById(R.id.progressBTN);
        button6 = findViewById(R.id.verticalscrollBTN);
        button7 = findViewById(R.id.horizotalscrollBTN);
        button8 = findViewById(R.id.imageswitcherBTN);
        button9 = findViewById(R.id.viewstubBTN);
        button10 = findViewById(R.id.srchViewBTN);
        button11 = findViewById(R.id.EditTXTBTN);
        button12 = findViewById(R.id.tablayoutTBTN);
        button13 = findViewById(R.id.PopUpMenuBTN);
        button14 = findViewById(R.id.SharedPrefBTN);
        button15 = findViewById(R.id.dialogBTN);
        button16 = findViewById(R.id.GoogleMapBTN);

        button16.setOnClickListener(v ->
        {
            Intent intent = new Intent(Page2Activity.this, GoogleMapActivity.class);
            startActivity(intent);
        });
        button15.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, DialogProgressActivity.class);
            startActivity(intent);
        });
        button14.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, SharedPrefActivity.class);
            startActivity(intent);
        });
        button13.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this,PopUpMenuActivity.class);
            startActivity(intent);
        });
        button12.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, TabLayoutActivity.class);
            startActivity(intent);
        });
        button11.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, TextWatcherActivity.class);
            startActivity(intent);
        });
        button10.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, SearchViewActivity.class);
            startActivity(intent);
        });
        button9.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, ViewStubActivity.class);
            startActivity(intent);
        });
        button8.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, ImageSwitcherActivity.class);
            startActivity(intent);
        });
        button7.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, ProgressBarActivity.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, TimePickerActivity.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, DatePickerActivity.class);
            startActivity(intent);
        });
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, SeekBarActivity.class);
            startActivity(intent);
        });
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, WebViewActivity.class);
            startActivity(intent);
        });
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Page2Activity.this, RatingBarActivity.class);
            startActivity(intent);
        });
    }
}