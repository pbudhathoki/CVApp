package com.example.cvbuilderapp.data

data class Study(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getStudyList() : MutableList<Study> {
            return mutableListOf(
                Study(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Study(
                    "Khalifa University/Masdar Institute",
                    "Master in Computing and Information Science",
                    "https://www.ku.ac.ae/wp-content/uploads/2021/08/cropped-logo.png"
                ),
                Study(
                    "Advanced College of Engineering and Management",
                    "Bachelor in Computer Engineering",
                    "https://www.collegenp.com/uploads/2018/05/Advanced-College-of-Engineering-and-Management.jpg"
                )
            )
        }
    }
}
