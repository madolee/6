package com.example.a6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {

    private CameraManager cameraManager;
    private String cameraID;

    // MediaPlayer 객체생성
    MediaPlayer mediaPlayer;

    // 시작버튼
    Button start;
    //종료버튼
    Button stop;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);


        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            cameraID = cameraManager.getCameraIdList()[0]; // 0 is for back camera
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            cameraManager.setTorchMode(cameraID, true);
            Thread.sleep(7200_000);
// 1시간/3600  2시간/7200 3시간/10800  4시간/14400 5시간/18000
            cameraManager.setTorchMode(cameraID, false);
        } catch (Exception e) {
            e.printStackTrace();   }
        try {

            finishAffinity();
            System.runFinalization();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}

/**
 *  sacom must see this message
 *
 *
 try {

 Thread.sleep(10_000);
 // 1시간/3600  2시간/7200 3시간/10800  4시간/14400 5시간/18000
 mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.stic1);
 mediaPlayer.start();

 } catch (Exception e) {
 e.printStackTrace();
 }


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 정지버튼
                mediaPlayer.stop();
                // 초기화
                mediaPlayer.reset();
            }
        });
    }


    // MediaPlayer는 시스템 리소스를 잡아먹는다.
    // MediaPlayer는 필요이상으로 사용하지 않도록 주의해야 한다.
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // MediaPlayer 해지
        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
        
        
        
        
        
  /**
   *
   * 백그라운드로 가면  음악 중지
   override fun onStop() {
   mediaPlayer?.release()
   mediaPlayer = null
   super.onStop()
   }

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            cameraID = cameraManager.getCameraIdList()[0]; // 0 is for back camera
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            cameraManager.setTorchMode(cameraID, true);
                Thread.sleep(10800_000);
// 1시간/3600  2시간/7200 3시간/10800  4시간/14400 5시간/18000
            cameraManager.setTorchMode(cameraID, false);

            } catch (Exception e) {
              e.printStackTrace();
            }

        System.exit(0);

    }

}
   **/
