package com.erikriosetiawan.simpletablayout

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.erikriosetiawan.simpletablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val fragments =
            mutableListOf(OrderFragment(), PendingFragment(), DeliveredFragment())
        binding.tabLayout.apply {
            setTabRippleColorResource(android.R.color.white)
            setBackgroundColor(Color.TRANSPARENT)
            setSelectedTabIndicatorColor(Color.WHITE)
        }

        binding.viewPager2.adapter = MainPagerAdapter(this, fragments)
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = listOf("Order", "Pending", "Delivered")[position]
        }.attach()
    }
}
