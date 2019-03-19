package people

import Enums.Gender
import Enums.Month

data class Person(val age: Int, val dateOfBirth : String, val firstName: String, val lastName: String, val city : String, val state : String, val gender : Gender) {
    fun getMonthOfBirth() : Month {
        val date = dateOfBirth.split("/")
        when (date[0]) {
            "01" -> return Month.JANUARY
            "02" -> return Month.FEBRUARY
            "03" -> return Month.MARCH
            "04" -> return Month.APRIL
            "05" -> return Month.MAY
            "06" -> return Month.JUNE
            "07" -> return Month.JULY
            "08" -> return Month.AUGUST
            "09" -> return Month.SEPTEMBER
            "10" -> return Month.OCTOBER
            "11" -> return Month.NOVEMBER
            "12" -> return Month.DECEMBER
        }
        return Month.JANUARY
    }

    fun getYearOfBirth() : Int {
        val date = dateOfBirth.split("/")
        return date[2].toInt()
    }
}