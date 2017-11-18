package com.example.abraham.googlebooks.Service

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.abraham.googlebooks.Models.Book
import com.example.abraham.googlebooks.R
import com.squareup.picasso.Picasso


class BookAdapter: RecyclerView.Adapter<BookAdapter.BookHolder> () {
    override fun onBindViewHolder(holder: BookHolder?, position: Int) {
        holder?.bindData(books[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookHolder {
        val inflater = LayoutInflater.from(parent?.context)
        val view = inflater.inflate(R.layout.book_card, parent, false)
        return BookHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    fun updateBooks(books: List<Book>) {
        this.books.clear()
        this.books.addAll(books)
        notifyDataSetChanged()
    }

    val books: MutableList<Book> = mutableListOf()

    inner class BookHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val titleTV: TextView by lazy { itemView.findViewById<TextView>(R.id.title) }
        val publishTV: TextView by lazy {itemView.findViewById<TextView>(R.id.publishDate)}
        val thumbnailIV: ImageView by lazy { itemView.findViewById<ImageView>(R.id.thumbnail)}

        fun bindData(book: Book) {
            titleTV.text = book.volumeInfo.title
            publishTV.text = book.volumeInfo.publishedDate
//            Picasso.with(itemView.context).load("url-del-thumnail").into(thumbnailIV)
        }
    }
}