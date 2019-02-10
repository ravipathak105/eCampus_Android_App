package com.myecampus.ravi.project_e_campus;


import android.content.Intent;
import android.os.Bundle;
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
public class AboutUs extends Fragment {


    public AboutUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_us, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(view.findViewById(R.id.aboutuscard));
        YoYo.with(Techniques.Landing)
                .duration(2000)
                .repeat(0)
                .playOn(view.findViewById(R.id.developer));
        YoYo.with(Techniques.Landing)
                .duration(2000)
                .repeat(0)
                .playOn(view.findViewById(R.id.ravi));
        YoYo.with(Techniques.Tada)
                .duration(5000)
                .repeat(0)
                .playOn(view.findViewById(R.id.phone));
        YoYo.with(Techniques.BounceInLeft)
                .duration(1200)
                .repeat(0)
                .playOn(view.findViewById(R.id.mee));
        view.findViewById(R.id.fb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Facebook.class));

            }
        });
        view.findViewById(R.id.gmail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Gmail.class));

            }
        });

        view.findViewById(R.id.insta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Instagram.class));

            }
        });
        view.findViewById(R.id.linkedin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Linkedin.class));

            }
        });

    }
}
