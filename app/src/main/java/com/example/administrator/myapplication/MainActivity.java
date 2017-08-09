package com.example.administrator.myapplication;

import android.graphics.Color;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.services.MediaPlayerService;
import com.example.administrator.myapplication.widget.media.IRenderView;
import com.example.administrator.myapplication.widget.media.IjkVideoView;

import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;

public class MainActivity extends AppCompatActivity {
    private String url2 = "http://zv.3gv.ifeng.com/live/zhongwen800k.m3u8";
    private String url3 = "rtsp://184.72.239.149/vod/mp4:BigBuckBunny_115k.mov";
    private String url4 = "http://42.96.249.166/live/24035.m3u8";

//    private IMediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        mediaPlayer = new AndroidMediaPlayer();
//        MediaPlayerService.setMediaPlayer(mediaPlayer);
//        System.out.println("视频 servie： ");
//
        setContentView(R.layout.activity_main);
        //更改提交测试
        initView();
    }

    private void initView() {

//        IjkVideoView ijkVideoView = (IjkVideoView) findViewById(R.id.video_view);
//        ijkVideoView.setAspectRatio(IRenderView.AR_ASPECT_FILL_PARENT);
//        ijkVideoView.setVideoURI(Uri.parse(url2));
//        ijkVideoView.start();
    }

}
