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
        ////




        binding.loginbutton.setOnClickListener() {
            val nextIntent = Intent(this, MainhomeActivity::class.java)
            startActivity(nextIntent)
        }




    }
}