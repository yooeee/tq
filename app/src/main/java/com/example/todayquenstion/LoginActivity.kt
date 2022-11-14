package com.example.todayquenstion

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.todayquenstion.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater);
        setContentView(binding.root)

        Log.d("asd","asd")
        //// 노트북에서 작성했습니다 이주석은
        //// 이건 커뮾터에서 작성햇습니다
        //// 다시 노트북
        //// 라스트 컴퓨터
        /// 라스트 노트북
        /// 라스트 컴퓨터2
        /// 라스트 노트북2




        binding.loginbutton.setOnClickListener() {
            val nextIntent = Intent(this, MainhomeActivity::class.java)
            startActivity(nextIntent)
        }
        binding.signupbtn.setOnClickListener() {
            val nextIntent = Intent(this, SignupActivity::class.java)
            startActivity(nextIntent)
        }




    }
}