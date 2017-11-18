package com.example.abraham.googlebooks.Service

import com.example.abraham.googlebooks.Models.VolumesSearchResult
import retrofit2.Call
import retrofit2.http.GET


interface GoogleBookClient {
    @GET("/books/v1/volumes?q=android&startIndex=0&maxResults=10")
    fun getBooks(): Call<VolumesSearchResult>
}

