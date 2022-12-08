package com.example.cvbuilderapp.ui.aboutMe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Achievement
import com.example.cvbuilderapp.data.Education

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initEducation(view)
        initAchievement(view)
    }

    private fun initEducation(view: View) {
        val educationRecyclerView = view.findViewById<RecyclerView>(R.id.education_recycler_view)
        val adapter = EducationAdapter(Education.getEducationList())
        educationRecyclerView.adapter = adapter
    }

    private fun initAchievement(view: View) {
        val AchievementRecycler = view.findViewById<RecyclerView>(R.id.Achievement_recycler_view)
        val adapter = AchievementAdapter(Achievement.getAchievementList())
        AchievementRecycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutMeFragment()
    }
}