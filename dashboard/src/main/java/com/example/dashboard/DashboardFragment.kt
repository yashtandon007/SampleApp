package com.example.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class DashboardFragment : Fragment() {

    private var bnav: BottomNavigationView? = null
    var vi : View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        vi = inflater.inflate(R.layout.fragment_dashboard, container, false)
        bnav  = vi?.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        return vi
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bnav?.setItemIconTintList(null);
        bnav?.setupWithNavController(activity?.findNavController(R.id.nav_host_fragment)!!)

    }

}