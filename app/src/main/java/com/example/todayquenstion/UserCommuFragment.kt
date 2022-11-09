package com.example.todayquenstion

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todayquenstion.databinding.FragmentCommunityBinding

class UserCommuFragment : Fragment() {


    var list = arrayListOf<Quenstion>()
    private lateinit var listAdapter: ListAdapter
//






    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
////
        // 1. 뷰 바인딩 설정
        val binding = FragmentCommunityBinding.inflate(inflater, container, false)
        // 나의메뉴 클릭시 프래그먼트 이동

        var list: ArrayList<MainhomeActivity.TestData> = requireActivity().intent!!.extras!!.get("DataList")
                as ArrayList<MainhomeActivity.TestData>
        Log.e("FirstFragment", "Data List: ${list}")

        listAdapter = ListAdapter(list)
        binding.listtest.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        // RecyclerView.adapter에 지정
        binding.listtest.adapter = listAdapter















        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    }








}
