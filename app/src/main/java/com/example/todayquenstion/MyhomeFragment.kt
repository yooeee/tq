package com.example.todayquenstion

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.example.todayquenstion.databinding.ActivityMainhomeBinding
import com.example.todayquenstion.databinding.FragmentMyhomeBinding

class MyhomeFragment : Fragment() {




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
////
        // 1. 뷰 바인딩 설정
        val binding = FragmentMyhomeBinding.inflate(inflater, container, false)

        //유저데이터 메인홈액티비티에서 가져오기
        var loging_id: String? = this.arguments?.getString("loging_id")
        var loging_nickname: String? = this.arguments?.getString("loging_nickname")
        var loging_pw: String? = this.arguments?.getString("loging_pw")
        var loging_point: String? = this.arguments?.getString("loging_point")
        var loging_rating: String? = this.arguments?.getString("loging_rating")
        var loging_mainfv: String? = this.arguments?.getString("loging_mainfv")
        var loging_subfv: String? = this.arguments?.getString("loging_subfv")
        System.out.println("여기는 프래그먼트받은것은 "+loging_id+loging_pw+loging_nickname+loging_point+loging_rating+loging_mainfv+loging_subfv)


        //화면 설정
        binding.tvUsernickname.setText(loging_nickname)
        binding.tvUserfavorite.setText("관심분야 : ["+loging_mainfv+" - "+loging_subfv+"]")
        binding.tvUserrating.setText("등급 : ["+loging_rating+"]")







        // 나의메뉴 클릭시 프래그먼트 이동
        val mActivity = activity as MainhomeActivity
        binding.mygiftbtn.setOnClickListener(){
            mActivity.changeFragment(1)
        }

        binding.myqabtn.setOnClickListener(){
            mActivity.changeFragment(3)
        }

        binding.myfavorReBtn.setOnClickListener(){
            activity?.let{
                val intent = Intent(context, PickfavoriteActivity::class.java)
                startActivity(intent)
            }
        }

        binding.mytopointbtn.setOnClickListener(){
            mActivity.changeFragment(5)
        }









        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    } //oncreateview




}
