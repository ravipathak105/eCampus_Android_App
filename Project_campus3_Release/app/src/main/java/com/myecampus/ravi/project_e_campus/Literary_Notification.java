package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Literary_Notification extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literary__notification);
        mWebView = (WebView)findViewById(R.id.litnoti);
        mWebView.loadUrl("https://docs.google.com/document/d/17KnqWhhslLdYKxXWGG8GTizv7Lb0zvu0eEtfA0SeQqI/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

    }
}
