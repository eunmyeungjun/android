package com.example.spartafirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (index in 1..10){
            Log.d("break", "현재 index는 $index 입니다.")
            if (index > 5){
                break
            }
        }
        class eun{

        }

    }
}