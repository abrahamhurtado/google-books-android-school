package com.example.abraham.googlebooks.json.`object`

import com.github.salomonbrys.kotson.*
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName

/**
 * Created by joshuansu on 11/18/17.
 */


data class Person(
        @SerializedName("title")  val title: String,
        @SerializedName("thumbnail")  val thumbnail: String,
        @SerializedName("publishedDate")  val publishedDate: String
) {}