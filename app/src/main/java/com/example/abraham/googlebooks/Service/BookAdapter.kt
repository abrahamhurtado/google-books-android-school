package com.example.abraham.googlebooks.Service

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.abraham.googlebooks.Models.Book
import com.example.abraham.googlebooks.R
import com.squareup.picasso.Picasso

/**
 * Created by gaverdugo on 18/11/17.
 */

class BooksAdapter: RecyclerView.Adapter<BooksAdapter.BookHolder> () {
    override fun onBindViewHolder(holder: BookHolder?, position: Int) {
        holder?.bindData(books[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return books.size
    }

    val books: MutableList<Book> = mutableListOf()

    inner class BookHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val titleTV: TextView by lazy { itemView.findViewById<TextView>(R.id.title) }
        val publishTV: TextView by lazy {itemView.findViewById<TextView>(R.id.publishDate)}
        val thumbnailIV: ImageView by lazy { itemView.findViewById<ImageView>(R.id.thumbnail)}

        fun bindData(book: Book) {
            titleTV.text = book.volumeInfo.title
            publishTV.text = book.volumeInfo.publishedDate
            Picasso.with(itemView.context).load("url-del-thumnail").into(thumbnailIV)
        }
    }
}