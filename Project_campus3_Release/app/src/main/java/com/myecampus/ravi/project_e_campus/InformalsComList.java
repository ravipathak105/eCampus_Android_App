package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InformalsComList extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informals_com_list);
        mWebView = (WebView)findViewById(R.id.inform);
        mWebView.loadUrl("https://docs.google.com/document/d/12P3W0OWAnzRy_fYugCksfPT5MF8O3dHo0Z7BrfJt0ek/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

    }
}
