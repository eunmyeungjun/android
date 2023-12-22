package com.example.mywebtoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ibtnOne = findViewById<ImageButton>(R.id.ib_one)
        ibtnOne.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","1")
            startActivity(intent)
        }
        val ibtnTwo = findViewById<ImageButton>(R.id.ib_two)
        ibtnTwo.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }
        val ibtnThree = findViewById<ImageButton>(R.id.ib_three)
        ibtnThree.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }
        val ibtnFour = findViewById<ImageButton>(R.id.ib_four)
        ibtnFour.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }
        val ibtnFive = findViewById<ImageButton>(R.id.ib_five)
        ibtnFive.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }
        val ibtnSix = findViewById<ImageButton>(R.id.ib_six)
        ibtnSix.setOnClickListener {
            val intent = Intent(this , Webtoon::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }

        val btnMAin = findViewById<ImageButton>(R.id.imageView)
        btnMAin.setOnClickListener{
            val intent = Intent(this,Webtoon::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }




    }



}