package com.dungtran.plantcare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import com.dungtran.plantcare.databinding.FragmentNewPlantBinding

class NewPlantFragment : Fragment() {
    lateinit var binding: FragmentNewPlantBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewPlantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.newPlantToolbar.setNavigationIcon(R.drawable.ic_arrow_back_24)

        binding.newPlantToolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_newPlantFragment_to_homeFragment)
        }

        binding.btnCreatePlant.setOnClickListener {

        }
        binding.btnChooseFlower.setOnClickListener {
            confirmFireMissiles()
        }
    }

    fun confirmFireMissiles() {
        val fragmentManager: FragmentManager = childFragmentManager
        val newFragment = ChooseFlowerFragment()
        newFragment.show(fragmentManager, "missiles")
    }


}