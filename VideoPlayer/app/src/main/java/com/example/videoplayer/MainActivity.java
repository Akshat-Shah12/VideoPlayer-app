package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myVideoView;
    MediaController mcontroller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontroller=new MediaController(this);
        myVideoView = findViewById(R.id.videoView);

        myVideoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        Log.i("check",getPackageName());
        mcontroller.setAnchorView(myVideoView);
        myVideoView.setMediaController(mcontroller);
        myVideoView.start();
    }
}