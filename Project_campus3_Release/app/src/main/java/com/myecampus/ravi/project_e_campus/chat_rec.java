package com.myecampus.ravi.project_e_campus;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class chat_rec extends RecyclerView.ViewHolder  {



    TextView leftText,rightText;

    public chat_rec(View itemView){
        super(itemView);

        leftText = (TextView)itemView.findViewById(R.id.LeftText);
        rightText = (TextView)itemView.findViewById(R.id.rightText);


    }
}