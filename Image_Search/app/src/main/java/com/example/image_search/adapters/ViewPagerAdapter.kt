package com.example.image_search.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.image_search.ImageSearch
import com.example.image_search.MyBox

class ViewPagerAdapter(fragmentActivity : FragmentActivity) :FragmentStateAdapter(fragmentActivity){
    private val fragmentList = listOf(
        ImageSearch(),
        MyBox()

    )

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(positon: Int): Fragment {
        return fragmentList[positon]
    }
}