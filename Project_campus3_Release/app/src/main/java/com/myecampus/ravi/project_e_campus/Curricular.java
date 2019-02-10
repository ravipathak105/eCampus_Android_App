package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Curricular extends AppCompatActivity {
   CardView club,zest,aamod,techvyom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curricular);
        club=(CardView) findViewById(R.id.clubfest);
        zest=(CardView) findViewById(R.id.zestfest);
        aamod=(CardView) findViewById(R.id.aamodfest);
        techvyom=(CardView) findViewById(R.id.techvyomfest);
        zest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.zestfest));
                startActivity(new Intent(getApplicationContext(),Zest.class));
            }
        });
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.clubfest));
                startActivity(new Intent(getApplicationContext(),ClubActivity.class));
            }
        });
        aamod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.aamodfest));
               startActivity(new Intent(getApplicationContext(),Aamod.class));
            }
        });
        techvyom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.techvyomfest));
                startActivity(new Intent(getApplicationContext(),Techvyom.class));
            }
        });
    }
}
