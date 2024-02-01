package com.example.image_search.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.image_search.data.Document
import com.example.image_search.databinding.SearchItemBinding
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class LikeAdapter(val items : MutableList<Document>) : RecyclerView.Adapter<LikeAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }


    inner class Holder(val binding : SearchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind (data : Document) {
            val thumbnailImage = binding.ivThumbnail
            val siteName = binding.tvSiteName
            val date = binding.tvDate

            Glide.with(itemView.context).load(data.thumbnail_url).into(thumbnailImage)
            siteName.text = data.display_sitename
            date.text = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .format(OffsetDateTime.parse(data.datetime))




        }
    }

    interface cancelClick {
        fun cancleClick(position: Int)
    }

    var cancel : cancelClick? = null


    override fun onBindViewHolder(holder: Holder, position: Int) {
            val item = items[position]
            holder.bind(item)

    }

    override fun getItemCount(): Int {
        return items.size
    }

}

//private fun showPreference(){
//    val sharedPagerAdapter = ac
//}