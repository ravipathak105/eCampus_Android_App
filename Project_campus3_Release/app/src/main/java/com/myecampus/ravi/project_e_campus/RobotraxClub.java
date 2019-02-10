package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RobotraxClub extends AppCompatActivity {
    Button reg,noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotrax_club);
        noti=(Button)findViewById(R.id.rnoti);
        reg=(Button)findViewById(R.id.regist);
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Robotrax_Notification.class));
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
