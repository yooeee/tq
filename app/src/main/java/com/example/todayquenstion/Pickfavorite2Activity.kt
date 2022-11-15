package com.example.todayquenstion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.Response.success
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.todayquenstion.databinding.AcitivitySignupBinding
import com.example.todayquenstion.databinding.ActivityPickfavorite2Binding
import com.example.todayquenstion.databinding.ActivityPickfavoriteBinding


class Pickfavorite2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPickfavorite2Binding;
    var queue: RequestQueue? = null
//    val loging_id :String = ""
//    val loging_pw :String = ""
//    val loging_nickname :String = ""
//    val loging_point :String = ""
//    val loging_rating :String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickfavorite2Binding.inflate(layoutInflater);
        setContentView(binding.root)

        //데이터 받기
        var loging_id = intent.getStringExtra("loging_id").toString()
        var loging_pw = intent.getStringExtra("loging_pw").toString()
        var loging_nickname = intent.getStringExtra("loging_nickname").toString()
        var loging_point = intent.getStringExtra("loging_point").toString()
        var loging_rating = intent.getStringExtra("loging_rating").toString()

        // 초기화
        if(queue== null){
            queue = Volley.newRequestQueue(this)
        }

        binding.check3.setOnClickListener(){

            InputUsers(loging_id,loging_pw,loging_nickname,loging_point,loging_rating)
            val nextIntent = Intent(this, MainhomeActivity::class.java)
            nextIntent.putExtra("loging_id",loging_id)
            nextIntent.putExtra("loging_nickname",loging_nickname)
            nextIntent.putExtra("loging_pw",loging_pw)
            nextIntent.putExtra("loging_point",loging_point)
            nextIntent.putExtra("loging_rating",loging_rating)
            Toast.makeText(this, "완료되었습니다!", Toast.LENGTH_SHORT).show()





            startActivity(nextIntent)

        }








    }

    fun InputUsers(id:String,name:String,pw:String,point:String,rating:String) {
        var url: String? = "http://192.168.75.106:9090/tq_input_users.php"
        val stringRequest = object : StringRequest(
            Request.Method.POST,
            url,
            Response.Listener<String> {
                Log.d("작동하냐이거","작동하냐이거")
                Log.d("응답","\n응답->${it}")
            },
            Response.ErrorListener {
                    error ->
                Log.d("ERROR", "서버 Response 가져오기 실패: $error")

            }) {
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["user_id"]=id
                params["user_nickname"]=name
                params["user_pw"]=pw
                params["user_point"]=point
                params["user_rating"]=rating


                return params
                // MutableMap 객체에 전달할 데이터 담아서 반환하면 서버에 요청할 때 알아서 함께 전송해 줌
            }

        }
        queue?.add(stringRequest)
    }



}