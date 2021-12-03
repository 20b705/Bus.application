package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextButton = findViewById(R.id.schoolBus_button);
        Button nettButton2 = findViewById(R.id.KanaBus_button);
        Button nextButton3 = findViewById(R.id.schoolBus_button2);
        Button nextButton4 = findViewById(R.id.KanaBus_button3);
        Button nextButton5 = findViewById(R.id.Home_button);
        Button nextButton6 = findViewById(R.id.schoolBus_button3);
        Button nextButton7 = findViewById(R.id.KanaBus_button2);
        Button nextButton8 = findViewById(R.id.Mypage_button);

        nextButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), school_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kanatyu_activity.class);
                //EditText editText = findViewById(R.id.editText);
                startActivity(intent);
            }
        });
        nextButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), mypage_activity.class);
                //EditText editText = findViewById(R.id.editText);
                startActivity(intent);
            }
        });

    }
}