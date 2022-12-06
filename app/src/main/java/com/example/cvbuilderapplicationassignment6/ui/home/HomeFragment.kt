package com.example.cvbuilderapplicationassignment6.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.cvbuilderapplicationassignment6.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews(view)
    }

    private fun initViews(view: View) {
        val floatingAddButton = view.findViewById<FloatingActionButton>(R.id.floating_add_button)

        floatingAddButton.setOnClickListener {
            Snackbar.make(view, "Add Additional fields on home page", Snackbar.LENGTH_LONG).show()
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}