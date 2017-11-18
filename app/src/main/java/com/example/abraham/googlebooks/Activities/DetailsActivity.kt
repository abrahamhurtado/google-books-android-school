package com.example.abraham.googlebooks.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.abraham.googlebooks.Models.VolumeInfo
import com.example.abraham.googlebooks.R
import com.example.abraham.googlebooks.Service.GoogleBookClient
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.handset_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val retrofit = Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val googleBookClient = retrofit.create(GoogleBookClient::class.java)

        googleBookClient.getBookById(intent.getStringExtra("id")).enqueue(
                object : Callback<VolumeInfo> {
                    override fun onResponse(call: Call<VolumeInfo>?, response: Response<VolumeInfo>?) {
                        Picasso.with(applicationContext).load(response?.body()?.imageLinks?.large).into(bookImage)
                        publishDate.text = response?.body()?.publishedDate
                        authors.text = response?.body()?.authors.toString()
                        description.text = response?.body()?.description
                    }

                    override fun onFailure(call: Call<VolumeInfo>?, t: Throwable?) {
                        // oh shit waddup
                    }

                }
        )
    }
}
