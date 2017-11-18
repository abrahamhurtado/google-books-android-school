package com.example.abraham.googlebooks.Models

import com.google.gson.annotations.SerializedName

/**
 * Created by Abraham on 11/18/2017.
 */
data class VolumeInfo (
        @SerializedName("title") val title : String,
        @SerializedName("authors") val authors : List<String>,
        @SerializedName("publisher") val publisher : String,
        @SerializedName("publishedDate") val publishedDate : String,
        @SerializedName("description") val description : String,
        @SerializedName("intrustryIdentifiers") val industryIndentifiers : List<IndustryIdentifier>,
        @SerializedName("readingModes") val readingModes : ReadingModes,
        @SerializedName("pageCount") val pageCount : Int,
        @SerializedName("printType") val printType : String,
        @SerializedName("categories") val categories : List<String>,
        @SerializedName("maturityRating") val maturityRating: String,
        @SerializedName("allowAnonLogging") val allowAnonLoggin : Boolean,
        @SerializedName("contentVersion") val contentVersion : String,
        @SerializedName("imageLinks") val imageLinks : ImageLinks,
        @SerializedName("language") val language : String,

) {
}