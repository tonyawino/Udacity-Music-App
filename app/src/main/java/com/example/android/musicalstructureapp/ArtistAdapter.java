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

//This class produces the layout for the ArtistActivity
public class ArtistAdapter extends ArrayAdapter<Song> {

    public ArtistAdapter(Context context, ArrayList<Song> artists) {
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item_artists, parent, false);
        }
        ImageView cover = view.findViewById(R.id.image_artists_cover);
        TextView artist = view.findViewById(R.id.text_artists_artist);
        Song song = getItem(position);
        //Set tag to be able to reference the image in the drawable
        cover.setTag(song.getCover());
        cover.setImageResource(song.getCover());
        artist.setText(song.getArtist());
        return view;
    }
}
