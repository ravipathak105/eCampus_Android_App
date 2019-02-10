package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Zest extends AppCompatActivity {
 LinearLayout committee,screening,result,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zest);
        committee=(LinearLayout) findViewById(R.id.comm);
        screening=(LinearLayout) findViewById(R.id.screening);
        register=(LinearLayout) findViewById(R.id.eventregistration);
        result=(LinearLayout) findViewById(R.id.res);
        committee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.comm));

                Intent intent=new Intent(getApplicationContext(),CommitteList.class);
                startActivity(intent);
            }
        });
        screening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.screening));
              startActivity(new Intent(getApplicationContext(),Screening.class));
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.res));
                startActivity(new Intent(getApplicationContext(),ResultZest.class));
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(2500)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.eventregistration));
                startActivity(new Intent(getApplicationContext(),EventRegistration.class));
            }
        });

    }
    }

