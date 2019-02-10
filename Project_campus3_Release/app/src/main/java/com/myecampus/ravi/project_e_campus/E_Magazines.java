package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class E_Magazines extends AppCompatActivity {
    WebView emagazine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e__magazines);
        emagazine=(WebView)findViewById(R.id.maga);
        emagazine.loadUrl("https://drive.google.com/open?id=1cY5FbwacnYS7OlZFSYJ7TOZ0amB-rqXd");
        WebSettings webSettings = emagazine.getSettings();
        webSettings.setJavaScriptEnabled(true);
        emagazine.setWebViewClient(new WebViewClient());


    }
}
