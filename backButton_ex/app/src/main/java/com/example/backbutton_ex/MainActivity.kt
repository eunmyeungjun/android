package com.example.backbutton_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d("MainActivity","backButton")
        if(isDouble==true){
            finish()
        }

        isDouble=true
        Toast.makeText(this,"종료하실려면 더블클릭 해",Toast.LENGTH_LONG).show()

        Handler().postDelayed( {
            isDouble=false
        },2000)
    }
}