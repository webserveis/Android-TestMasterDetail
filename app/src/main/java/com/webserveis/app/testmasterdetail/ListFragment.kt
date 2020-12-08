package com.webserveis.app.testmasterdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController


class ListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnDetailItem = view.findViewById<Button>(R.id.btn_detail_item)


        btnDetailItem.setOnClickListener {

            if (requireContext().hasTwoPanels()) {
                //Tablet mode

                val navController2 = getChildNavController()
                navController2?.navigate(R.id.detailFragment)

            } else {
                //Smartphone
                findNavController().navigate(R.id.action_masterDetailFragment_to_detailFragment)
            }


        }


    }

    private fun getChildNavController(): NavController? {
        val navHostFragment2 = parentFragment?.childFragmentManager?.findFragmentById(R.id.nav_second_host_fragment)
        val navController = navHostFragment2?.findNavController()
        navController?.setGraph(R.navigation.nav_graph2)
        return navController
    }
}