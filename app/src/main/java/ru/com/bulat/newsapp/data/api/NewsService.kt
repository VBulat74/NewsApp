package ru.com.bulat.newsapp.data.api

import retrofit2.http.GET
import retrofit2.http.Query
import ru.com.bulat.newsapp.utils.Constants.Companion.API_KEY


interface NewsService {

    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("q") query :String,
        @Query("page") page :Int = 1,
        @Query("apiKey") apiKey :String = API_KEY,
    )

    suspend fun getHeadLines(
        @Query("country") country :String = "ru",
        @Query("page") page :Int = 1,
        @Query("apiKey") apiKey :String = API_KEY,
    )
}