package com.android.navigationapplication.aboutfragments;


import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.navigationapplication.R;

public class AboutApplicationVersion extends Fragment {


    public AboutApplicationVersion() {  }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_about_application_version, container, false);

        TextView textView = view.findViewById(R.id.appVersion);;
        textView.setText("Version Code: " + Build.VERSION.RELEASE);
        // Inflate the layout for this fragment
        return view;
    }
}