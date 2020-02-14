package com.erikriosetiawan.simpletablayout

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.erikriosetiawan.simpletablayout.databinding.FragmentPendingBinding

class PendingFragment : Fragment(R.layout.fragment_pending) {

    private var binding: FragmentPendingBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view)
    }
}