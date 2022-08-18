package com.pauljuma.shoppinglist.UI.shoppinglist

import com.pauljuma.shoppinglist.Data.db.Entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item: ShoppingItem){

    }
}