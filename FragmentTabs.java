package com.example.android.tflitecamerademo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

public class FragmentTabs extends FragmentPagerAdapter {


    public FragmentTabs(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new Camera2BasicFragment();
        else if (position == 1)
            return new MaterialsFragment();
        else
            return new InfoFragment();
        }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 : return "Camera";
            case 1 : return "Recycle";
            case 2 : return "Tips";
            default: return null;
        }
    }
}
