package com.example.strawberrydrink.data.database

import androidx.room.Database
import com.example.strawberrydrink.data.DrinkRemoteEntity

object DrinkDatabase {

    fun getAll(): List<DrinkRemoteEntity> {
        return listOf(
            DrinkRemoteEntity(idDrink= "0", strDrink = "A vida é linda bebida", strDrinkThumb = "Drink1"),
            DrinkRemoteEntity(idDrink= "1", strDrink = "havana no matata", strDrinkThumb = "Drink2"),
            DrinkRemoteEntity(idDrink= "2", strDrink = "Contrata a gente para a venturus", strDrinkThumb = "Drink1"),
            DrinkRemoteEntity(idDrink= "3", strDrink = "asdasdasda", strDrinkThumb = "Drink1"),
        )
    }
}