package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        Song song = (Song) getIntent().getSerializableExtra("song");
        TextView textSongName = findViewById(R.id.text_playing_song);
        TextView textArtist = findViewById(R.id.text_playing_artist);
        ImageView imageCover = findViewById(R.id.image_playing_song);
        textSongName.setText(song.getSong());
        textArtist.setText(song.getArtist());
        imageCover.setImageResource(song.getCover());
        imageCover.setTag(song.getCover());
        ImageView pausePlay = findViewById(R.id.button_pause_play);
        ImageButton playlist = findViewById(R.id.button_playing_playlist);
        final Context context = this;
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SongsActivity.class);
                startActivity(intent);
            }
        });
        //Change the pause button to play and vice versa on click
        pausePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) view;
                if (imageView.getTag().toString().equals("res/drawable-xxhdpi-v4/ic_action_playback_play.png")) {
                    imageView.setImageResource(R.drawable.ic_action_playback_pause);
                    imageView.setTag("res/drawable-xxhdpi-v4/ic_action_playback_pause.png");
                    Log.e("Playing", "It was playing but now paused");
                } else {
                    imageView.setImageResource(R.drawable.ic_action_playback_play);
                    imageView.setTag("res/drawable-xxhdpi-v4/ic_action_playback_play.png");
                    Log.e("Paused", "It was paused but now playing");
                }
            }
        });
    }
}
