package com.pauljuma.shoppinglist.Data.Repositories

import com.pauljuma.shoppinglist.Data.db.Entities.ShoppingItem
import com.pauljuma.shoppinglist.Data.db.ShoppingDatabase

class ShoppingRepositories(private val db: ShoppingDatabase) {
    suspend fun upSert(item: ShoppingItem) = db.getShoppingDao().upSert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItem() = db.getShoppingDao().getAllShoppingItems()
}