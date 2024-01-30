package com.example.multiplefragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.multiplefragments.R
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {


    private lateinit var btnNavigateToFirstFragment: Button
    private lateinit var btnNavigateToSecondFragment: Button
    private lateinit var btnNavigateToThirdFragment: Button
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


        btnNavigateToFirstFragment = view.findViewById(R.id.btn_home_go_frgment1)
        btnNavigateToSecondFragment = view.findViewById(R.id.btn_home_go_frgment2)
        btnNavigateToThirdFragment = view.findViewById(R.id.btn_home_go_frgment3)
        navController = requireActivity().findNavController(R.id.fragmentContainerView)

        btnNavigateToFirstFragment.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_fragment1)
        }
        btnNavigateToSecondFragment.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_fragment2)
        }
        btnNavigateToThirdFragment.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_fragment3)
        }




        return view
    }


}