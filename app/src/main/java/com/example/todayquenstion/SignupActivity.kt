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


class SignupActivity : AppCompatActivity() {

    private lateinit var binding : AcitivitySignupBinding;
    var queue: RequestQueue? = null
    var user_id: String = ""
    var user_nickname: String =""
    var user_pw: String = ""
    var user_point: String = "0"
    var user_rating: String ="새싹"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivitySignupBinding.inflate(layoutInflater);
        setContentView(binding.root)

        // 초기화
        if(queue== null){
            queue = Volley.newRequestQueue(this)
        }




        binding.signupbutton.setOnClickListener(){

            user_id = binding.signID.getText().toString()
            user_nickname = binding.signName.getText().toString()
            user_pw = binding.signPW.getText().toString()
            user_point = binding.signpw2.getText().toString()

            val nextIntent = Intent(this, PickfavoriteActivity::class.java)
            nextIntent.putExtra("loging_id",user_id)
            nextIntent.putExtra("loging_nickname",user_nickname)
            nextIntent.putExtra("loging_pw",user_pw)
            nextIntent.putExtra("loging_point",user_point)
            nextIntent.putExtra("loging_rating",user_rating)
            startActivity(nextIntent)

        }








    }



}