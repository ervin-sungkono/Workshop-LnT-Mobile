package com.ervincs.workshoplntmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ProfileActivity extends AppCompatActivity {
    TextView emailText;
    Button clickButton;
    View profileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        emailText = findViewById(R.id.tv_emailText);
        profileLayout = findViewById(R.id.profile_layout);
        clickButton = findViewById(R.id.click_btn);

        Intent intent = getIntent();
        String email = intent.getStringExtra("Email");

        emailText.setText(email);

        Snackbar snackbar = Snackbar.make(profileLayout, "Login Successful", Snackbar.LENGTH_SHORT)
                        .setAction("LOGOUT",v->{
                            startActivity(new Intent(ProfileActivity.this, LoginActivity.class));
                            finish();
                        });

        snackbar.show();

        clickButton.setOnTouchListener((view, motionEvent) -> {
            Toast.makeText(ProfileActivity.this, "Button touched!", Toast.LENGTH_SHORT).show();
            return false;
        });
    }
}