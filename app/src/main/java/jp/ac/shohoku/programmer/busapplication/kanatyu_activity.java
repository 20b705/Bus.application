package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kanatyu_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanatyu_activity);
        Button nextButton_Kana1 = findViewById(R.id.Kana_home_button);
        Button nextButton_Kana2 = findViewById(R.id.Kana_School_button);
        Button nextButton_Kana3 = findViewById(R.id.Kana_Kanachu_button);
        Button nextButton_Kana4 = findViewById(R.id.Kana_mypage_button);

        nextButton_Kana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });

        nextButton_Kana2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), school_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });

        nextButton_Kana3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), kanatyu_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });

        nextButton_Kana4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), mypage_activity.class);
                //EditText editText = findViewById(R.id.editText)
                startActivity(intent);
            }
        });
    }

}