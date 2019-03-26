package com.example.contactmanagementapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.contactmanagementapp.SQL_Lite.MyDBHelper;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    TextView cms,start;

    Animation Down_from_top,Up_from_bottom;

    MyDBHelper myDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        myDBHelper = new MyDBHelper(this);

        SQLiteDatabase database = myDBHelper.getWritableDatabase();

        cms = findViewById(R.id.App_Name);
        start = findViewById(R.id.Start);

        Down_from_top = AnimationUtils.loadAnimation(this,R.anim.down_from_top);
        Up_from_bottom = AnimationUtils.loadAnimation(this,R.anim.up_from_bottum);

        cms.setAnimation(Down_from_top);
        start.setAnimation(Up_from_bottom);



        int timecount = 3000;

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println();

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();

            }

        },timecount);


    }

}
