package com.example.sthigwgfwb.controlrobot;

/**
 * Created by STHIGWGFWB on 22/02/2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.led_on_off.led.R;

/**
 * Created by PEACE on 3/30/2016.
 */
public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(700);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,DeviceList.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

