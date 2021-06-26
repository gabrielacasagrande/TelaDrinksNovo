package com.example.strawberrydrink.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


private const val BASE_URL = "https://www.thecocktaildb.com/api/json/v1/1/"

private val retrofit =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build() //tranforma json em object

object CockTailService { //object para so iniciar aqui
    val service : TheCockTailApi by lazy {
        retrofit.create(TheCockTailApi::class.java) }  //para não aocntecer quando defico o ojeto vai por preguiçoso- é uma operação pesada
}

