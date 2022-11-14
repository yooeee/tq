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
        // 나의메뉴 클릭시 프래그먼트 이동
        val mActivity = activity as MainhomeActivity
        binding.mygiftbtn.setOnClickListener(){
            mActivity.changeFragment(1)
        }









        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    } //oncreateview




}
