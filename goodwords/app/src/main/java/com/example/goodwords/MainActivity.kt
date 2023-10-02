package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다")
        sentenceList.add("왜 초록색 밑줄이 쳐져있을까 에러일까")
        sentenceList.add("명언며여언 명언 명언 명언")
        sentenceList.add("피곤하다")
        sentenceList.add("졸리다")
        sentenceList.add("가나다라마바사")
        sentenceList.add("명언같아 보이죠")
        sentenceList.random()

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this,SentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}