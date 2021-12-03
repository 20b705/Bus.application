package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class mypage_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_activity);
        WebView myWebView = (WebView) findViewById(R.id.Mypage_webView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://sites.google.com/a/shohoku.ac.jp/portal/");

        Button nextButton17 = findViewById(R.id.Home_button4);
        Button nextButton18 = findViewById(R.id.schoolBus_button6);
        Button nextButton19 = findViewById(R.id.KanaBus_button6);
        Button nextButton20 = findViewById(R.id.Mypage_button4);

        nextButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), school_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kanatyu_activity.class);
                //EditText editText = findViewById(R.id.editText);
                startActivity(intent);
            }
        });
        nextButton20.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(getApplication(), mypage_activity.class);
            //EditText editText = findViewById(R.id.editText);
            startActivity(intent);
        }
    });
}
}