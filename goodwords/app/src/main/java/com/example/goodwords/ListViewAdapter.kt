package com.example.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<String>) :BaseAdapter() {
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

        var convertView = convertView

        if(convertView == null){
            convertView =LayoutInflater.from(parent?.context).inflate(R.layout.listview_item,parent,false)
        }

        val listviewText =convertView.findViewById<TextView>(R.id.listViewTextArea)
        List[p0].also { listviewText!!.text = it }

            return convertView
    }
}