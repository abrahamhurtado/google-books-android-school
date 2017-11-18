package com.example.abraham.googlebooks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.abraham.googlebooks.Models.VolumesSearchResult
import com.example.abraham.googlebooks.Service.BookAdapter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {


    val bookAdapter = BookAdapter()
    val bookRV: RecyclerView by lazy {findViewById<RecyclerView>(R.id.recyclerView)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bookRV.layoutManager = LinearLayoutManager(this)
        bookRV.adapter = bookAdapter

        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val bookResult = retrofit.create(VolumesSearchResult::class.java)


    }

}
