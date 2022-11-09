package com.example.todayquenstion

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todayquenstion.Adapter.uqAdapter
import com.example.todayquenstion.Item.Quenstion
import com.example.todayquenstion.databinding.FragmentCommunityBinding

class UserCommuFragment : Fragment() {


    var list = arrayListOf<Quenstion>()
    private lateinit var uqAdapter: uqAdapter
//






    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
////
        // 1. 뷰 바인딩 설정
        val binding = FragmentCommunityBinding.inflate(inflater, container, false)
        // 나의메뉴 클릭시 프래그먼트 이동

        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))

        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))
        list.add(Quenstion("Q.첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"))

        //리사이클뷰


        uqAdapter = uqAdapter(list)
        binding.listtest.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        // RecyclerView.adapter에 지정
        binding.listtest.adapter = uqAdapter
        //리사이클뷰

        //게시글 누를시
        val mActivity = activity as MainhomeActivity
        binding.quenstionTitletest.setOnClickListener(){
            mActivity.changeFragment(2)
        }

        // 3. 프래그먼트 레이아웃 뷰 반환
        return binding.root







    }

    var dataList: ArrayList<Quenstion> = arrayListOf(
        Quenstion("첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"),
        Quenstion("첫 번째 데이터2", "두 번째 데이터2", "세 번째 데이터2"),
        Quenstion("첫 번째 데이터3", "두 번째 데이터3", "세 번째 데이터3"),
        Quenstion("첫 번째 데이터4", "두 번째 데이터4", "세 번째 데이터4"),
        Quenstion("첫 번째 데이터5", "두 번째 데이터5", "세 번째 데이터5"),
        Quenstion("첫 번째 데이터6", "두 번째 데이터6", "세 번째 데이터6"),
        Quenstion("첫 번째 데이터7", "두 번째 데이터7", "세 번째 데이터7"),
        Quenstion("첫 번째 데이터8", "두 번째 데이터8", "세 번째 데이터8"),
        Quenstion("첫 번째 데이터9", "두 번째 데이터9", "세 번째 데이터9"),
        Quenstion("첫 번째 데이터10", "두 번째 데이터10", "세 번째 데이터10"),
        Quenstion("첫 번째 데이터11", "두 번째 데이터11", "세 번째 데이터11"),

        )










}
