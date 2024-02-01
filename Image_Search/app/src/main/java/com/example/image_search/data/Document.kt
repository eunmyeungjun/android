package com.example.image_search.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Document(
    val collection: String,
    val datetime: String,
    val display_sitename: String,
    val doc_url: String,
    val height: Int,
    val image_url: String,
    val thumbnail_url: String,
    val width: Int ,
    var isLiked : Boolean = false
) : Parcelable