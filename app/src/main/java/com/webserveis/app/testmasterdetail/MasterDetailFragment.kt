package com.webserveis.app.testmasterdetail

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MasterDetailFragment : Fragment(R.layout.fragment_master_detail) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        /*val navHostFragment2 = childFragmentManager.findFragmentById(R.id.nav_second_host_fragment)
        val navController2 = navHostFragment2?.findNavController()
        navController2?.setGraph(R.navigation.nav_graph2)
        navController2?.navigate(R.id.detailFragment)
*/


    }

    companion object {
        private val TAG = MasterDetailFragment::class.java.simpleName
    }
}