package com.example.image_search.retrofit


import com.example.image_search.data.SearchRespone
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

private val key = "ac1b89aff7495356cbc3445f9c4b9dee"

interface NetWorkInterface {
    @GET("v2/search/image")
   // @GET("https://dapi.kakao.com/v2/search/image")

     fun searchResult (
        @Header("Authorization") apiKey : String = "KakaoAK ${key}" ,
        @Query("query") query : String
    ) : Call<SearchRespone>

}