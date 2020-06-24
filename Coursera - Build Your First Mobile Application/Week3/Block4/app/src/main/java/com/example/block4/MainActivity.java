package com.example.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer fadedMusic,fadedMusic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fadedMusic = MediaPlayer.create(this, R.raw.faded);
        Switch switch_looping = findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                fadedMusic.setLooping(b);
            }
        });
    }

    public void playMusic(View v){
        fadedMusic.start();
    }

    public void pauseMusic(View v){
        if(fadedMusic.isPlaying()){
            fadedMusic.pause();
        }
    }


}