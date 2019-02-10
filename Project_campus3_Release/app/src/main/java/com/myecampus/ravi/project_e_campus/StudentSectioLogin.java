package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentSectioLogin extends AppCompatActivity {
    Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sectio_login);
        sign=(Button)findViewById(R.id.studentSignup);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),StudentSection.class));
            }
        });
    }
    public void login(View view)
    {
        SqlliteDatabase mydb=new SqlliteDatabase(this);
        SQLiteDatabase db=mydb.getReadableDatabase();
        EditText euser=(EditText)findViewById(R.id.et1);
        EditText epass=(EditText)findViewById(R.id.et2);
        String[] columns={"userId", "password"};
        String[] cValues= {euser.getText().toString(),epass.getText().toString()};
        Cursor cursor=db.query("Student",columns,"userId= ? AND password = ?", cValues,null,null,null);
        if(cursor!=null)
        {
            if(cursor.moveToFirst())
            {
                Intent intent=new Intent(getApplicationContext(),StudentWelcome.class);
                intent.putExtra("Username",euser.getText().toString());
                startActivity(intent);
            }
            else
                Toast.makeText(getApplicationContext(),"Wrong Login Details",Toast.LENGTH_LONG).show();
        }



    }
}



