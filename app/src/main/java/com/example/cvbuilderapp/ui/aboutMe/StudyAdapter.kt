package com.example.cvbuilderapp.ui.aboutMe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Study

class StudyAdapter(
    private val StudyList: MutableList<Study> = mutableListOf()
) : RecyclerView.Adapter<StudyAdapter.StudyViewHolder>(){

    inner class StudyViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        fun bind(Study: Study) {
            val uniNameTxt: TextView = view.findViewById(R.id.uni_name_text_view)
            val deptNameTxt: TextView = view.findViewById(R.id.dept_name_text_view)
            val logo: ImageView = view.findViewById(R.id.logo_image_view)

            uniNameTxt.text = Study.collegeName
            deptNameTxt.text = Study.program

            Glide.with(view.context).load(Study.logo).into(logo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_study, parent, false)
        return StudyViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudyViewHolder, position: Int) {
        holder.bind(StudyList[position])
    }

    override fun getItemCount(): Int = StudyList.size
}