package com.example.todayquenstion

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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivitySignupBinding.inflate(layoutInflater);
        setContentView(binding.root)

        var user_id: String?
        var user_nickname: String?
        var user_pw: String?
        var user_point: String?

        user_id = "test"
        user_nickname = "testNickname"
        user_pw = "testPw"
        user_point = "0"

        // 초기화
        if(queue== null){
            queue = Volley.newRequestQueue(this)
        }


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
                params["user_id"]=user_id
                params["user_nickname"]=user_nickname
                params["user_pw"]=user_pw
                params["user_point"]=user_point

                Log.d("getParams 작동","작동했습니다.")
                Log.d("겟파람스 작동예시",user_id)


                return params
                // MutableMap 객체에 전달할 데이터 담아서 반환하면 서버에 요청할 때 알아서 함께 전송해 줌
            }


        }



        queue?.add(stringRequest)













    }

    fun onErrorResponse(error: VolleyError) {
        Log.d( "asd", error.toString())
    }


}