package com.example.mywebtoon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items : MutableList<Model>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    //items를 받아온다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.rv_item , parent , false)

        return ViewHolder(view)
    }

    interface ItemClick{
        fun onClick (view : View, position: Int)
    }
    var itemClick : ItemClick? = null


    //받아온 items를 묶어준다.
    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])

        if (itemClick != null){
            holder.itemView.setOnClickListener{v ->
                itemClick?.onClick(v,position)
            }
        }
    }

    //전체 리사이클러 뷰의갯수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(items : Model) {
            val rv_image = itemView.findViewById<ImageView>(R.id.iv_toonleft)
            val rv_text = itemView.findViewById<TextView>(R.id.tv_Items)
            rv_text.text = items.name
            rv_image.setImageResource(items.image)
        }
    }

}