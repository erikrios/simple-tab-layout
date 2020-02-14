package com.erikriosetiawan.simpletablayout

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
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
            tab.apply {
                when (position) {
                    0 -> {
                        text = "Order"
                        icon =
                            resources.getDrawable(R.drawable.ic_add_shopping_cart_black_24dp, null)
                        val badgeDrawable = orCreateBadge
                        badgeDrawable.backgroundColor =
                            ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badgeDrawable.isVisible = true
                        badgeDrawable.number = 8

                    }
                    1 -> {
                        text = "Pending"
                        icon = resources.getDrawable(R.drawable.ic_access_time_black_24dp, null)
                        val badgeDrawable = orCreateBadge
                        badgeDrawable.backgroundColor =
                            ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badgeDrawable.isVisible = true
                    }
                    2 -> {
                        text = "Delivered"
                        icon = resources.getDrawable(R.drawable.ic_check_circle_black_24dp, null)
                        val badgeDrawable = orCreateBadge
                        badgeDrawable.backgroundColor =
                            ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badgeDrawable.isVisible = true
                        badgeDrawable.number = 100
                        badgeDrawable.maxCharacterCount = 3
                    }
                }
            }
        }.attach()

        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                val badgeDrawable = binding.tabLayout.getTabAt(position)?.orCreateBadge
                badgeDrawable?.isVisible = false
            }
        })
    }
}
