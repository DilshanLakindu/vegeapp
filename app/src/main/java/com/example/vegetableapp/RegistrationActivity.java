package com.example.vegetableapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {


    Button signup;
    EditText name,email,password;
    TextView signIn;
    FirebaseAuth auth;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        auth = FirebaseAuth.getInstance();
        signup=findViewById(R.id.reg_btn);
        name=findViewById(R.id.name);
        email= findViewById(R.id.email_reg);
        password = findViewById(R.id.password_reg);
        signIn= findViewById(R.id.sign_in);
        
        
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class);
                
            }
        });


        View signUp = null;
        signUp.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
            
            
            createUser();

            }
        });
        
    }

    private void createUser() {
        
        String userName = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();
        
        if (TextUtils.isEmpty(userName)){
            Toast.makeText(this,"Name Is Empty",Toast.LENGTH_SHORT.show());
        }
    }
}
