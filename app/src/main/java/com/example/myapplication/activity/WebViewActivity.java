package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

import com.example.myapplication.R;

public class WebViewActivity extends AppCompatActivity {

    //Variables...
    android.webkit.WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //Hooks...
        web = findViewById(R.id.webview);

        web.loadUrl("https://www.github.com/LalremLian/");

        // this will enable the javascript.
        web.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        web.setWebViewClient(new WebViewClient());
    }
}