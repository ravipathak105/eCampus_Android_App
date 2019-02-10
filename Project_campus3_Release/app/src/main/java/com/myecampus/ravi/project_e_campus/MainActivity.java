package com.myecampus.ravi.project_e_campus;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        YoYo.with(Techniques.Pulse)
                .duration(2000)
                .repeat(0)
                .playOn(findViewById(R.id.logo));
        YoYo.with(Techniques.Landing)
                .duration(4800)
                .repeat(0)
                .playOn(findViewById(R.id.activity_main));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),Homepage.class));
            }
        },SPLASH_TIME_OUT);


    }



}

