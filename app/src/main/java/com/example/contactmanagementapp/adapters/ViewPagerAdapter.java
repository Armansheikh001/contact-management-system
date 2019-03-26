package com.example.contactmanagementapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.contactmanagementapp.frmnt.FrmntMedical;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private final List<Fragment> lstFrmt = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return lstFrmt.get(i);
    }

    @Override
    public int getCount() {
        return lstTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return lstTitles.get(position);
    }

    public void AddFrmt(Fragment fragment, String titles){

        lstFrmt.add(fragment);
        lstTitles.add(titles);
    }

}
