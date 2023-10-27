package com.example.listview_exone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

         override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val list_item= mutableListOf<String>()

             list_item.add("A")
             list_item.add("B")
             list_item.add("C")

             val listview=findViewById<ListView>(R.id.mainListview)

             val ListAdapter =ListViewAdapter(list_item)
            listview.adapter = ListAdapter
         }

}