package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AamodCommitte extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aamod_committe);

        mWebView = (WebView)findViewById(R.id.aamodcomlist);
        mWebView.loadUrl("https://docs.google.com/document/d/1JmV6yC2AjjTYGokYVSQYMQ78JUJMJGp-O-8sJnPnb10/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
    }
}
