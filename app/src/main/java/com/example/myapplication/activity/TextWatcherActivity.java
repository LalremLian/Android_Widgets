package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;

public class TextWatcherActivity extends AppCompatActivity {

    //Variables..
    ListView lv;
    EditText editText;
    ArrayAdapter<String> adapter;

    String products[] = {"Apple", "Banana", "Pineapple", "Orange", "Papaya", "Melon",
            "Grapes", "Water Melon", "Lychee", "Guava", "Mango", "Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_wacher);

        //Hooks.....
        lv = (ListView) findViewById(R.id.listView);
        editText = (EditText) findViewById(R.id.editText);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item1, R.id.product_name, products);
        lv.setAdapter(adapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence cs, int start, int count, int after) {
                adapter.getFilter().filter(cs);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(getApplicationContext(), "before text change", Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(getApplicationContext(), "after text change", Toast.LENGTH_LONG).show();
            }
        });
    }
}