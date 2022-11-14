//package com.example.foodchat
//
//import com.android.volley.AuthFailureError
//import com.android.volley.Response
//import com.android.volley.toolbox.StringRequest
//import java.lang.reflect.Method
//
//class Request_Register(
//    userID: String,
//    userPassword: String,
//    userName: String,
//    listener: Response.Listener<String?>?
//) :
//    StringRequest(Method.POST, URL, listener, null) {
//    private val map: MutableMap<String, String>
//
//    @get:Throws(AuthFailureError::class)
//    protected val params: Map<String, String>
//        protected get() = map
//
//    companion object {
//        // 서버 URL 설정 ( PHP 파일 연동 )
//        //final static private String URL = "http://192.168.75.151:9090/Register.php";
//        private const val URL = "http://218.236.123.14:9090/Register.php"
//    }
//
//    init {
//        map = HashMap()
//        map["user_id"] = userID
//        map["user_pw"] = userPassword
//        map["user_nickname"] = userName
//    }
//}