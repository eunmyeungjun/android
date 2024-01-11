package com.example.applemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MarketItem (
    val aImage : Int ,
    val aItemName : String ,
    val aTown : String ,
    val aPrice : String ,
    val aChatPeople : String ,
    val aHeartPeople : String,
    val aDetail : String ,
    val aUserId : String
) : Parcelable