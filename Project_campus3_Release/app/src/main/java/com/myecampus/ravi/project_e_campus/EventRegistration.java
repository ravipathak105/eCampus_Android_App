package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EventRegistration extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_registration);
        mWebView = (WebView)findViewById(R.id.eventreg);
        mWebView.loadUrl("http://docs.google.com/forms/d/e/1FAIpQLScGBPmpbbHuKWVHSKxdMD9RTnw2m3v9TsvlszNTxpKQiaL3Wg/viewform");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

    }
}
