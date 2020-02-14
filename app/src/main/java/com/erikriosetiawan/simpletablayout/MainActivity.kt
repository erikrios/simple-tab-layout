package com.erikriosetiawan.simpletablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.erikriosetiawan.simpletablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val fragments =
            mutableListOf(OrderFragment(), PendingFragment(), DeliveredFragment())
        binding.viewPager2.adapter = MainPagerAdapter(this, fragments)
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            val title = listOf("Order", "Pending", "Delivered")
            tab.text = title[position]
        }.attach()
    }
}
