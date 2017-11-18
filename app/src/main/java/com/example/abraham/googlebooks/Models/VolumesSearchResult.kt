package com.example.abraham.googlebooks.Models

import com.google.gson.annotations.SerializedName

/**
 * Created by Abraham on 11/18/2017.
 */
data class VolumesSearchResult (
        @SerializedName("kind") val kind : String,
        @SerializedName("totalItems") val totalItems: Int,
        @SerializedName("items") val items : List<Book>
) {
}