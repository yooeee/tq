package com.example.todayquenstion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.Response.success
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.todayquenstion.databinding.AcitivitySignupBinding
import com.example.todayquenstion.databinding.ActivityPickfavoriteBinding


class PickfavoriteActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPickfavoriteBinding;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickfavoriteBinding.inflate(layoutInflater);
        setContentView(binding.root)

        //데이터 받기
        val loging_id = intent.getStringExtra("loging_id")
        val loging_pw = intent.getStringExtra("loging_pw")
        val loging_nickname = intent.getStringExtra("loging_nickname")
        val loging_point = intent.getStringExtra("loging_point")
        val loging_rating = intent.getStringExtra("loging_rating")



        binding.itbtn.setOnClickListener(){

            val nextIntent = Intent(this, Pickfavorite2Activity::class.java)
            nextIntent.putExtra("loging_id",loging_id)
            nextIntent.putExtra("loging_nickname",loging_pw)
            nextIntent.putExtra("loging_pw",loging_nickname)
            nextIntent.putExtra("loging_point",loging_point)
            nextIntent.putExtra("loging_rating",loging_rating)
            startActivity(nextIntent)

        }




    }



}