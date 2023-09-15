package com.example.a6;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    // private ArrayList<String> array_1;
    private ArrayList<Integer> ARR;
    TextView textv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //     textv = findViewById(R.id.t1);

        Integer[] str_arrary = {22,22,88,88,8,13,88,13,8,8,22,22,88,88,8,13};
        //String[] str_arrary ={'"ksd","tkd","td"};



        //  array_1 = new ArrayList<>();
        ARR = new ArrayList<>();


        /**
         * String 배열 ArrayList 변환 1 정말  푸시 하기 힘드네
         */

        for (int i = 0; i < str_arrary.length; i++) {

            Integer sum = i + 15;
            textv.setText("Today is " + sum + "/n" + "Work code is" + str_arrary[i]);

            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (str_arrary[i]){

                case 88:

                    Thread.sleep(10_000*8);

                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com")); startActivity(myIntent);
                    Thread.sleep(10_000*2);
                    stop music;

                    Thread.sleep(10_000*8);
                    light  on;
                    Thread.sleep(10_000*6);
                    light off;
                    break;

                case 22:
                    Thread.sleep(10_000);
                    break;


                case 8:
                    Thread.sleep(10_000);
                    break;


                case 13:
                    Thread.sleep(10_000);
                    break;




                //switch(ARR)  ; case 8:  () break ;  case 22; () break
            }



            //  ARR.add(str_arrary[i]);


        }


        /**
         * String 배열 ArrayList 변환 2
         */
        ARR.addAll(Arrays.asList(str_arrary));


    }
}
}