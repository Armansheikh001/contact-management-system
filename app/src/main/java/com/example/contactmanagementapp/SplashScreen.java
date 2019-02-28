package com.example.contactmanagementapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        button = findViewById(R.id.button);


    }

    public void enter(View view) {

        Intent i = new Intent(SplashScreen.this,MainActivity.class);
            startActivity(i);

    }
}
