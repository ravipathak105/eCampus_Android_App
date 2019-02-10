package com.myecampus.ravi.project_e_campus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class SrmsConnect extends Fragment {
    WebView mWebView1;


    public SrmsConnect() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_srms_connect, container, false);
        mWebView1 = (WebView) view.findViewById(R.id.webview1);
        mWebView1.loadUrl("http://www.srms.ac.in/");
        WebSettings webSettings = mWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView1.setWebViewClient(new WebViewClient());

        return view;
    }

}