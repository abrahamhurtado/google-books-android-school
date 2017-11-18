package com.example.abraham.googlebooks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.abraham.googlebooks.json.`object`.BookDos


import com.github.salomonbrys.kotson.*
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonString = "";

        val gson = Gson()
        val list1 = gson.fromJson<List<BookDos>>(jsonString);
    }

}
