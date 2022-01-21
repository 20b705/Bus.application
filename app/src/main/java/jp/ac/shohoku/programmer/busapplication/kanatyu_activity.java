package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class kanatyu_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanatyu_activity);

        WebView myWebView = (WebView) findViewById(R.id.webView2);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.kanachu.co.jp/dia/diagram/timetable01/cs:0000801694-1/nid:00128637/rt:0/k:%E6%9C%AC%E5%8E%9A%E6%9C%A8%E9%A7%85%E5%8D%97%E5%8F%A3");

        Button nextButton01 = findViewById(R.id.Kana_home_button);
        Button nextButton02 = findViewById(R.id.Kana_School_button);
        Button nextButton03 = findViewById(R.id.Kana_Kanachu_button);
        Button nextButton04 = findViewById(R.id.Kana_mypage_button);

        nextButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), school_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kanatyu_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), mypage_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
    }

}