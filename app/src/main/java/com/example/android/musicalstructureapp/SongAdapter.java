package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//This adapter produces the layout for list of songs
public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item_songs, parent, false);
        }
        TextView song = view.findViewById(R.id.text_songs_artistName);
        TextView artist = view.findViewById(R.id.text_songs_songName);
        ImageView image = view.findViewById(R.id.image_songs_coverArt);
        Song songObject = getItem(position);
        song.setText(songObject.getSong());
        artist.setText(songObject.getArtist());
        image.setImageResource(songObject.getCover());
        image.setTag(songObject.getCover());
        return view;
    }
}
