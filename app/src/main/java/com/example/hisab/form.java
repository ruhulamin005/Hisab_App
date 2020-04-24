package com.example.hisab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class form extends AppCompatActivity {
    //Webview2
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        webView = (WebView) findViewById(R.id.webView2);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://bit.ly/2Y2zpbm");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    //controling back press
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

}


