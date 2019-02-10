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
public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home, container, false);


    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        YoYo.with(Techniques.BounceInDown)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.curricular));
        YoYo.with(Techniques.BounceInDown)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.news));
        YoYo.with(Techniques.BounceInUp)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.notes));
        YoYo.with(Techniques.BounceInUp)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.schedule));
        YoYo.with(Techniques.BounceInUp)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.circular));
        YoYo.with(Techniques.BounceInUp)
                .duration(3000)
                .repeat(0)
                .playOn(view.findViewById(R.id.magazines));





        view.findViewById(R.id.curricular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YoYo.with(Techniques.BounceInDown)
                        .duration(2000)
                        .repeat(0)
                        .playOn(view.findViewById(R.id.curricular));
                startActivity(new Intent(getActivity(),Curricular.class));

                    }
                });
     view.findViewById(R.id.news).setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             YoYo.with(Techniques.BounceInDown)
                     .duration(2000)
                     .repeat(0)
                     .playOn(v.findViewById(R.id.news));

             startActivity(new Intent(getActivity(),NewsEvent.class));
         }
     });
        view.findViewById(R.id.notes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2000)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.notes));
                startActivity(new Intent(getActivity(),Notes.class));
            }
        });
        view.findViewById(R.id.schedule).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2000)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.schedule));
                startActivity(new Intent(getActivity(),Schedule.class));
            }
        });
        view.findViewById(R.id.circular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2000)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.circular));
                startActivity(new Intent(getActivity(),Circular.class));
            }
        });
        view.findViewById(R.id.magazines).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(2000)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.magazines));
                startActivity(new Intent(getActivity(),E_Magazines.class));
            }
        });










    }







}
