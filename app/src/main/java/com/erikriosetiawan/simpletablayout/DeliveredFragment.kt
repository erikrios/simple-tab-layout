package com.erikriosetiawan.simpletablayout

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.simpletablayout.databinding.FragmentDeliveredBinding

class DeliveredFragment : Fragment(R.layout.fragment_delivered) {

    private var binding: FragmentDeliveredBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)
    }
}