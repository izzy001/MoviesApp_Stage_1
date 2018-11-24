package com.izzy.android.c_movie.network;

import com.izzy.android.c_movie.model.Movie.Result;
import com.izzy.android.c_movie.model.Review.ReviewResponse;
import com.izzy.android.c_movie.model.Trailer.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/{sorting}")
    Call<Result> getMovies(@Path("sorting") String sort, @Query(ApiConstants.API_KEY_LABEL) String apiKey);

    @GET(ApiConstants.REVIEWS)
    Call<ReviewResponse> getReviews(@Path("id") int id, @Query(ApiConstants.API_KEY_LABEL) String apiKey);

    @GET(ApiConstants.TRAILERS)
    Call<TrailerResponse> getTrailers(@Path("id") int id, @Query(ApiConstants.API_KEY_LABEL) String apiKey);
}
