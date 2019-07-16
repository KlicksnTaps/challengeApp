package com.example.android.challengeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class AboutALCPage extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alcpage);
        webView = findViewById(R.id.my_webview);
        webView.loadUrl("https://andela.com/alc");
    }
}