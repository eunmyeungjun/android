package com.example.listview_ex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ListViewAdapter(val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
       return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var converView = p1

        if(converView == null){
            converView =LayoutInflater.from(parent?.context).inflate(R.layout.listview_item,parent,false)
        }

        return converView!!

    }

}