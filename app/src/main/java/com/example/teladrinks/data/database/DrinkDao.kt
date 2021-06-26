package com.example.strawberrydrink.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.strawberrydrink.data.DrinkRemoteEntity

@Dao
interface DrinkDao {
    //@Query("SELECT * FROM drink_table ORDER BY item_level ASC")
   // fun getAll(): <List<DrinkRemoteEntity>

    //@Insert
    //fun addNewItem(item: DrinkRemoteEntity)
}