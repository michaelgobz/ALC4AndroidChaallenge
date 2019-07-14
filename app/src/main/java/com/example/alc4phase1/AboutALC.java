package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView alcWeb = findViewById(R.id.web_view);
        //  load the url in the supplied
        alcWeb.setWebViewClient(new WebViewClient()); // opens in the view
        alcWeb.loadUrl("https://andela.com/alc/");
    // we have to handle the certificates manually here
        alcWeb.setWebViewClient( new WebViewClient() {
            @Override
            public  void onReceivedSslError (WebView view , SslErrorHandler handler ,  SslError error ){
                // we proceed
                handler.proceed();
            }

        });
    // we have to set up some settings
        WebSettings webSettings = alcWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setLoadsImagesAutomatically(true);
    // now we handle any error that may come up
    try {
        alcWeb.loadUrl("https://andela.com/alc/");
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        alcWeb.getCertificate();
        alcWeb.reload();
    }

    }













}
