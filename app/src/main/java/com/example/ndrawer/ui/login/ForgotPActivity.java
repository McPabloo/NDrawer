package com.example.ndrawer.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import com.example.ndrawer.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pactivity);
    }

    public void login(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}