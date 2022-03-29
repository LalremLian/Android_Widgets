package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.ListView.ListViewActivity;
import com.example.myapplication.activity.AutoCompleteActivity;
import com.example.myapplication.activity.DialogProgressActivity;
import com.example.myapplication.activity.Page2Activity;
import com.example.myapplication.activity.RadioButtonActivity;
import com.example.myapplication.activity.RecycleViewActivity;
import com.example.myapplication.activity.SpinnerActivity;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    //variables...........................
    Button button,button1,button2,button3,button4,button5,button6,button7,button8;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseMessaging.getInstance().subscribeToTopic("notification");

        //Hooks.........................
        button = (Button) findViewById(R.id.bttn);
        button1 = (Button) findViewById(R.id.btt1);
        button2 = (Button)findViewById(R.id.btt2);
        button3 = (Button) findViewById(R.id.btt3);
        button4 = (Button) findViewById(R.id.autofillbttn);
        button5 = (Button) findViewById(R.id.listVbt);
        button6 = (Button) findViewById(R.id.recyclebt);
        button7 = findViewById(R.id.next);
        button8 = findViewById(R.id.dBTN);
        editText = (EditText) findViewById(R.id.edittxt);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogProgressActivity.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page2Activity.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecycleViewActivity.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutoCompleteActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));  //Implicit Intent..........
                startActivity(intent);
            }
        });
    }
}