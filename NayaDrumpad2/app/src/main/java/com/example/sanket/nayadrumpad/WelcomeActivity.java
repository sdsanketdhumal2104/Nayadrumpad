package com.example.sanket.nayadrumpad;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hm=new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(hm);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
