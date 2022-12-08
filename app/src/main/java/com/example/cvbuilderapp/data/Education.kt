package com.example.cvbuilderapp.data

data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "Khalifa University/Masdar Institute",
                    "Master in Computing and Information Science",
                    "https://www.ku.ac.ae/wp-content/uploads/2021/08/cropped-logo.png"
                ),
                Education(
                    "Advanced College of Engineering and Management",
                    "Bachelor in Computer Engineering",
                    "https://www.collegenp.com/uploads/2018/05/Advanced-College-of-Engineering-and-Management.jpg"
                )
            )
        }
    }
}
