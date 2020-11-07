package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3);

        new Handler () .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}