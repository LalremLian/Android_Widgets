package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    //Variables....
    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,
    button13,button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //Hooks....
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
        button13 = findViewById(R.id.optionMenuBTN);
        button14 = findViewById(R.id.SharedPrefBTN);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,SharedPrefActivity.class);
                startActivity(intent);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,TabLayout.class);
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,TextWacher.class);
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,SearchView.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,ViewStub.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,ImageSwitcher.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,HorizontalScrollView.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,VerticalScrollView.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,ProgressBar.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,TimePicker.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,DatePicker.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,SeekBar.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,WebView.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Page2.this,RatingBar.class);
                startActivity(intent);
            }
        });
    }
}