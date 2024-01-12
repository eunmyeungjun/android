package com.example.applemarket

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applemarket.databinding.RecyclerItemBinding

class RVAdapter (val mItems : MutableList<MarketItem>): RecyclerView.Adapter<RVAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.Holder {
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    interface ItemLongClick {
        fun onLongClick (view: View,position: Int)

    }

    interface ItemClick {
        fun onClick(view : View, position: Int)
    }

    var itemClick : ItemClick? = null
    var itemLongClick : ItemLongClick? = null

    override fun onBindViewHolder(holder: RVAdapter.Holder, position: Int) {
        holder.itemImage.setImageResource(mItems[position].aImage)
        holder.itemName.text = mItems[position].aItemName
        holder.userTown.text = mItems[position].aTown
        holder.itemPrice.text = mItems[position].aPrice
        holder.chatPeople.text = mItems[position].aChatPeople
        holder.heartPeople.text = mItems[position].aHeartPeople

        if (itemClick != null){
            holder.itemView.setOnClickListener {
                itemClick?.onClick(it,position)
            }
        }

        if (itemLongClick != null) {
            holder.itemView.setOnLongClickListener() OnLongClickListener@ {
                itemLongClick?.onLongClick(it,position)
                return@OnLongClickListener true
            }
        }


    }




    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class Holder(val binding : RecyclerItemBinding) : RecyclerView.ViewHolder (binding.root) {
        val itemImage = binding.ivRvItemImage
        val itemName = binding.tvRvItemName
        val userTown = binding.tvRvUserTown
        val itemPrice = binding.tvRvItemPrice
        val chatPeople = binding.tvRvTalkPeople
        val heartPeople = binding.tvRvHeartPeople
    }



}