package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Instagram extends AppCompatActivity {
    WebView mwebb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        mwebb=(WebView)findViewById(R.id.instagram);
        mwebb.loadUrl("https://www.instagram.com/im_ravi_p/");
        WebSettings webSettings = mwebb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebb.setWebViewClient(new WebViewClient());
    }
}
