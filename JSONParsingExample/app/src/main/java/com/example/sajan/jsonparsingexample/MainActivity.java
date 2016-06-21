package com.example.sajan.jsonparsingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sajan.jsonparsingexample.Rest.Model.Response.MovieDetails;
import com.example.sajan.jsonparsingexample.Rest.Model.Response.ProductionCompany;
import com.example.sajan.jsonparsingexample.Rest.RetrofitManager;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    RetrofitManager retrofitManager = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //register the retrofit for network call
        retrofitManager = RetrofitManager.getInstance();
        Log.i(TAG, "onCreate: ");

        retrofitManager.getMoviesInfo("500", "fd0e089aa60d9b0c946e70c99935da88", new Callback<MovieDetails>() {
            @Override
            public void onResponse(Call<MovieDetails> call, Response<MovieDetails> response) {
                Log.i("success", "onResponse: ");
                if (response.code()==200){
                    Log.i("success", "onResponse: "+response.body().getOriginal_title());
                    Log.i("success", "onResponse: "+response.body().getAdult());
                    Log.i(TAG, "onResponse: "+response.body().getProductionCompanyList());
                //    ArrayList<MovieDetails> movieDetailArrayList = response.body();

                    for(ProductionCompany productionCompany:response.body().getProductionCompanyList()){
                        Log.i("success", "onResponse: "+productionCompany.getName());
                    }
                }
            }

            @Override
            public void onFailure(Call<MovieDetails> call, Throwable t) {
                Log.i("Failure", "onFailure: ");
                Log.i("Failure", "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
}
