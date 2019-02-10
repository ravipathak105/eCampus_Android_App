package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AamodRegister extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aamod_register);

        mWebView = (WebView)findViewById(R.id.aamodregis);
        mWebView.loadUrl("https://docs.google.com/forms/d/11lvauLqoGNcon-mb4tkJQVZhZ-knt7dng697mL8DeSI/edit");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());

    }
}