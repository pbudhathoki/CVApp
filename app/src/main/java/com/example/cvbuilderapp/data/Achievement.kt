package com.example.cvbuilderapp.data

data class Achievement(
    val logo: String,
    val name: String
) {
    companion object {
        fun getAchievementList(): MutableList<Achievement> {
            return mutableListOf(
                Achievement(
                    "https://puskarbudhathoki.com/static/media/3D%20Stacked%20chips.92a18ca5.jpg",
                    "Best Master Thesis Award(Multiobjective optimization of 3D Floorplanning and Placement) - June 2014"
                ),
                Achievement(
                    "https://puskarbudhathoki.com/static/media/IRENA.6182b1cb.jpg",
                    "International Renewable Energy Agency Scholar"
                )
            )
        }
    }
}
