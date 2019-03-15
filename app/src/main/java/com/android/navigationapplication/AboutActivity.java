package com.android.navigationapplication;


import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.android.navigationapplication.aboutfragments.AboutApplicationVersion;

import static com.android.navigationapplication.aboutfragments.AboutApplicationVersion.*;

public class AboutActivity extends AppCompatActivity {
    CustomApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

       /* Bundle bundle = getIntent().getExtras();
       String data =bundle.getString("value");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("App_Version"));
        tabLayout.addTab(tabLayout.newTab().setText("Application_Info"));
        tabLayout.addTab(tabLayout.newTab().setText("Mobile_Info"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        final CustomeAdapter customeAdapter = new CustomeAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(customeAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    public void OnFragmentInteraction(Uri uti){ }
}
