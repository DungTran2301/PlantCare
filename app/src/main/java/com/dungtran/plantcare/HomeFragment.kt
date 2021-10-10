package com.dungtran.plantcare

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dungtran.plantcare.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        binding.homeToolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.newPlantFragment -> {
                    findNavController().navigate(R.id.action_homeFragment_to_newPlantFragment)
                    true
                }
                R.id.settingsFragment -> {
                    findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
                    true
                }
                else -> {
                    super.onOptionsItemSelected(it)
                }
            }
        }
    }

}