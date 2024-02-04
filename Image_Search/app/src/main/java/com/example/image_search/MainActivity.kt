package com.example.image_search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.image_search.adapters.ViewPagerAdapter
import com.example.image_search.data.Const
import com.example.image_search.data.Document
import com.example.image_search.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity(){

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val ViewPageradapter by lazy { ViewPagerAdapter(this) }
    var likeList = mutableListOf<Document>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.setFragmentResultListener(Const.REQUEST_KEY, this@MainActivity) {
            requestkey , bundle ->
            val result = bundle.getParcelable<Document> (Const.FAVORITE_DATA)
            result?.let {likeList.add(it)  }
            Log.d("로그디","좋아요 확인해봄,${likeList.size} ${likeList}")
        }


        swiper()
//초기 Fragment 세팅
//        setFragment(ImageSearch())
//
//        //Fragment전환
//        binding.btnToMyBoxFrame.setOnClickListener {
//            setFragment(MyBox())
//        }
//        binding.btnToImageSearchFrame.setOnClickListener {
//            setFragment(ImageSearch())
//        }




    }
    //탭 레이아웃과 뷰페이저 세팅
    private fun swiper() {
        val viewPager = binding.frameLayout
        val tabLayout = binding.tabLayOut

        viewPager.adapter = ViewPageradapter

        TabLayoutMediator(tabLayout,viewPager) {tab, position ->
            tab.text = when(position) {
                0 -> "검색"
                1 -> "보관함"
                else -> ""
            }
        }.attach()
    }
    //Fragment전환 함수
//    private fun setFragment (frag : Fragment) {
//        supportFragmentManager.commit {
//            replace(R.id.frame_layout,frag)
//            setReorderingAllowed(true)
//            addToBackStack("")
//        }
//
//    }

//    override fun dataPass(dataList: List<Document>) {
//       likeList.addAll(dataList)
//        Log.d("로그디","${dataList.size} 위치는 MainActivity ${dataList}  ")
//    }

    fun addToList(data:Document) {
        likeList.add(data)
        Log.d("로그디","data확인ImageSearch")

    }



}