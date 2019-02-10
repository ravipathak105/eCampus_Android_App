package com.myecampus.ravi.project_e_campus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class FacultySection extends AppCompatActivity {
    Button sign,login;
    EditText edit1,edit2,edit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_section);

        edit1=(EditText)findViewById(R.id.et1);
        edit2=(EditText)findViewById(R.id.et2);
        edit3=(EditText)findViewById(R.id.et3);

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.et1));

            }
        });
        edit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.et2));

            }
        });
        edit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.et3));

            }
        });






        sign=(Button)findViewById(R.id.facultySignup);
        login=(Button)findViewById(R.id.facultylogin);
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(findViewById(R.id.facultyycard));
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInUp)
                        .duration(700)
                        .repeat(0)
                        .playOn(findViewById(R.id.facultySignup));
                Toast.makeText(FacultySection.this, "Under Development Phase", Toast.LENGTH_SHORT).show();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInUp)
                        .duration(700)
                        .repeat(0)
                        .playOn(findViewById(R.id.facultylogin));
                Toast.makeText(FacultySection.this, "Under Development Phase", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
