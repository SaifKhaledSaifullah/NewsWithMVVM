package com.saif.newswithmvvm.api

import com.saif.newswithmvvm.NewsRespons
import com.saif.newswithmvvm.utils.Constant
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        country: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constant.API_KEY
    ): Response<NewsRespons>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("country")
        country: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constant.API_KEY
    ): Response<NewsRespons>
}