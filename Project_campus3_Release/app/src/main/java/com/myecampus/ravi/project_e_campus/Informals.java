package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Informals extends AppCompatActivity {
  Button informalscom,fineartscom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informals);
        informalscom=(Button)findViewById(R.id.informalslist);
        informalscom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),InformalsComList.class));
            }
        });
    }
}
