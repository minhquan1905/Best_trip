package com.example.minhquan.besttrip.api

import com.example.minhquan.besttrip.model.ResultRoute
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface GoogleApiService {

    @GET("/maps/api/directions/json")
    fun getRoute(@Query("origin") origin: String,
                 @Query("destination") destination: String)
            : Observable<ResultRoute>

    companion object {
        const val BASE_URL: String = "https://maps.googleapis.com"
    }
}