package com.dungtran.plantcare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dungtran.plantcare.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    lateinit var binding: FragmentSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.settingsToolbar.setNavigationIcon(R.drawable.ic_arrow_back_24)

        binding.settingsToolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_settingsFragment_to_homeFragment)
        }
    }
}