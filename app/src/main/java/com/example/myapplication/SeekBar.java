package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SeekBar extends AppCompatActivity {

    //Variables..
    android.widget.SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        seekBar = findViewById(R.id.seekbar);

        seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"seekbar progress"+progress,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch Started.",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch stopped.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}