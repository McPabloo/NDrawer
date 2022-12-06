package com.example.ndrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ndrawer.ui.login.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login4);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.loglayout, LoginFragment.newInstance())
                    .commitNow();
        }
    }
}