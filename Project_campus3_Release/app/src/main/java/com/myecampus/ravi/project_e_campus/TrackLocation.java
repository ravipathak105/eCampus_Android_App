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
public class TrackLocation extends Fragment {


    public TrackLocation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_track_location, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(view.findViewById(R.id.locationcard));
        YoYo.with(Techniques.Landing)
                .duration(2000)
                .repeat(0)
                .playOn(view.findViewById(R.id.clglogo));
        YoYo.with(Techniques.Tada)
                .duration(6000)
                .repeat(1)
                .playOn(view.findViewById(R.id.track));
        view.findViewById(R.id.track).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getActivity(), SRMSLocation.class));
            }
        });

    }
}
