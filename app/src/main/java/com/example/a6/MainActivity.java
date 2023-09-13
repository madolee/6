package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String txt1=" this is txt 1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.t1);

        textView.setText(txt1);



            try {

            Thread.sleep(5000);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ActivityCompat.finishAffinity(this);
        System.exit(0);
       }
     }