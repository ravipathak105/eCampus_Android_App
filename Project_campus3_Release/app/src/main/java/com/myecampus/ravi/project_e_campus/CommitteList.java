package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class CommitteList extends AppCompatActivity {
    LinearLayout informals,finearts,registration,judgement,dance,music,deco,firstaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committe_list);
        informals=(LinearLayout)findViewById(R.id.informals);
        finearts=(LinearLayout)findViewById(R.id.Finearts);
        registration=(LinearLayout)findViewById(R.id.registration);
        judgement=(LinearLayout)findViewById(R.id.judgement);
        dance=(LinearLayout)findViewById(R.id.dance);
        music=(LinearLayout)findViewById(R.id.music);
        deco=(LinearLayout)findViewById(R.id.deco);
        firstaid=(LinearLayout)findViewById(R.id.firstaid);

        informals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.informals));
                startActivity(new Intent(getApplicationContext(),Informals.class));
            }
        });

        finearts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.Finearts));
                startActivity(new Intent(getApplicationContext(),Finearts.class));
            }
        });
       registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.registration));
                startActivity(new Intent(getApplicationContext(),StageDecoCom.class));
            }
        });
       judgement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.judgement));
                startActivity(new Intent(getApplicationContext(),RenaissanceCommitte.class));
            }
        });
     dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.dance));
                startActivity(new Intent(getApplicationContext(),DanceCommitte.class));

            }
        });
       music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.music));
                startActivity(new Intent(getApplicationContext(),MusicCommitte.class));
            }
        });
        deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.deco));
                startActivity(new Intent(getApplicationContext(),DecoCommitte.class));
            }
        });
        firstaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(1000)
                        .repeat(1)
                        .playOn(v.findViewById(R.id.firstaid));
               startActivity(new Intent(getApplicationContext(),FirstAidCom.class));
            }
        });
    }
}
