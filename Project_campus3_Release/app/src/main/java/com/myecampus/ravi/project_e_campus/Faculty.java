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
public class Faculty extends Fragment {


    public Faculty() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faculty, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(view.findViewById(R.id.facultycard));
        YoYo.with(Techniques.ZoomInUp)
                .duration(2000)
                .repeat(0)
                .playOn(view.findViewById(R.id.facultyagree));
        view.findViewById(R.id.facultyagree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(1000)
                        .repeat(0)
                        .playOn(view.findViewById(R.id.facultyagree));
                startActivity(new Intent(getActivity(), FacultySection.class));
            }
        });

    }

}
