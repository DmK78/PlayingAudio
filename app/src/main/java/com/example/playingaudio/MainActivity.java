package com.example.playingaudio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.malbek);


    }

    public void play(View view) {
        Button button = findViewById(R.id.playButton);
        if (!isPlaying) {
            mediaPlayer.start();
            button.setText("Pause");
            isPlaying=true;
        } else {
            mediaPlayer.pause();
            button.setText("Play");
            isPlaying=false;
        }

    }


}
