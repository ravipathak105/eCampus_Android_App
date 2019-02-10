package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AamodScreening extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aamod_screening);
        mWebView = (WebView)findViewById(R.id.aamodscreen);
        mWebView.loadUrl("https://docs.google.com/document/d/1wABSpZBfN-9j-YYOKfmab8s_MVZY2R6Z4ZJfRNocr2E/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

    }
}