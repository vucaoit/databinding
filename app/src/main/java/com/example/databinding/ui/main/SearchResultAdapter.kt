package com.example.databinding.ui.main

import android.app.Activity
import android.util.Log
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ItemSearchResultBinding

class SearchResultAdapter() :
    ListAdapter<SearchResultItemModel, SearchResultAdapter.ViewHolder>(
        SearchResultDiffCallback()
    ) {

    class SearchResultDiffCallback : DiffUtil.ItemCallback<SearchResultItemModel>() {
        override fun areItemsTheSame(
            oldItem: SearchResultItemModel,
            newItem: SearchResultItemModel
        ): Boolean {
            return oldItem.UUID == newItem.UUID
        }

        override fun areContentsTheSame(
            oldItem: SearchResultItemModel,
            newItem: SearchResultItemModel
        ): Boolean {
            return oldItem == newItem
        }

    }

    inner class ViewHolder(val binding: ItemSearchResultBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSearchResultBinding.inflate((parent.context as Activity).layoutInflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = getItem(position)
        holder.binding.itemSearchResultModel = item
    }

    override fun submitList(list: MutableList<SearchResultItemModel>?) {
        val i = if(itemCount == 0) 0 else itemCount
        super.submitList(list ?: listOf())
        notifyItemRangeInserted(i,list?.size?:0)
    }

    companion object{
        @JvmStatic
        @BindingAdapter("SearchResultList")
        fun getSearchResultList(recyclerView: RecyclerView,list : MutableList<SearchResultItemModel> ?){
            val adapter = if(recyclerView.adapter != null && recyclerView.adapter is SearchResultAdapter){
                recyclerView.adapter as SearchResultAdapter
            } else{
                SearchResultAdapter()
            }
            adapter.submitList(list)
        }
    }
}