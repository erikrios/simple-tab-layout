package com.erikriosetiawan.simpletablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPagerAdapter(
    fragmentActivity: FragmentActivity,
    val fragments: MutableList<Fragment>
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment = fragments[position]


    override fun getItemCount(): Int = fragments.size
}