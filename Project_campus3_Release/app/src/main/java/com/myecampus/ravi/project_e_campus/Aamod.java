package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Aamod extends AppCompatActivity {
LinearLayout result,screening,register,comm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aamod);
        result=(LinearLayout)findViewById(R.id.aamodresult);
        register=(LinearLayout)findViewById(R.id.aamodregistration);
        comm=(LinearLayout)findViewById(R.id.aamodcomm);
        screening=(LinearLayout)findViewById(R.id.aamodscreening);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AamodResult.class));
            }
        });
        screening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AamodScreening.class));
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AamodRegister.class));
            }
        });
        comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AamodCommitte.class));
            }
        });
    }
}
