package com.example.todayquenstion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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





        //기본적으로 메인홈 프래그먼트 보여주기
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainhome_fragment, MainhomeFragment())
            .addToBackStack(null)
            .commit()

        //////


        // 나의메뉴 클릭시 프래그먼트 이동
        binding.mymenubtn.setOnClickListener(){
            supportFragmentManager.beginTransaction()
                .replace(R.id.mainhome_fragment, MyhomeFragment())
                .addToBackStack(null)
                .commit()
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


        }


    }














}