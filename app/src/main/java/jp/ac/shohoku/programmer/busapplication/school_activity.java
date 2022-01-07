package jp.ac.shohoku.programmer.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
//import android.support.v7.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class school_activity extends AppCompatActivity {
    private TextView textView;
    private SchoolDataOpenHelper SchoolHelper;

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

        //DB作成
        SchoolHelper = new SchoolDataOpenHelper(getApplicationContext());
        textView = findViewById(R.id.SchoolBus_Data);
    }
    public  void readData(View view){
        SQLiteDatabase db = SchoolHelper.getReadableDatabase();
        Cursor cursor =db.query(
                "Schooldb",
                new String[]{ "title", "score" },
                null,
                null,
                null,
                null,
                null
        );

        cursor.moveToFirst();

        StringBuilder sbuilder = new StringBuilder();

        for (int i = 0; i < cursor.getCount(); i++) {
            sbuilder.append(cursor.getString(0));
            sbuilder.append(":    ");
            sbuilder.append(cursor.getInt(1));
            sbuilder.append("点\n\n");
            cursor.moveToNext();
        }

        cursor.close();

        textView.setText(sbuilder.toString());
    }
    //public void saveData(View view){
      //  SQLiteDatabase db = SchoolHelper.getWritableDatabase();
      //  ContentValues values = new ContentValues();

      //  EditText editTextTitle = findViewById(R.id.edit_text_key);
      //  EditText editTextScore = findViewById(R.id.edit_text_value);
      //  String title = editTextTitle.getText().toString();
      //  String score = editTextScore.getText().toString();
      //  values.put("title", title);
      //  values.put("score", score);

      //  db.insert("testdb", null, values);
    //}
}
