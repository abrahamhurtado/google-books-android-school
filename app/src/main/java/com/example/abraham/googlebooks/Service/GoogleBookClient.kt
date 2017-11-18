package com.example.abraham.googlebooks.Service

import com.example.abraham.googlebooks.Models.VolumeInfo
import com.example.abraham.googlebooks.Models.VolumesSearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface GoogleBookClient {
    @GET("/books/v1/volumes?q=android&startIndex=0&maxResults=10")
    fun getBooks(): Call<VolumesSearchResult>

    @GET("/books/v1/volumes/{volumeId}")
    fun getBookById(@Path("volumeId") id: String): Call<VolumeInfo>
}

