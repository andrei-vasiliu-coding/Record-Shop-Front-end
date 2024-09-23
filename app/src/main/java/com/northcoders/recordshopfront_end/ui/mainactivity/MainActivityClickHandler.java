package com.northcoders.recordshopfront_end.ui.mainactivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

import com.northcoders.recordshopfront_end.ui.addalbum.AddNewAlbumActivity;

public class MainActivityClickHandler {

    Context context;

    public MainActivityClickHandler(Context context) {
        this.context = context;
    }

    public void onFABClicked (View view) {

        // Add a log statement or toast to confirm the click is working
        //Log.d("FABClick", "Floating Action Button Clicked");
        //Toast.makeText(context, "FAB Clicked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(view.getContext(), AddNewAlbumActivity.class);

        context.startActivity(intent);
    }
}
