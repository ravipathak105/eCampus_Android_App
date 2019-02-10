package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Finearts extends AppCompatActivity {
    Button fineartscom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finearts);
        fineartscom=(Button)findViewById(R.id.fineartslist);
        fineartscom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FineArtsCommList.class));

            }
        });
    }
}
