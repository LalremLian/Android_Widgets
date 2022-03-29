package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.Calendar;

public class DatePickerActivity extends AppCompatActivity {

    //Variables..
    //DatePicker picker;
    //android.widget.DatePicker picker;
    Button displayDate;
    TextView textview1;
    int day,month,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        //Hooks...
        textview1=(TextView)findViewById(R.id.textView11);
        //picker = findViewById(R.id.datePicker);
        displayDate=(Button)findViewById(R.id.button1);

        displayDate.setOnClickListener(view ->
        {
            Calendar calendar = Calendar.getInstance();
            day = calendar.get(calendar.DAY_OF_MONTH);
            month = calendar.get(calendar.MONTH);
            year = calendar.get(calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {

                    month = month + 1;
                    String date = dayOfMonth + "-" + month + "-" + year;
                    textview1.setText(date);
                }
            },year,month,day);
            datePickerDialog.show();
        });
    }

}