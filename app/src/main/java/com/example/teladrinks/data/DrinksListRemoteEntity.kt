package com.example.strawberrydrink.data

import com.google.gson.annotations.SerializedName

data class DrinksListRemoteEntity(
    @SerializedName("drinks")
    val drinkList: List<DrinkRemoteEntity>
)