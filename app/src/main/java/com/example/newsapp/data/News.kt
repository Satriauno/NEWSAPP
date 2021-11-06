package com.example.newsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    val title : String,
    val content : String,
    val date : String,
    val author : String,
    val time: String,
    val photo : Int,
    val category : String
    ) : Parcelable
// contoh dari data class
// val data = arrayOf(News("IDN","sekolah",News("Jakarta","Kota"),News("Bogor","Jawa Barat"))