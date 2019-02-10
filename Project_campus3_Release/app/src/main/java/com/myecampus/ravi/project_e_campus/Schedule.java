package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Schedule extends AppCompatActivity {
    WebView mweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        mweb=(WebView)findViewById(R.id.sch);
        mweb.loadUrl("https://drive.google.com/open?id=1wQt8aMAhH_VHPvFl36H6ThcERD5VesDr");
        WebSettings webSettings = mweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mweb.setWebViewClient(new WebViewClient());
    }
}
