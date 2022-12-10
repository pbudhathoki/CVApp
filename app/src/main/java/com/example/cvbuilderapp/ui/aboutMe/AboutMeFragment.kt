package com.example.cvbuilderapp.ui.aboutMe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Achievement
import com.example.cvbuilderapp.data.Study

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initStudy(view)
        initAchievement(view)
    }

    private fun initStudy(view: View) {
        val StudyRecyclerView = view.findViewById<RecyclerView>(R.id.Study_recycler_view)
        val adapter = StudyAdapter(Study.getStudyList())
        StudyRecyclerView.adapter = adapter
    }

    private fun initAchievement(view: View) {
        val achievementRecycler = view.findViewById<RecyclerView>(R.id.Achievement_recycler_view)
        val adapter = AchievementAdapter(Achievement.getAchievementList())
        achievementRecycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutMeFragment()
    }
}