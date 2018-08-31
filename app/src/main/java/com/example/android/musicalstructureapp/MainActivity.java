package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected static ArrayList<Song> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView songs = findViewById(R.id.image_main_allSongs);
        ImageView artists = findViewById(R.id.image_main_allArtists);
        final Context context = this;
        arrayList.add(new Song("Tony's Song", "Tony", R.drawable.all_artists));
        arrayList.add(new Song("Best of Alpha Blondy", "Alpha Blondy", R.drawable.alphablondy_bestof));
        arrayList.add(new Song("Anthem", "Black Uhuru", R.drawable.blackuhuru_anthem));
        arrayList.add(new Song("Sinsemilla", "Black Uhuru", R.drawable.blackuhuru_sinsemilla));
        arrayList.add(new Song("Rebel", "Bob Marley and the Wailers", R.drawable.bobmarley_rebel));
        arrayList.add(new Song("Uprising", "Bob Marley and the Wailers", R.drawable.bobmarley_uprising));
        arrayList.add(new Song("Barrington levy", "Bounty Hunter", R.drawable.bountyhunter_barringtonlevy));
        arrayList.add(new Song("Til shiloh", "Buju Banton", R.drawable.bujubanton_tilshiloh));
        arrayList.add(new Song("Mek we dweet", "Burning Spear", R.drawable.burningspear_mekwedweet));
        arrayList.add(new Song("The marshall", "Cocoa Tea", R.drawable.cocoatea_themarshall));
        arrayList.add(new Song("Welcome to Jamrock", "Damian Marley", R.drawable.damianmarley_welcometojamrock));
        arrayList.add(new Song("King addies", "Danny Dread", R.drawable.dannydread_kingaddies));
        arrayList.add(new Song("Night nurse", "Gregory Isaacs", R.drawable.gregoryisaacs_nightnurse));
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SongsActivity.class);
                startActivity(intent);
            }
        });
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ArtistsActivity.class);
                startActivity(intent);
            }
        });
    }
}
