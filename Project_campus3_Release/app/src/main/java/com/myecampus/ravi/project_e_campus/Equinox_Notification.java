package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Equinox_Notification extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equinox__notification);
        mWebView = (WebView)findViewById(R.id.equinoti);
        mWebView.loadUrl("https://docs.google.com/document/d/1RgA_dH0LMiRe-EjX0L3Y_HyZsz9C8yAWq-Aa4ZQvB5U/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

    }
}
