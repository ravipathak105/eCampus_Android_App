package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Circular extends AppCompatActivity {
    WebView mweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular);
        mweb=(WebView)findViewById(R.id.circulars);
        mweb.loadUrl("https://drive.google.com/open?id=1Xv-rfkl-Xui0YurA-nvtG82oExxEaoM2");
        WebSettings webSettings = mweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mweb.setWebViewClient(new WebViewClient());
    }
}
