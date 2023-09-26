package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String txt1=" 10초후 종료 ";
    String txt2=" this is txt 2";
    String txt3=" this is txt 3";
    String txt4=" this is txt 4";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.t1);

        textView.setText(txt1);



            try {

            Thread.sleep(10000);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ActivityCompat.finishAffinity(this);
        System.exit(0);
       }
     }