package com.myecampus.ravi.project_e_campus;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentSection extends AppCompatActivity {
    Button sign,login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_section);
        sign = (Button) findViewById(R.id.studentSignup);
        login = (Button) findViewById(R.id.studentLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StudentWelcome.class));
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StudentSectioLogin.class));
            }
        });
    }


    public void register(View v)
    {
        EditText UserEdit = (EditText)findViewById(R.id.et1);
        EditText passEdit = (EditText)findViewById(R.id.et2);
        EditText nameEdit = (EditText)findViewById(R.id.et3);
        /* For Clearing Record
        nameEdit.getText().clear();
        userEdit.getText().clear();
        passEdit.getText().clear();
         */

        String UserId=UserEdit.getText().toString();
        String Password=passEdit.getText().toString();
        String Name=nameEdit.getText().toString();



        SqlliteDatabase mydb=new SqlliteDatabase(this);
        SQLiteDatabase db=mydb.getWritableDatabase();
        ContentValues values=new ContentValues();


        values.put("userId", UserId);
        values.put("password", Password);
        values.put("name", Name);
        db.insert("Student",null,values);
        Toast.makeText(this,"You've Signed Up Successfully Click Login",Toast.LENGTH_SHORT).show();


    }

}



