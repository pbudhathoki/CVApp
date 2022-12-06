package com.example.cvbuilderapplicationassignment6.data

data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "MiSUMi Group Inc.",
                    "Mar 2016",
                    "Jan 2022",
                    "Tokyo, Japan",
                    "https://us.misumi-ec.com/logo.png",
                    "Manufacturing business providing CAD software services.Implemented frontend and backend development for numerous applications while creating clean and efficient code in C#."
                ),
                Work(
                    "E&T Nepal Pvt. Ltd.",
                    "Mar 2009",
                    "Aug 2012",
                    "Kathmandu, Nepal",
                    "https://zenprospect-production.s3.amazonaws.com/uploads/pictures/621cb3343cc1b10001abff0b/picture",
                    "Software development outsourcing company.Contributed to frontend development and backend of CAE desktop application software used to analyze mechanical systems."
                ),
            )
        }
    }
}
