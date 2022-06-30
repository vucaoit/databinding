package com.example.databinding.ui.main

import android.view.View

class SearchResultItemModel(
    val peer: SearchViewModel.Peer,
    val UUID: String,
    val onClickDelete: (String) -> Unit,
    val onClickViewDetail: ((View) -> Unit)? = null
) {

    fun onItemClick(view: View) {
        onClickDelete(UUID)
    }

    fun onItemClickDetail(view: View) {
        onClickViewDetail?.invoke(view)
    }
}