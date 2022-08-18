package com.pauljuma.shoppinglist.UI.shoppinglist

import androidx.lifecycle.ViewModel
import com.pauljuma.shoppinglist.Data.Repositories.ShoppingRepositories
import com.pauljuma.shoppinglist.Data.db.Entities.ShoppingItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(private val repository: ShoppingRepositories): ViewModel() {

    fun upSert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upSert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItem()
}