package com.example.todayquenstion

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.todayquenstion.Item.Quenstion
import com.example.todayquenstion.databinding.ActivityMainhomeBinding
import java.sql.Types.NULL


class MainhomeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainhomeBinding;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainhomeBinding.inflate(layoutInflater);
        setContentView(binding.root)

        //데이터 받기
        val loging_id = intent.getStringExtra("loging_id")
        val loging_pw = intent.getStringExtra("loging_pw")
        val loging_nickname = intent.getStringExtra("loging_nickname")
        val loging_point = intent.getStringExtra("loging_point")
        val loging_rating = intent.getStringExtra("loging_rating")
        val loging_mainfv = intent.getStringExtra("loging_mainfv")
        val loging_subfv = intent.getStringExtra("loging_subfv")
        System.out.println("여기는 아아받은것은 "+loging_id+loging_pw+loging_nickname+loging_point+loging_rating+loging_mainfv+loging_subfv)

        //기본적으로 메인홈 프래그먼트 보여주기
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainhome_fragment, MainhomeFragment())
            .addToBackStack(null)
            .commit()

        //////


        // 나의메뉴 클릭시 프래그먼트 이동
        binding.mymenubtn.setOnClickListener(){
            // 프래그먼트에 유저정보 보내주기
            Log.d("나의메뉴클릭","작동")
            var bundle:Bundle = Bundle()
            bundle.putString("loging_id",loging_id)
            bundle.putString("loging_pw",loging_pw)
            bundle.putString("loging_nickname",loging_nickname)
            bundle.putString("loging_point",loging_point)
            bundle.putString("loging_rating",loging_rating)
            bundle.putString("loging_mainfv",loging_mainfv)
            bundle.putString("loging_subfv",loging_subfv)

            var myhomeFragment: MyhomeFragment = MyhomeFragment()
            myhomeFragment.arguments=bundle

            var manager : FragmentManager = supportFragmentManager


            var transaction:FragmentTransaction=manager.beginTransaction()
            transaction.replace(R.id.mainhome_fragment, myhomeFragment)
                .addToBackStack(null)
                .commit()


//            supportFragmentManager.beginTransaction()
//                .replace(R.id.mainhome_fragment, MyhomeFragment())
//                .addToBackStack(null)
//                .commit()
        }

        //유저커뮤 클릭시 프래그먼트 이동
        binding.quenstionbtn.setOnClickListener(){
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainhome_fragment, UserCommuFragment())
                .addToBackStack(null)
                .commit()

        }
        //

        //메인홈 클릭시 프래그먼트 이동
        binding.mainhomebtn.setOnClickListener(){
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainhome_fragment, MainhomeFragment())
                .addToBackStack(null)
                .commit()
        }
        //





    }


    // 프래그먼트에서 프래그먼트로 화면전환할때 필요한거 이렇게하는게 맞는지 의문입니다 너무 귀찮은데
    fun changeFragment(index: Int){
        when(index){
            // 1: 나의 기프티콘
            1 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, MyGifticonFragment())
                    .addToBackStack(null)
                    .commit()

            }
            // 2: 유저의 질문글화면
            2 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, ViewQuenstionFragment())
                    .addToBackStack(null)
                    .commit()

            }

            // 3: 내 질문및 답변들
            3 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, MyQAlistFragment())
                    .addToBackStack(null)
                    .commit()

            }

//            // 4: 관심분야 재설정
//            4 -> {
//                supportFragmentManager
//                    .beginTransaction()
//                    .replace(R.id.mainhome_fragment, ViewQuenstionFragment())
//                    .addToBackStack(null)
//                    .commit()
//
//            }

            // 5: 포인트전환
            5 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, MytopointFragment())
                    .addToBackStack(null)
                    .commit()

            }

            // 6: 오늘의질문 답변하기
            6 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, TqAnswerFragment())
                    .addToBackStack(null)
                    .commit()

            }

            // 7: 오늘의질문 정답보기
            7 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, TqAiAnswerFragment())
                    .addToBackStack(null)
                    .commit()

            }

            // 8: 오늘의질문 다른유저 정답보기
            8 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, TquseranswerFragment())
                    .addToBackStack(null)
                    .commit()

            }






        }


    }














}