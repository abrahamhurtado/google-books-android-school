package com.example.abraham.googlebooks.Models

import com.google.gson.annotations.SerializedName

/**
 * Created by Abraham on 11/18/2017.
 */
data class Book (
        @SerializedName("kind") val kind : String,
        @SerializedName("id") val id: String,
        @SerializedName("etag") val etag: String,
        @SerializedName("selfLink") val selfLink : String,
        @SerializedName("volumeInfo") val volumeInfo : VolumeInfo
) {
}