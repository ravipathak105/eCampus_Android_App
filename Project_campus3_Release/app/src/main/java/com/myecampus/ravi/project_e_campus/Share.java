package com.myecampus.ravi.project_e_campus;


import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import static android.content.Context.CLIPBOARD_SERVICE;
import static android.content.Context.DOWNLOAD_SERVICE;


/**
 * A simple {@link Fragment} subclass.
 */
public class Share extends Fragment {
    EditText share;
    private ClipData myClip;
  private ClipboardManager myClipboard;
    Button copy,update,downloads;
    DownloadManager downloadManager;


    public Share() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_share, container, false);
        share = (EditText) view.findViewById(R.id.link);
        copy=(Button) view.findViewById(R.id.copybtn);
        update=(Button)view.findViewById(R.id.update);
        downloads=(Button)view.findViewById(R.id.downloads);
        YoYo.with(Techniques.BounceInDown)
                .duration(10000)
                .repeat(0)
                .playOn(view.findViewById(R.id.thank));
        YoYo.with(Techniques.BounceInDown)
                .duration(9000)
                .repeat(0)
                .playOn(view.findViewById(R.id.myname));
        YoYo.with(Techniques.BounceInDown)
                .duration(2500)
                .repeat(0)
                .playOn(view.findViewById(R.id.sharecard));
      myClipboard = (ClipboardManager)getActivity().getSystemService(CLIPBOARD_SERVICE);

        String s="https://drive.google.com/drive/folders/1s8mDvOQN-b3rL5DhiArFPHJkEQjjyV_F?usp=sharing";
        share.setText(s);
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(600)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.copybtn));
                String s="https://drive.google.com/open?id=1hHFjocYFCspx99fU8aHRbuVLVP5nOaHq";
                 String text = share.getText().toString();
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getActivity(), "Link Copied",
                        Toast.LENGTH_SHORT).show();

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(600)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.update));
                downloadManager=(DownloadManager)getActivity().getSystemService(DOWNLOAD_SERVICE);
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse("https://drive.google.com/drive/folders/1s8mDvOQN-b3rL5DhiArFPHJkEQjjyV_F?usp=sharing"));
                Toast.makeText(getActivity(), "Downloading...", Toast.LENGTH_SHORT).show();
                downloadManager.enqueue(request);

            }
        });
        downloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceInUp)
                        .duration(600)
                        .repeat(0)
                        .playOn(v.findViewById(R.id.downloads));
                Intent intent=new Intent();
                intent.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
                startActivity(intent);
            }
        });

        return view;
    }

}
