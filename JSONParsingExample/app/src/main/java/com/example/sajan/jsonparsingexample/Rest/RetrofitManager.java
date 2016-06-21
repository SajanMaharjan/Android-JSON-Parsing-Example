package com.example.sajan.jsonparsingexample.Rest;


import com.example.sajan.jsonparsingexample.BuildConfig;
import com.example.sajan.jsonparsingexample.Rest.Model.Response.MovieDetails;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sajan on 20-Jun-16.
 */
public class RetrofitManager {

    public static Retrofit retrofit = null;
    public static MovieService service = null;
    public static RetrofitManager retrofitManager = null;


    public RetrofitManager() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.MOVIE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        service = retrofit.create(MovieService.class);
    }


    public void getMoviesInfo(String movieId, String api_key, Callback<MovieDetails> callback) {
        Call<MovieDetails> movieDetailsCall = service.getMoviesInfo(movieId, api_key);
        movieDetailsCall.enqueue(callback);
    }


    public static RetrofitManager getInstance() {
        if (retrofitManager == null) {
            retrofitManager = new RetrofitManager();
        }
        return retrofitManager;
    }

}
