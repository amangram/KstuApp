package com.example.kstuapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.support.v7.widget.RecyclerView

class NewsAdapter(private val list: List<News>)
    : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val news: News = list[position]
        holder.bind(news)
    }

    override fun getItemCount(): Int = list.size

}

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.news_item, parent, false)) {
    private var _titleView: TextView? = null
    private var _dateView: TextView? = null


    init {
        _titleView = itemView.findViewById(R.id.news_title)
        _dateView = itemView.findViewById(R.id.news_date)
    }

    fun bind(news: News) {
        _titleView?.text = news.title
        _dateView?.text = news.date.toString()
    }

}