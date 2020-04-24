package com.example.hisab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //initializing button and webview into private
    private WebView webView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // button and webview referencing with xml
        webView = (WebView) findViewById(R.id.webview);
        button = (Button) findViewById(R.id.button);


        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://bit.ly/2Y2zpbm"); // url for sheet
        webView.reload();
        webView.getScrollY();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        //Setting on click for Button to go FORM activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFormActivity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    //For form activity
    public void openFormActivity(){


        Intent intent = new Intent(this, form.class);
        startActivity(intent);
    }
}
