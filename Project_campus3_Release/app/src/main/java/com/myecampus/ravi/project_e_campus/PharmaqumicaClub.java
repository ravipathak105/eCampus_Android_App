package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PharmaqumicaClub extends AppCompatActivity {
    Button noti,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmaqumica_club);
        reg=(Button)findViewById(R.id.regist);
        noti=(Button)findViewById(R.id.phanoti);
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Pharma_Notification.class));
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Link In Progress",Toast.LENGTH_LONG).show();
            }
        });
    }
}
