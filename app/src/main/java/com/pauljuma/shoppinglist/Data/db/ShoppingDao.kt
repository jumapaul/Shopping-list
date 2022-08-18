package com.pauljuma.shoppinglist.Data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pauljuma.shoppinglist.Data.db.Entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upSert(item: ShoppingItem)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM SHOPPING_ITEMS")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}