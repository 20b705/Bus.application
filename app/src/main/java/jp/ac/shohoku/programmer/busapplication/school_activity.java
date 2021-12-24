package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class school_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_activity);
        Button nextButton1 = findViewById(R.id.Home_button);
        Button nextButton2 = findViewById(R.id.schoolBus_button3);
        Button nextButton3 = findViewById(R.id.KanaBus_button3);
        Button nextButton4 = findViewById(R.id.Mypage_button);

        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), school_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kanatyu_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
        nextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), mypage_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
    }

}
