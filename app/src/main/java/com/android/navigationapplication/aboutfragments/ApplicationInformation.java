package com.android.navigationapplication.aboutfragments;


import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.navigationapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ApplicationInformation extends Fragment {


    public ApplicationInformation() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_application_information, container, false);

        TextView textView = view.findViewById(R.id.appInfo);

        textView.setText( "BASE: " + Build.VERSION_CODES.BASE + "\n" +
                "INCREMENTAL: " + Build.VERSION.INCREMENTAL + "\n" +
                "SDK: " + Build.VERSION.SDK + "\n" +
                "BOARD: " + Build.BOARD + "\n" +
                "BRAND: " + Build.BRAND + "\n" +
                "HOST: " + Build.HOST + "\n" +
                "FINGERPRINT: "+ Build.FINGERPRINT + "\n");
        // Inflate the layout for this fragment
        return view;
    }

}
