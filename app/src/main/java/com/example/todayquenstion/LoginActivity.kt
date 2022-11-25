package com.example.todayquenstion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.ResponseDelivery
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.todayquenstion.databinding.ActivityLoginBinding
import org.json.JSONException
import org.json.JSONObject


class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding;
    var queue: RequestQueue? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater);
        setContentView(binding.root)

        // 초기화
        if(queue== null){
            queue = Volley.newRequestQueue(this)
        }




        binding.loginbutton.setOnClickListener() {
            var id:String =binding.editID.getText().toString()
            var pw:String =binding.editpw.getText().toString()
            CheckUsers(id,pw)
        }
        binding.signupbtn.setOnClickListener() {
            val nextIntent = Intent(this, SignupActivity::class.java)
            startActivity(nextIntent)
        }




    }//


    fun CheckUsers(id:String,pw:String) { // 로그인시 서버내 데이터와 일치하는지 비교합니다.
        var url: String? = "http://192.168.75.106:9090/tq_load_user.php"
        val stringRequest = object : StringRequest(
            Request.Method.POST,
            url,
            Response.Listener<String> {
                Log.d("작동하냐이거","작동하냐이거")
                try{
                    Log.d("응답","\n응답->${it}")
                    var jsonObject = JSONObject(it)
                    var success:Boolean = jsonObject.optBoolean("success")

                    if(success){
                        var user_id:String = jsonObject.optString("user_id")
                        var user_pw:String = jsonObject.optString("user_pw")
                        var user_nickname:String = jsonObject.optString("user_nickname")
                        var user_point:String = jsonObject.optString("user_point")
                        var user_rating:String = jsonObject.optString("user_rating")
                        var user_mainfv:String = jsonObject.optString("user_mainfv")
                        var user_subfv:String = jsonObject.optString("user_subfv")
                        Toast.makeText(getApplicationContext(),"유저 로그인에 성공하였습니다.", Toast.LENGTH_SHORT).show();
                        val intent = Intent(this, MainhomeActivity::class.java)
                        // 다음액티비티에 ID,PW,닉네임을 전달
                        // 다음액티비티에 ID,PW,닉네임을 전달

                        intent.putExtra("loging_id",user_id)
                        intent.putExtra("loging_nickname",user_nickname)
                        intent.putExtra("loging_pw",user_pw)
                        intent.putExtra("loging_point",user_point)
                        intent.putExtra("loging_rating",user_rating)
                        intent.putExtra("loging_mainfv",user_mainfv)
                        intent.putExtra("loging_subfv",user_subfv)
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"유저 로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show();


                    }
                }
                catch(e:JSONException){
                    e.printStackTrace()
                }


            },
            Response.ErrorListener {
                    error ->
                Log.d("ERROR", "서버 Response 가져오기 실패: $error")

            }) {
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["user_id"]=id
                params["user_pw"]=pw
                Log.d("작동하냐이거2","작동하냐이거2")


                return params
                // MutableMap 객체에 전달할 데이터 담아서 반환하면 서버에 요청할 때 알아서 함께 전송해 줌
            }

        }
        queue?.add(stringRequest)
    }










}