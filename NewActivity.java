package com.example.windows7.cra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by windows7 on 2016-06-30.
 */
public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(this,"Calendar",Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v) {
        Intent intent = new Intent(this, BusActivity.class);
        startActivity(intent);
        //Toast.makeText(this,"Bus",Toast.LENGTH_LONG).show();
    }
    public void onButton3Clicked(View v) {
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
        //Toast.makeText(this,"Setting",Toast.LENGTH_LONG).show();
    }
    public void onButton4Clicked(View v) {
        Toast.makeText(this,"크라아아앙",Toast.LENGTH_LONG).show();
    }
}
