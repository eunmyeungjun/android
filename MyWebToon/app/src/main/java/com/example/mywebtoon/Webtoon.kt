package com.example.mywebtoon

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Webtoon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_web_toon)

        val getData = intent.getStringExtra("data")

        val mainImage = findViewById<ImageView>(R.id.iv_toonMainImage)

        val mainText = findViewById<TextView>(R.id.tv_webToonName)

        var items = mutableListOf<Model>()

        val random = (9..20).random()


        when (getData){
            "1" -> {
                mainImage.setImageResource(R.drawable.sun)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "태양${random -i} 화",
                            R.drawable.sun
                        )
                    )
                }
                mainText.setText("태양 : 00작가")
            }
            "2" -> {mainImage.setImageResource(R.drawable.img5)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "eleceed${random -i} 화",
                            R.drawable.img5
                        )
                    )
                }
                mainText.setText("eleceed : 00작가")
            }
            "3" -> {
                mainImage.setImageResource(R.drawable.img6)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "초인의 게임${random -i} 화",
                            R.drawable.img6
                        )
                    )
                }
                mainText.setText("겨울 : 00작가")
            }
            "4" -> {
                mainImage.setImageResource(R.drawable.smile)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "웃음${random -i} 화",
                            R.drawable.smile
                        )
                    )
                }
                mainText.setText("웃음 : 00작가")
            }
            "5" -> {
                mainImage.setImageResource(R.drawable.img7)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "김부장 ${random -i} 화",
                            R.drawable.img7
                        )
                    )
                }
                mainText.setText("김부장 : 00작가")
            }
            "6" -> {
                mainImage.setImageResource(R.drawable.sparta)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "sparta${random -i} 화",
                            R.drawable.sparta
                        )
                    )
                }
                mainText.setText("sparta : 00작가")
            }
            "7" ->{
                mainImage.setImageResource(R.drawable.imgmain)
                for (i in 1 until random){
                    items.add(
                        Model(
                            "연애혁명 ${random -i} 화",
                            R.drawable.imgmain
                        )
                    )
                }
                mainText.setText("연애혁명 : 00작가")
            }

        }

        val rv = findViewById<RecyclerView>(R.id.rv_List)

        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(this)


        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                Toast.makeText(baseContext,"유료 결제가 필요한 회차입니다." ,Toast.LENGTH_SHORT).show()
            }
        }

        val btnWrong = findViewById<Button>(R.id.btn_wrong)
        btnWrong.setOnClickListener {
            val myUri = Uri.parse("http://m.naver.com")
            val intent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(intent)
        }

        val btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {

            finish()
        }





    }

}