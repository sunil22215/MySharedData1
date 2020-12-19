package com.example.myshareddata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (new User(SplashActivity.this).getName()!="") {
                    startActivity(new Intent(getApplicationContext(), WelcomeAcitvity.class));
                    finish();
                }else {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }


            }
        },4000);
    }
}