package com.example.spartaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val idEditText = findViewById<EditText>(R.id.et_id)
        val passwordEditText = findViewById<EditText>(R.id.et_passWord)

        val btnLogIn = findViewById<Button>(R.id.btn_logIn)
        btnLogIn.setOnClickListener {

            if (idEditText.text.isEmpty() || passwordEditText.text.isEmpty()){
                Toast.makeText(this, "아이디 / 비밀번호를 확인해 주세요" ,Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this , "로그인 되었습니다",Toast.LENGTH_SHORT).show()

            val userId : String = idEditText.text.toString()

            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("userId",userId)
            startActivity(intent)
        }
12

        val btnSignUp = findViewById<Button>(R.id.btn_signUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this , SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}