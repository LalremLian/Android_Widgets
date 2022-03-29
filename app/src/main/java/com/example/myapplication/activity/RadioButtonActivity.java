package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.myapplication.R;

public class RadioButtonActivity extends AppCompatActivity {

    //Variables
    Button button;
    RadioGroup RG;
    RadioButton RB,RB2,RB3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        button = (Button) findViewById(R.id.show);
        RG = (RadioGroup) findViewById(R.id.RadioG);
        //RB = (RadioButton) findViewById(R.id.radiobttn);
        //RB2 = (RadioButton) findViewById(R.id.male);
        //RB3 = (RadioButton) findViewById(R.id.female);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclickbuttonMethod();
            }
        });
    }

    private void onclickbuttonMethod() {
        int selectedId = RG.getCheckedRadioButtonId();
        RB = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(RadioButtonActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(RadioButtonActivity.this, RB.getText(), Toast.LENGTH_SHORT).show();
        }
    }
    }