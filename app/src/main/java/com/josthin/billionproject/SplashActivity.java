package com.josthin.billionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splash = MediaPlayer.create(this,R.raw.intromusic);
        splash.start();
        new Handler().postDelayed(()->{
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
        },4500);
    }
}