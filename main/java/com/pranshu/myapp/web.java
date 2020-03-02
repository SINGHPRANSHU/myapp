package com.pranshu.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {
    WebView w;
    String url="http://www.uitrgpv.ac.in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        w=findViewById(R.id.webView);
        w.setWebViewClient(new MyApp());
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl(url);

    }
    private class MyApp extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(url);
            return true;
        }
    }
    public void btn10(View v){
        Intent inten=new Intent(web.this,Main4Activity.class);
       startActivity(inten);
    }

}
