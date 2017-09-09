package com.example.trw.sampleapi.http;

import com.example.trw.sampleapi.dao.Collection;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("byurl")
    Call<Collection> Repos(@Query("url") String url
            , @Query("key") String Key);
}
