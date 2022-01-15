package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class autoComplete extends AppCompatActivity {

    //Variables...............
    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        //Hooks.....................
        act = (AutoCompleteTextView) findViewById(R.id.autoTXT);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,brands);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.brands, android.R.layout.select_dialog_item);

        //Getting the instance of AutoCompleteTextView
        //AutoCompleteTextView actv =  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        act.setThreshold(1);//will start working from first character
        act.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        act.setTextColor(Color.RED);
    }
}