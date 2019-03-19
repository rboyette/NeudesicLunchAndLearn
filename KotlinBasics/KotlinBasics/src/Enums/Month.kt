package Enums

enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

fun Int.toMonth(): Month{
    when (this) {
        1 -> return Month.JANUARY
        2 -> return Month.FEBRUARY
        3 -> return Month.MARCH
        4 -> return Month.APRIL
        5 -> return Month.MAY
        6 -> return Month.JUNE
        7 -> return Month.JULY
        8 -> return Month.AUGUST
        9 -> return Month.SEPTEMBER
        10 -> return Month.OCTOBER
        11 -> return Month.NOVEMBER
        12 -> return Month.DECEMBER
    }
    throw IllegalArgumentException("Undefined month")
}