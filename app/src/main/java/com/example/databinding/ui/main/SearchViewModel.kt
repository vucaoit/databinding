package com.example.databinding.ui.main

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import java.util.*

class SearchViewModel : ViewModel() {
    val searchResultListing = SearchResultListing()

    fun add(view:View) {
        var list = searchResultListing.searchResultList
        list.add(newItem(Peer("123123", "peer ${searchResultListing.searchResultList.size + 1}","123123"),view))
        searchResultListing.searchResultList = list
    }
    private fun newItem(peer: Peer,view: View): SearchResultItemModel {
        return SearchResultItemModel(peer, generateId(),
            onClickDelete = { uuid ->
                val list = mutableListOf<SearchResultItemModel>()
                list.addAll(searchResultListing.searchResultList)
                list.remove(searchResultListing.searchResultList.firstOrNull{
                    item->item.UUID == uuid
                })
                searchResultListing.searchResultList = list
            },
            onClickViewDetail = {
                Toast.makeText(view.context,"${peer.name}",Toast.LENGTH_SHORT).show()
            }
        )
    }

    private fun generateId(): String {
        var id = UUID.randomUUID().toString()
        while (searchResultListing.searchResultList.firstOrNull { item -> item.UUID == id } != null) {
            id = UUID.randomUUID().toString()
        }
        return id
    }
    data class Peer(val id: String, val name: String, val gg: String)
}