package com.example.minhquan.besttrip.api

import com.example.minhquan.besttrip.model.mapdata.ResultAddress
import com.example.minhquan.besttrip.model.mapdata.ResultRoute
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface GoogleApiService {

    @GET("/maps/api/directions/json")
    fun getRoute(@Query("origin") origin: String,
                 @Query("destination") destination: String)
            : Observable<ResultRoute>

    @GET("maps/api/geocode/json")
    fun getAddress(@Query("latlng") latlng: String)
            : Observable<ResultAddress>

    companion object {
        const val BASE_URL: String = "https://maps.googleapis.com"
    }
}