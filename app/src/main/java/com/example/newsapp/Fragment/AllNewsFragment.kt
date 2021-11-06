package com.example.newsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.Adapter.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.data.DataNews
import com.example.newsapp.initNewsHeadline

class AllNewsFragment : Fragment() {
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)
        val rvAllNews = view.findViewById<RecyclerView>(R.id.rv_all_news)
        rvAllNews.layoutManager = LinearLayoutManager(view.context)
        rvAllNews.adapter = NewsAdapter(DataNews.dataAllNews)

        val newsHeadLine = view.findViewById<View>(R.id.news_headline)
        initNewsHeadline(view.context, newsHeadLine,1)

        return view
    }


}