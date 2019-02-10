package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {
    Button login,signup;
    EditText editText;
    EditText editText2;
    EditText editText3;



    private FirebaseAuth mAuth;
    String s1,s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        editText=(EditText)findViewById(R.id.email);
        editText2=(EditText)findViewById(R.id.password);
        editText3=(EditText)findViewById(R.id.phone);
        signup=(Button)findViewById(R.id.signup);
        login=(Button)findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth = FirebaseAuth.getInstance();
                s1 = editText.getText().toString();
                s2 = editText2.getText().toString();
                mAuth.createUserWithEmailAndPassword(s1, s2).addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful())
                            Toast.makeText(getApplicationContext(), task.getException().toString(), Toast.LENGTH_LONG).show();
                        else{

                            Toast.makeText(getApplicationContext(), "Registration Successfull", Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(getApplicationContext(),Login.class);
                            startActivity(intent);
                        }
                    }
                });

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }

        });



    }
}
