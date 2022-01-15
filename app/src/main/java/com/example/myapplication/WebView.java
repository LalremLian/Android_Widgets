package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {

    //Variables...
    android.webkit.WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //Hooks...
        web = findViewById(R.id.webview);

        web.loadUrl("https://www.google.com/");

        // this will enable the javascript.
        web.getSettings().setJavaScriptEnabled(true);

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        web.setWebViewClient(new WebViewClient());
    }
}