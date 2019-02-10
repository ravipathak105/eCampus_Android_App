package com.myecampus.ravi.project_e_campus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    Button button;
    EditText editText;

    EditText editText2;
    private FirebaseAuth mAuth;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText=(EditText)findViewById(R.id.et1);
        editText2=(EditText)findViewById(R.id.et2);
        button=(Button)findViewById(R.id.login);
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(findViewById(R.id.loginadmincard));



        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.et1));
            }
        });
        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada)
                        .duration(500)
                        .repeat(0)
                        .playOn(findViewById(R.id.et2));
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                mAuth = FirebaseAuth.getInstance();
                s1 = editText.getText().toString();
                s2 = editText2.getText().toString();
                mAuth.signInWithEmailAndPassword(s1, s2).addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (!task.isSuccessful())
                            Toast.makeText(getApplicationContext(), task.getException().toString(), Toast.LENGTH_LONG).show();
                        else{

                            Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(getApplicationContext(),AdminContent.class);
                            startActivity(intent);
                        }
                    }
                });

            }
        });



    }
}
