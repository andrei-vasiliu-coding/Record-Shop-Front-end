package com.northcoders.recordshopfront_end.ui.addalbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.northcoders.recordshopfront_end.model.Album;
import com.northcoders.recordshopfront_end.ui.mainactivity.MainActivity;
import com.northcoders.recordshopfront_end.ui.mainactivity.MainActivityViewModel;

public class AddAlbumClickHandlers {

    private Album album;
    private Context context;
    private MainActivityViewModel viewModel;

    public AddAlbumClickHandlers(Album album, Context context, MainActivityViewModel viewModel) {
        this.album = album;
        this.context = context;
        this.viewModel = viewModel;
    }

    public void onSubmitButtonClicked(View view) {

        if(album.getTitle() == null || album.getArtist() == null || album.getGenre() == null
        || album.getReleaseYear() == null || album.getDescription() == null) {
            Toast.makeText(context, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(context, MainActivity.class);
            Album newAlbum = new Album(
                    album.getId(),
                    album.getTitle(),
                    album.getArtist(),
                    album.getGenre(),
                    album.getReleaseYear(),
                    album.getDescription());
            viewModel.addAlbum(newAlbum);
            context.startActivity(intent);
        }
    }

    public void onBackButtonClicked(View view) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
