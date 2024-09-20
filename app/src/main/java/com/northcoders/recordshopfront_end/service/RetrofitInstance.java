package com.northcoders.recordshopfront_end.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = "http://172.28.86.55:8080/api/v1/recordShop/";
    //private static final String BASE_URL = "http://localhost:8080/api/v1/recordShop/";
    //private static final String BASE_URL = "http://RecordShopAPI-env.eba-zw3vmncw.eu-west-2.elasticbeanstalk.com/api/v1/recordShop/";

    public static AlbumApiService getService() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit.create(AlbumApiService.class);
    }
}
