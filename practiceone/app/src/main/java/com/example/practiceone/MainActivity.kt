package com.example.practiceone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1.화면이 클릭되었다는것을 알아야 합니다(프로그램이)
        val image1 =findViewById<ImageView>(R.id.btsImage1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면 화면이 다음화면으로 넘어가서 사진을 크게 보여줌.

            val intent = Intent(this, bts1Activity::class.java)
            startActivity(intent)
        }
        val image2 =findViewById<ImageView>(R.id.btsImage2)
        image2.setOnClickListener {
            Toast.makeText(this," 2번클릭완료",Toast.LENGTH_LONG).show()

            val intent =Intent(this,bts2Activity::class.java)
            startActivity(intent)
        }
        val image3=findViewById<ImageView>(R.id.btsImage3)
        image3.setOnClickListener {
        Toast.makeText(this,"3번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent =Intent(this,bts3Activity::class.java)
            startActivity(intent)
        }

    }
}