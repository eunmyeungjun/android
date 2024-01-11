package com.example.applemarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applemarket.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBtnBack.setOnClickListener {
            finish()
        }

        var intent : Intent = intent
        val inputData =intent.getParcelableExtra<MarketItem>("data")

        if (inputData != null) {
            binding.ivGoods.setImageResource(inputData.aImage)
            binding.tvUserId.text = inputData.aUserId
            binding.tvTitle.text = inputData.aItemName
            binding.tvUserTown.text = inputData.aTown
            binding.tvDetail.text = inputData.aDetail
            binding.tvPrice.text = inputData.aPrice


        }






    }

}