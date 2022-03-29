package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatToggleButton;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.android.material.snackbar.Snackbar;

public class SharedPrefActivity extends AppCompatActivity {

    TextView txtname, txtage, txtBool;
    EditText edName, edAge;
    Button saveBTN, clearBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        //Hooks...........
        txtname = findViewById(R.id.txtName);
        txtage = findViewById(R.id.txtAge);
        txtBool = findViewById(R.id.boolBTN);
        edName = findViewById(R.id.editName);
        edAge = findViewById(R.id.editAge);
        saveBTN = findViewById(R.id.saveData);
        clearBTN = findViewById(R.id.clearData);


        readDataFromShredPref();
        clearBTN.setOnClickListener(v -> {
            SharedPreferences sh = getSharedPreferences("SharedPref",MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sh.edit();

            myEdit.clear();
            myEdit.apply();

            txtname.setText("No data");
            txtage.setText("No data");
            txtBool.setText("No data");
            Snackbar snackbar = Snackbar.make(v,"Cleared Data.",Snackbar.LENGTH_SHORT);
            snackbar.show();
        });

        saveBTN.setOnClickListener(v -> {
            if (edName.getText().toString().equalsIgnoreCase("") || edAge.getText().toString().equalsIgnoreCase(""))
            {
                Toast.makeText(getApplicationContext(), "Fill up the fields.", Toast.LENGTH_SHORT).show();
            }else
                saveDataSharedPref(edName.getText().toString(), edAge.getText().toString());

        });
    }

    private void readDataFromShredPref() {

        SharedPreferences sh = getSharedPreferences("SharedPref",MODE_PRIVATE);
        String name = sh.getString("Name","");
        String age = sh.getString("Age","");
        //int age = sh.getInt("Age",0);
        Boolean bool = sh.getBoolean("Bool", Boolean.parseBoolean("0"));
        if (name.equalsIgnoreCase("") || age.equalsIgnoreCase("")|| bool==false)
        {
            txtname.setText("No data");
            txtage.setText("No data");
            txtBool.setText("False");
            //saveBTN.setText("Save Data");
        }else
        {
            txtname.setText(name);
            txtage.setText(age);
            txtBool.setText("True");
            saveBTN.setText("Update Data");
        }
    }

    public void saveDataSharedPref(String name, String age) {
        //int intAge = Integer.parseInt(age);
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        myEdit.putString("Name",name);
        myEdit.putString("Age",age);
        //myEdit.putInt("Age",intAge);
        myEdit.putBoolean("Bool",true);
        myEdit.apply();

        edName.setText("");
        edAge.setText("");
        txtage.setText(age);
        txtname.setText(name);
        txtBool.setText("True");
    }
}