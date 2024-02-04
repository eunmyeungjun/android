package com.example.image_search.adapters


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.image_search.data.Document

import com.example.image_search.databinding.SearchItemBinding
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

class RVAdapter(val items : MutableList<Document>) : RecyclerView.Adapter<RVAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = SearchItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    interface LikeClick {
        fun onLikeClicked(data: Document)
    }
    //+ 아이템 초기화 부분
    fun clearItem() {
        items.clear()
        notifyDataSetChanged()
    }

     var likeClickListener : LikeClick? = null



    inner class Holder( val binding : SearchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind (data : Document) {
            val thumbnailImage = binding.ivThumbnail
            val siteName = binding.tvSiteName
            val date = binding.tvDate
            val like = binding.ivLike

            Glide.with(itemView.context).load(data.thumbnail_url).into(thumbnailImage)
            siteName.text = data.display_sitename
            date.text = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .format(OffsetDateTime.parse(data.datetime))

            if (data.isLiked) {
                like.visibility = View.VISIBLE
            } else {
                like.visibility = View.GONE
            }

            itemView.setOnClickListener {
                likeClickListener?.onLikeClicked(data)
                data.isLiked = !data.isLiked
                Log.d("로그디","정보변경 성공 ${data.isLiked} ${data}")
                if (data.isLiked) {
                    like.visibility = View.VISIBLE
                } else {
                    like.visibility = View.GONE
                }

            }

        }

    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = items[position]
        holder.bind(item)
//
//        holder.itemView.setOnClickListener {
//            item.isLiked = true
//            Log.d("로그디","어댑터 내부에서 데이터변경 ,포지션 : ${position} 로그위치 :onbindviewholder")
//        }



    }

    override fun getItemCount(): Int {
        return items.size
    }



}