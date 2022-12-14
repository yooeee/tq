package com.example.todayquenstion

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todayquenstion.databinding.FragmentMainhomeBinding
import com.example.todayquenstion.databinding.FragmentMyhomeBinding

class MainhomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // 1. 뷰 바인딩 설정
        val binding = FragmentMainhomeBinding.inflate(inflater, container, false)

        val mActivity = activity as MainhomeActivity
        binding.gototqanswerbtn.setOnClickListener(){
            mActivity.changeFragment(6)
        }
        binding.gototqaianswerbtn.setOnClickListener(){
            mActivity.changeFragment(7)
        }


        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root

//        return inflater.inflate(R.layout.fragment_mainhome, container, false)
////



    }
}
