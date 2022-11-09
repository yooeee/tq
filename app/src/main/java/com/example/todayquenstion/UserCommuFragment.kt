package com.example.todayquenstion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todayquenstion.databinding.FragmentCommunityBinding

class UserCommuFragment : Fragment() {


    var list = arrayListOf<Quenstion>()
//






    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
////
        // 1. 뷰 바인딩 설정
        val binding = FragmentCommunityBinding.inflate(inflater, container, false)
        // 나의메뉴 클릭시 프래그먼트 이동



        list.add(Quenstion("Q. 프레임워크와 라이브러리 차이점이 무엇인가요?","나도 궁금해요"
        ,"3","2022-11-01","인하컴돌이"))












        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    }








}
