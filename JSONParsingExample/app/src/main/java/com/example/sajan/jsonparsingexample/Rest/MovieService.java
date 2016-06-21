package com.example.sajan.jsonparsingexample.Rest;

/**
 * Created by Sajan on 20-Jun-16.
 */




        import com.example.sajan.jsonparsingexample.Rest.Model.Response.MovieDetails;

        import retrofit2.Call;
        import retrofit2.http.GET;
        import retrofit2.http.Path;
        import retrofit2.http.Query;

/**
 * Created by blaze on 6/15/16.
 */
public interface MovieService {

    @GET("3/movie/{movie_id}")
    Call<MovieDetails> getMoviesInfo(@Path("movie_id") String movie_id, @Query("api_key") String apiKey);
    //@GET("3/movie/{id}/reviews")
    //Call<MovieDetails> getComments(@Path("id") int id, @Query("api_key") String apiKey);
    //@GET("3/movie/{id}/videos")
    //Call<MovieDetails> getMovieTrailer(@Path("id") int id, @Query("api_key") String apiKey);
}
