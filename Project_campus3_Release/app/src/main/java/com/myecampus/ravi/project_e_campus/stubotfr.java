package com.myecampus.ravi.project_e_campus;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


/**
 * A simple {@link Fragment} subclass.
 */
public class stubotfr extends Fragment {
    private static int SPLASH_TIME_OUT=1400;



    public stubotfr() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getActivity(),chatttt.class));
            }
        },SPLASH_TIME_OUT);
        return inflater.inflate(R.layout.fragment_stubotfr, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        YoYo.with(Techniques.FlipInX)
                .duration(1100)
                .repeat(0)
                .playOn(view.findViewById(R.id.stubotfrg));
    }
}




