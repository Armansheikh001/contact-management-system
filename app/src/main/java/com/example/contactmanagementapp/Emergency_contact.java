package com.example.contactmanagementapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.contactmanagementapp.adapters.ViewPagerAdapter;
import com.example.contactmanagementapp.frmnt.FrmntFireService;
import com.example.contactmanagementapp.frmnt.FrmntMedical;
import com.example.contactmanagementapp.frmnt.FrmntPolice;

public class Emergency_contact extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_ID);
        viewPager = (ViewPager) findViewById(R.id.PageViewId);

        viewPageAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        //Add Fragment
        viewPageAdapter.AddFrmt(new FrmntPolice(),"Police");
        viewPageAdapter.AddFrmt(new FrmntFireService(),"Fire Service");
        viewPageAdapter.AddFrmt(new FrmntMedical(),"Medical");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_notifications_active_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_phone_android_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_android_black_24dp);


        // Remove ActionBer Shadow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
