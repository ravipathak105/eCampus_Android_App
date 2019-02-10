package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ClubActivity extends AppCompatActivity {
    LinearLayout equi,ilu,robo,lit,synergy,aero,design,pharma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        equi=(LinearLayout) findViewById(R.id.equinoxx);
        ilu=(LinearLayout) findViewById(R.id.iluminatii);
        robo=(LinearLayout) findViewById(R.id.robotrax);
        lit=(LinearLayout) findViewById(R.id.literary);
        synergy=(LinearLayout) findViewById(R.id.synergy);
        aero=(LinearLayout) findViewById(R.id.aeronautics);
        design=(LinearLayout) findViewById(R.id.design);
        pharma=(LinearLayout) findViewById(R.id.pharamaqumica);
        equi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.equinoxx));
                startActivity(new Intent(getApplicationContext(),EquinoxClub.class));
            }
        });
        ilu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.iluminatii));
                startActivity(new Intent(getApplicationContext(),Iluminati.class));
            }
        });
        robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.robotrax));
                startActivity(new Intent(getApplicationContext(),RobotraxClub.class));
            }
        });
        lit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.literary));
                startActivity(new Intent(getApplicationContext(),LiteraryClub.class));
            }
        });
        synergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.synergy));
                startActivity(new Intent(getApplicationContext(),SynergyClub.class));
            }
        });
        aero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.aeronautics));
                startActivity(new Intent(getApplicationContext(),AeronauticsClub.class));
            }
        });
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.design));
                startActivity(new Intent(getApplicationContext(),DesignClub.class));
            }
        });
        pharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.pharamaqumica));
                startActivity(new Intent(getApplicationContext(),PharmaqumicaClub.class));
            }
        });
    }
}
