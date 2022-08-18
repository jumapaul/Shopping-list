package com.pauljuma.shoppinglist.UI.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pauljuma.shoppinglist.Data.Repositories.ShoppingRepositories

@Suppress("UNCHECKED_CAST")
class ShoppingViewModelFactory(private val repository: ShoppingRepositories) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}