package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextButton = findViewById(R.id.schoolBus_button);
        Button nettButton2 = findViewById(R.id.KanaBus_button);
        Button nextButton3 = findViewById(R.id.schoolBus_button2);
        Button nextButton4 = findViewById(R.id.KanaBus_button2);
        Button nextButton5 = findViewById(R.id.Home_button);
        Button nextButton6 = findViewById(R.id.schoolBus_button3);
        Button nextButton7 = findViewById(R.id.KanaBus_button3);
        Button nextButton8 = findViewById(R.id.Mypage_button);

    }
}