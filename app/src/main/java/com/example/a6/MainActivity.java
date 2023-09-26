package com.example.a6;
//;package com.example.auto_light3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static AudioManager audio;
    private CameraManager cameraManager;
    private String cameraID;
    //  private AudioManager audio;
    TextView textv;
    Button Toron ;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("my tag","start ");

        audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);


        try {
            cameraID = cameraManager.getCameraIdList()[0]; // 0 is for back camera
        } catch (Exception e) {
            e.printStackTrace();
        }
        textv = findViewById(R.id.t1);
        Toron = findViewById(R.id.button2);


        Integer[] str_arrary = {88,88,8,13,13,88,88,13,22,22,88,88,13,13,88,8,8,88,22,22,88,88,8,13,13,88,8,13,8,88,8,13,22,22,88};
        ArrayList<Integer> ARR = new ArrayList<>();


        Toron();
        timer((float)5.75);
        Toroff();
        audz();



/**

 *내장 메모리에 파일을 쓰는 코드

 FileOutputStream outFs = openFileOutput("file.txt", Context.MODE_PRIVATE);

 //파일을 쓰기 모드로 연다. 파일 경로는 /data/data/패키지명/files/file.txt이다. //MODE_PRIVATE는 현재 앱에서만 사용할 수 있게 한다는 것.
 String str= "내장 메모리 테스트";
 outFs.write(str.getBytes());

 //문자열을 파일에 쓰는데, getBytes()로 문자열을 byte[]로 변경해야한다.

 outFs.close(); //파일 닫기


 * 날자 가져오기

 LocalDate now = LocalDate.now();//date get

 * mplayer 음악 재생

 mMediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.test);
 mMediaPlayer.start();

 mMediaPlayer.stop();
 mMediaPlayer.reset();
 mMediaPlayer.release();
 mMediaPlayer=null;
 Toron.setText("STOP");


 * tts  :



 * mysql data read

 * bltus on off U


 **/

        for (int i = 0; i < str_arrary.length; i++) {

            int sum = i + 15;
            String arr=( String.valueOf(str_arrary[i]));
            textv.setText( String.valueOf(str_arrary[i]));
            textv.setText("Today is " + sum + "/n" + "Work code is" + arr);

            try {
                Thread.sleep(60_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (str_arrary[i]){

                case 88:
                    if (str_arrary[i - 1] == 22){
                        textv.setText( String.valueOf(str_arrary[i]));

                        timer(15);
                        auda();
                        timer(3);
                        Toron();
                        timer(6);
                        audz();
                        Toroff();
                        break;
                    }
                    timer(8);
                    auda();

                    //  Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com")); startActivity(myIntent);
                    timer(  2 );
                    audz();

                    timer(7);
                    Toron();
                    timer(7);
                    Toroff();
                    break;

                case 22:
                    textv.setText( String.valueOf(str_arrary[i]));

                    if  (str_arrary[i - 1] == 22){
                        timer(15);
                        auda();
                        timer(3);
                        Toron();
                        timer(6);
                        audz();
                        Toroff();
                        break;

                    }
                    timer(8);
                    auda();
                    timer(  2 );
                    audz();



                    timer(7);
                    Toron();

                    timer(7 );
                    Toroff();
                    break;


                case 8:
                    textv.setText( String.valueOf(str_arrary[i]));

                    timer((float) 5.75);
                    //alram
                    auda();
                    timer((float) 0.25);
                    audz();
                    timer((int) 12);
                    auda();
                    // music
                    Toron();
                    timer(4);
                    audz();
                    timer(2);
                    Toroff();

                    break;


                case 13:
                    textv.setText( String.valueOf(str_arrary[i]));

                    timer(8);
                    auda();
                    timer((float) 2.4);
                    audz();
                    timer((float) 12.6);
                    auda();
                    Toron();
                    timer(1);
                    audz();
                    Toroff();
                    break;
            }
        }
    }
// Log.d( tag, "test", msg: "test:if 진행 " );

    public static void  timer(float a){
        try {

            Thread.sleep((long) (3600000 *a));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void     audz() {
        Log.v("my tag","audz ");
        try {
            audio.setStreamVolume(AudioManager.STREAM_MUSIC,
                    (int) (audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * 0.15),
                    AudioManager.FLAG_PLAY_SOUND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void auda () {
        Log.v("my tag","auda ");
        try {
            audio.setStreamVolume(AudioManager.STREAM_MUSIC,
                    (int) (audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * 0.95),
                    AudioManager.FLAG_PLAY_SOUND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Toron(){
        Log.v("my tag","Tor on ");
        try {
            cameraManager.setTorchMode(cameraID, true);
            audio.setStreamVolume(AudioManager.STREAM_MUSIC,
                    (int) (audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * 0.95),
                    AudioManager.FLAG_PLAY_SOUND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // public void off_B(View v) {
    //   Toast.makeText(getApplicationContext(), (CharSequence) edittext.getText(), Toast.LENGTH_LONG).show();
    //}


    @RequiresApi(api = Build.VERSION_CODES.M)
    public void Toroff(){
        Log.v("my tag","Tor _ off");
        try {
            cameraManager.setTorchMode(cameraID, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}