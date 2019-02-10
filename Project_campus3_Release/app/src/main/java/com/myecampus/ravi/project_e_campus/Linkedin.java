package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Linkedin extends AppCompatActivity {
    WebView mwebb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin);
        mwebb=(WebView)findViewById(R.id.linkedinn);
        mwebb.loadUrl("http://www.linkedin.com/in/ravi-pathak-0966a1143");
        WebSettings webSettings = mwebb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebb.setWebViewClient(new WebViewClient());
    }
}

