package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Notes extends AppCompatActivity {
    WebView mweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        mweb=(WebView)findViewById(R.id.notesweb);
        mweb.loadUrl("https://drive.google.com/open?id=1UItMvpcDK_IO9nM1ONAS3v22Ker-2me8");
        WebSettings webSettings = mweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mweb.setWebViewClient(new WebViewClient());
    }
}
