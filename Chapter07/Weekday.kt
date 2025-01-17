enum class Weekday(val isWorkday: Boolean) {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    fun isWeekend() = !isWorkday

    companion object {
        fun getWorkdays() = ​entries​.filter { it.isWorkday }
    }
}

fun main() {

    println("Days of the week: ${Weekday.entries.joinToString()}")

    val day = Weekday.SATURDAY
    println("Is $day a workday? ${day.isWorkday}")
    println("Is $day a weekend? ${day.isWeekend()}")
    println("Workdays: ${Weekday.getWorkdays().joinToString()}")

    when (day) {
        Weekday.MONDAY -> println("Start of the week")
        Weekday.FRIDAY -> println("TGIF!")
        Weekday.SATURDAY, Weekday.SUNDAY -> println("Weekend!")
        else -> println("Midweek day")
    }

}