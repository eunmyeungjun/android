package com.example.bmi_calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.*
class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height=intent.getIntExtra("height",0)
        val weight=intent.getIntExtra("weight",0)

        //bmi 계산
        var value = weight/(height/100.0).pow(2.0)
        value=round(value*10)/10

        var resultText=""
        var resultImage=0
        var resultColor=0

        if(value<18.5){
            resultText="저체중"
            resultImage=R.drawable.lv1
            resultColor= Color.YELLOW
        }else if (value >=18.5 && value <= 23.0) {
            resultText = "정상체중"
            resultImage = R.drawable.lv2
            resultColor = Color.GREEN
        }else if (value >=23.0 && value <= 25.0) {
            resultText = "과체중"
            resultImage = R.drawable.lv3
            resultColor = Color.BLACK
        }else if (value >=25 && value <= 30) {
            resultText = "비만"
            resultImage = R.drawable.lv4
            resultColor = Color.CYAN
        }else {
            resultText = "고도비만"
            resultImage = R.drawable.lv5
            resultColor = Color.MAGENTA
        }
        val tv_resultValue =findViewById<TextView>(R.id.tv_ResValue)
        val tv_resultText =findViewById<TextView>(R.id.tv_ResText)
        val tv_resultImage =findViewById<ImageView>(R.id.tv_ResImage)
        val btn_back=findViewById<Button>(R.id.btn_back)

        tv_resultValue.text=value.toString()
        tv_resultText.text=resultText
        tv_resultImage.setImageResource(resultImage)
        tv_resultText.setTextColor(resultColor)

        btn_back.setOnClickListener {
            finish()
        }


    }

}