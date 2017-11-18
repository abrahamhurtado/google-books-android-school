package com.example.abraham.googlebooks.json.`object`
import com.github.salomonbrys.kotson.*
import com.google.gson.JsonObject

/**
 * Created by joshuansu on 11/18/17.
 */

class BookDos(public val obj: JsonObject) {
    val publishedDate: String by obj["items"]["volumeInfo"].byString("publishedDate")
    val thumbnail: String by obj["items"]["volumeInfo"]["imageLinks"].byString("thumbnail")
    val title: String by obj["items"]["volumeInfo"].byString("title")
}