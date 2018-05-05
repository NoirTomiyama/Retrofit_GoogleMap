package com.lifeistech.android.retorfitdemo.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface PlaceApiService {

    @Headers("Accept-Language: ja")
    @GET("/maps/api/place/search/json?")
    Call<Response> requestPlaces(@Query("location") String location,
                                 @Query("radius") int radius,
                                 @Query("type") String type,
                                 @Query("key") String key);

}
