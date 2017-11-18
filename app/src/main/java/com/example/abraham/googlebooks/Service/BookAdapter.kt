package com.example.abraham.googlebooks.Service

import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.abraham.googlebooks.Models.Book
import com.example.abraham.googlebooks.R
import com.squareup.picasso.Picasso


class BookAdapter(val clickListener : View.OnClickListener): RecyclerView.Adapter<BookAdapter.BookHolder> () {
    override fun onBindViewHolder(holder: BookHolder?, position: Int) {
        holder?.bindData(books[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BookHolder {
        val inflater = LayoutInflater.from(parent?.context)
        val view = inflater.inflate(R.layout.book_card, parent, false)
        return BookHolder(view, clickListener)
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

    inner class BookHolder: RecyclerView.ViewHolder {
        lateinit var titleTV: TextView
        lateinit var publishTV: TextView
        lateinit var thumbnailIV: ImageView

        constructor(itemView: View, cl : View.OnClickListener) : super(itemView) {
            titleTV =  itemView.findViewById<TextView>(R.id.title)
            publishTV =  itemView.findViewById<TextView>(R.id.publishDate)
            thumbnailIV =  itemView.findViewById<ImageView>(R.id.thumbnail)
            itemView.setOnClickListener(View.OnClickListener {
                cl.onClick(itemView)
            })
        }

        fun bindData(book: Book) {
            itemView.tag = book.id
            titleTV.text = book.volumeInfo.title
            publishTV.text = book.volumeInfo.publishedDate
            Picasso.with(itemView.context).load(book.volumeInfo.imageLinks.thumbnail).into(thumbnailIV)

        }
    }
}