package com.northcoders.recordshopfront_end.service;

import com.northcoders.recordshopfront_end.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumApiService {

    @GET("albums")
    Call<List<Album>> getAllFruits();
}
