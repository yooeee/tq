package com.example.todayquenstion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
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

    fun changeFragment(index: Int){
        when(index){
            1 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainhome_fragment, MyGifticonFragment())
                    .addToBackStack(null)
                    .commit()

            }


        }


    }










}