package com.example.abraham.googlebooks.Models

import com.google.gson.annotations.SerializedName

/**
 * Created by Abraham on 11/18/2017.
 */
data class ImageLinks (
     @SerializedName("smallThumbnail") val smallThumbnail: String,
     @SerializedName("thumbnail") val thumbnail : String
) {
}