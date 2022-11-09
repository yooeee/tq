package com.example.todayquenstion

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todayquenstion.databinding.FragmentMygiftBinding
import com.example.todayquenstion.databinding.FragmentViewquenstionBinding

class ViewQuenstionFragment : Fragment() {




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
////
        // 1. 뷰 바인딩 설정
        val binding = FragmentViewquenstionBinding.inflate(inflater, container, false)
        // 나의메뉴 클릭시 프래그먼트 이동






        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    }
}
