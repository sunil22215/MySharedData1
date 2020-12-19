package com.example.myshareddata1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_acitvity);


    }

    public void button_Login(View view) {
        new User(WelcomeAcitvity.this).removeUser();
        startActivity(new Intent(WelcomeAcitvity.this,MainActivity.class));
        finish();
    }
}