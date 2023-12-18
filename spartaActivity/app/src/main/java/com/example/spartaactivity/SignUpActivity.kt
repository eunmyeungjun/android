package com.example.spartaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpId = findViewById<EditText>(R.id.et_signUp_id)
        val signUpName = findViewById<EditText>(R.id.et_signUp_name)
        val signUpPassWord = findViewById<EditText>(R.id.et_signUp_password)

        val btnSignIn = findViewById<Button>(R.id.btn_signUp_signUp)
        btnSignIn.setOnClickListener {
            if (signUpId.text.isEmpty() || signUpName.text.isEmpty()
                || signUpPassWord.text.isEmpty()) {
                Toast.makeText(this,"입력되지 않은 정보가 있습니다",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this , "회원가입이 완료되었습니다" ,Toast.LENGTH_SHORT).show()
            finish()

        }

    }



}