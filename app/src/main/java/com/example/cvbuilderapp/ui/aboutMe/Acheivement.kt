package com.example.cvbuilderapp.ui.aboutMe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cvbuilderapp.R
import com.example.cvbuilderapp.data.Achievement

class AchievementAdapter(
    private val AchievementList: MutableList<Achievement> = mutableListOf()
) : RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>(){

    inner class AchievementViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        fun bind(Achievement: Achievement) {
            val nameTextView: TextView = view.findViewById(R.id.certificate_name_text_view)
            val logoImageView: ImageView = view.findViewById(R.id.logo_image_view)

            nameTextView.text = Achievement.name
            Glide.with(view.context).load(Achievement.logo).into(logoImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_achievment, parent, false)
        return AchievementViewHolder(view)
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        holder.bind(AchievementList[position])
    }

    override fun getItemCount(): Int = AchievementList.size
}