package com.pauljuma.shoppinglist.UI.shoppinglist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.pauljuma.shoppinglist.Data.db.Entities.ShoppingItem
import com.pauljuma.shoppinglist.R
import kotlinx.android.synthetic.main.shopping_list_recycleview.view.*

class RecycleViewAdapter(var items: List<ShoppingItem>, private val viewModel: ShoppingViewModel) :
    RecyclerView.Adapter<RecycleViewAdapter.ShoppingListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.shopping_list_recycleview, parent, false)

        return ShoppingListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ShoppingListViewHolder, position: Int) {
        val currentShoppingList = items[position]
        holder.itemView.tvName.text = currentShoppingList.name
        holder.itemView.tvAmount.text = "${currentShoppingList.amount}"

        holder.itemView.ivAdd.setOnClickListener {
            currentShoppingList.amount++
            viewModel.upSert(currentShoppingList)
        }

        holder.itemView.ivDelete.setOnClickListener {
            viewModel.delete(currentShoppingList)

        }

        if (currentShoppingList.amount > 0) {

            holder.itemView.ivMinus.setOnClickListener {
                currentShoppingList.amount--
                viewModel.upSert(currentShoppingList)

            }
        }

    }

    override fun getItemCount(): Int {

        return items.size

    }

    inner class ShoppingListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}