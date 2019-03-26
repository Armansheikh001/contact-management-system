package com.example.contactmanagementapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView notification,contact_info,profile,emer_cont,maps,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification = findViewById(R.id.Notification);
        contact_info = findViewById(R.id.Cont_info);
        profile = findViewById(R.id.Profile);
        emer_cont = findViewById(R.id.Emer_cont);
        maps = findViewById(R.id.Map);
        logout = findViewById(R.id.Log_out);



        notification.setOnClickListener(this);
        contact_info.setOnClickListener(this);
        profile.setOnClickListener(this);
        emer_cont.setOnClickListener(this);
        maps.setOnClickListener(this);
        logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.Notification :{
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.Cont_info :{
                Toast.makeText(this, "Contact Information", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.Emer_cont :{
                Intent intent = new Intent(this,Emergency_contact.class);
                startActivity(intent);

                Toast.makeText(this, "Emergency contact", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.Profile :{
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.Map :{
                Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.Log_out :{
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                break;
            }
        }

    }
}
