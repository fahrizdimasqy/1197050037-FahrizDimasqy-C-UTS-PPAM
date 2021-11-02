package com.example.utspemrogramanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    String username = "fahriz";
    String password = "test12345";
    private String title = "Login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txtUsername = findViewById(R.id.txtUsername);
        final EditText txtPassword = findViewById(R.id.txtPassword);
        Button login = findViewById(R.id.login);
        setActionBarTitle(title);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsername.getText().toString().equalsIgnoreCase(username) && txtPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}