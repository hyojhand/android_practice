package com.example.practice2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    var fragmentList = listOf<Fragment>()

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        //TODO("Not yet implemented")
        return fragmentList.get(position)
    }

}