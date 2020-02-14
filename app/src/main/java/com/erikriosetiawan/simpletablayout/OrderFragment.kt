package com.erikriosetiawan.simpletablayout

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.simpletablayout.databinding.FragmentOrderBinding

class OrderFragment : Fragment(R.layout.fragment_order) {

    private var binding: FragmentOrderBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)
    }
}