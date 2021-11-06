package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.Adapter.SectionPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolBar))

        val vpNews = findViewById<ViewPager2>(R.id.vp_news)
        vpNews.adapter = SectionPagerAdapter(this)

        val tabs = findViewById<TabLayout>(R.id.tabs)

        val list = arrayOf("All", "Top", "Popular")
        TabLayoutMediator(tabs, vpNews,) { tab, position ->
            tab.text = list[position]
        }.attach()

    }
}