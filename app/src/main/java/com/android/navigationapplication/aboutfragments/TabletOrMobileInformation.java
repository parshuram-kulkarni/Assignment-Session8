package com.android.navigationapplication.aboutfragments;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.navigationapplication.R;


public class TabletOrMobileInformation extends Fragment {

    public TabletOrMobileInformation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_tablet_or_mobile_information, container, false);

        TextView textView = view.findViewById(R.id.mobileInfo);

        textView.setText( "SERIAL: " + Build.SERIAL + "\n" +
                "MODEL: " + Build.MODEL + "\n" +
                "ID: " + Build.ID + "\n" +
                "Manufacture: " + Build.MANUFACTURER + "\n" +
                "Brand: " + Build.BRAND + "\n" +
                "Type: " + Build.TYPE + "\n" +
                "User: " + Build.USER + "\n" );
        // Inflate the layout for this fragment
        return view;
    }
}