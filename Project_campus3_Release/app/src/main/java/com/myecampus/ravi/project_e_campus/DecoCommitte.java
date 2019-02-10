package com.myecampus.ravi.project_e_campus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DecoCommitte extends AppCompatActivity {
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deco_committe);
        mWebView = (WebView)findViewById(R.id.decocom);
        mWebView.loadUrl("https://docs.google.com/document/d/1RgYrIRR9-Fl1879jiZBJ1L2KUNzB5lTsxylJv25HRz0/edit?usp=sharing");
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
    }
}
