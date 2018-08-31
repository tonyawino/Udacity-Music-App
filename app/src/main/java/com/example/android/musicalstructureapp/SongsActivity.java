package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        SongAdapter adapter = new SongAdapter(this, MainActivity.arrayList);
        ListView listView = findViewById(R.id.list_songs);
        listView.setAdapter(adapter);
        final Context context = this;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView songName = view.findViewById(R.id.text_songs_songName);
                TextView artist = view.findViewById(R.id.text_songs_artistName);
                ImageView coverImage = view.findViewById(R.id.image_songs_coverArt);
                Song song = new Song(songName.getText().toString(), artist.getText().toString(), (int) coverImage.getTag());
                Intent intent = new Intent(context, PlayingActivity.class);
                intent.putExtra("song", song);
                startActivity(intent);

            }
        });
    }
}
