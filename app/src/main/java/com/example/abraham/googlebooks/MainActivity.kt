package com.example.abraham.googlebooks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.abraham.googlebooks.Models.Book
import com.example.abraham.googlebooks.Models.VolumesSearchResult
import com.example.abraham.googlebooks.Service.BookAdapter
import com.example.abraham.googlebooks.Service.GoogleBookClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
        val googleBookClient = retrofit.create(GoogleBookClient::class.java)
        googleBookClient.getBooks().enqueue(
                object  : Callback<VolumesSearchResult>{
                    override fun onFailure(call: Call<VolumesSearchResult>?, t: Throwable?) {

                    }

                    override fun onResponse(call: Call<VolumesSearchResult>?, response: Response<VolumesSearchResult>?) {
                        bookAdapter.updateBooks(response?.body()?.items?: listOf())
                    }

                }
        )

    }

}
