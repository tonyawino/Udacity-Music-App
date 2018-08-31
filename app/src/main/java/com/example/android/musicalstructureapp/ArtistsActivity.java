package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArtistsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        //Get distinct artists
        TreeSet<Song> set = new TreeSet<>(MainActivity.arrayList);
        ArrayList<Song> array = new ArrayList<>(set);
        ArtistAdapter adapter = new ArtistAdapter(this, array);
        GridView gridView = findViewById(R.id.grid_artists);
        gridView.setAdapter(adapter);
        final Context context = this;
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context, ArtistSongsActivity.class);
                TextView artist = view.findViewById(R.id.text_artists_artist);
                //Pass the artist to the ArtistSongs activity
                intent.putExtra("artist", artist.getText());
                startActivity(intent);
            }
        });
    }
}
