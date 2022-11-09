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
            intent.putExtra("DataList", dataList)
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

    var dataList: ArrayList<TestData> = arrayListOf(
        TestData("첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"),
        TestData("첫 번째 데이터2", "두 번째 데이터2", "세 번째 데이터2"),
        TestData("첫 번째 데이터3", "두 번째 데이터3", "세 번째 데이터3"),
        TestData("첫 번째 데이터4", "두 번째 데이터4", "세 번째 데이터4"),
        TestData("첫 번째 데이터5", "두 번째 데이터5", "세 번째 데이터5"),
        TestData("첫 번째 데이터6", "두 번째 데이터6", "세 번째 데이터6"),
        TestData("첫 번째 데이터7", "두 번째 데이터7", "세 번째 데이터7"),
        TestData("첫 번째 데이터8", "두 번째 데이터8", "세 번째 데이터8"),
        TestData("첫 번째 데이터9", "두 번째 데이터9", "세 번째 데이터9"),
        TestData("첫 번째 데이터10", "두 번째 데이터10", "세 번째 데이터10"),
        TestData("첫 번째 데이터11", "두 번째 데이터11", "세 번째 데이터11"),
        TestData("첫 번째 데이터12", "두 번째 데이터12", "세 번째 데이터12"),
        TestData("첫 번째 데이터13", "두 번째 데이터13", "세 번째 데이터13"),
        TestData("첫 번째 데이터14", "두 번째 데이터14", "세 번째 데이터14"),
        TestData("첫 번째 데이터15", "두 번째 데이터15", "세 번째 데이터15")
    )

    class TestData(
        private var data1: String? = null,
        private var data2: String? = null,
        private var data3: String? = null
    ){
        fun getData1(): String? {
            return data1
        }
        fun setData1(name: String) {
            this.data1 = data1
        }
        fun getData2(): String? {
            return data2
        }
        fun setData2(address: String) {
            this.data2 = data2
        }
        fun getData3(): String? {
            return data3
        }
        fun setData3(type: String) {
            this.data3 = data3
        }
    }










}