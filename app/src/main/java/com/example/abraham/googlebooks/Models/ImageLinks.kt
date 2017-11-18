package com.example.abraham.googlebooks.Models

import com.google.gson.annotations.SerializedName

/**
 * Created by Abraham on 11/18/2017.
 */
data class ImageLinks (
     @SerializedName("smallThumbnail") val smallThumbnail: String,
     @SerializedName("thumbnail") val thumbnail : String,
     @SerializedName("small") val small : String,
     @SerializedName("medium") val medium : String,
     @SerializedName("large") val large : String,
     @SerializedName("extraLarge") val extraLarge : String
) {
}