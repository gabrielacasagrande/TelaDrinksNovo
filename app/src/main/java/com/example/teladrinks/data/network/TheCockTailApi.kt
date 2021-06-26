package com.example.strawberrydrink.data.network

import com.example.strawberrydrink.data.DrinksListRemoteEntity
import retrofit2.http.GET

interface TheCockTailApi {
    @GET("filter.php?a=Alcoholic")
    suspend fun getDrinks(): DrinksListRemoteEntity

    @GET("filter.php?a=Non_Alcoholic")
    suspend fun getDrinksNoAlcoholic(): DrinksListRemoteEntity
}

