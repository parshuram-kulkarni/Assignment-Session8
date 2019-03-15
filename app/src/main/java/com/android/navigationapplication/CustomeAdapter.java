package com.android.navigationapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.navigationapplication.aboutfragments.AboutApplicationVersion;
import com.android.navigationapplication.aboutfragments.ApplicationInformation;
import com.android.navigationapplication.aboutfragments.TabletOrMobileInformation;

public class CustomeAdapter extends FragmentStatePagerAdapter {

    int mNoTabs;


    public CustomeAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoTabs = NumberOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){

            case 0 :
                AboutApplicationVersion applicationVersion = new AboutApplicationVersion();
                return applicationVersion;

            case 1:
                ApplicationInformation applicationInformation = new ApplicationInformation();
                return applicationInformation;

            case 2:
                TabletOrMobileInformation tabletOrMobileInformation = new TabletOrMobileInformation();
                return tabletOrMobileInformation;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoTabs;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}