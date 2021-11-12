package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mypage_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_activity);
        WebView myWebView = (WebView) findViewById(R.id.webView); //謎のエラー
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://sites.google.com/a/shohoku.ac.jp/portal/\n" +
                "\n");
    }
}