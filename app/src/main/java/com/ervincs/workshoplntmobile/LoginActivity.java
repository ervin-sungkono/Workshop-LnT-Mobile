package com.ervincs.workshoplntmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText emailField, passwordField;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailField = findViewById(R.id.et_email);
        passwordField = findViewById(R.id.et_password);
        loginButton = findViewById(R.id.login_btn);

        Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);

        loginButton.setOnClickListener(v->{
            String email = emailField.getText().toString();
            if(email.length() == 0){
                Toast.makeText(LoginActivity.this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
            }else{
                intent.putExtra("Email",email);
                startActivity(intent);
            }
        });
    }
}