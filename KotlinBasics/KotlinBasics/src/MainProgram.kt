import Enums.Gender
import Enums.toMonth
import Point.Point
import people.Person
import java.util.*

fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    do {
        println("Select an option below:")
        println("1. Filter and search")
        println("2. Operator overloads")
        println("3. Quit")
        val input = scanner.nextLine()

        val choice = Integer.parseInt(input)
        when (choice) {
            1 -> filterAndSearch(scanner)
            2 -> operatorOverloads(scanner)
            3 -> println("Good bye!")
        }
    } while(choice != 3)
}

private fun operatorOverloads(scanner: Scanner) {
    println("Create a point:")
    print("x: ")
    val xInput = scanner.nextLine()

    print("y: ")
    val yInput = scanner.nextLine()

    println("Create another point:")
    print("x2: ")
    val x2Input = scanner.nextLine()

    print("y2: ")
    val y2Input = scanner.nextLine()

    val p1 = Point(xInput.toDouble(), yInput.toDouble())
    val p2 = Point(x2Input.toDouble(), y2Input.toDouble())

    println("1. Add two points")
    println("2. Subtract two points")

    val input = scanner.nextLine()

    val choice = Integer.parseInt(input)

    when(choice) {
        1 -> {
            val sum = p1 + p2 //p1.plus(p2)
            println("Two points added together: $sum")
        }

        2 -> {
            val sum = p1 - p2
            println("Two points aubstracted: $sum")
        }
    }
}

private fun filterAndSearch(scanner: Scanner) {
    val listOfPeople = listOf(Person(23, "12/09/1995", "Mary", "Jane", "Tukwila", "Washigton", Gender.F),
                              Person(24, "03/01/1995", "John", "Doe", "Puyallup", "Washington", Gender.M),
                              Person(35, "08/03/1984", "Robert", "Samson", "Grays Harbor", "Washington", Gender.M),
                              Person(60, "07/07/1959", "Jane", "Smith", "Glendale", "Arizona", Gender.F),
                              Person(40, "04/02/1979", "Bradley", "Hoff", "Salem", "Oregon", Gender.M),
                              Person(50, "04/05/1969", "Liam", "Zulu", "Portland", "Oregon", Gender.M),
                              Person(24, "03/08/1995", "Paulina", "Vasquez", "Redmond", "Washington", Gender.F),
                              Person(12, "07/08/2007",  "Julie", "Timm", "Vancouver", "Washington",Gender.F),
                              Person(60, "09/07/1959", "Joe", "Bishop", "Yakima", "Washington", Gender.M),
                              Person(24, "09/01/1994", "Will", "Laughlin", "Colfax", "Washington", Gender.M),
                              Person(10, "02/20/2009", "Emily", "Donald", "Bend", "Oregon", Gender.F),
                              Person(11, "02/01/2010", "Abraham", "Claasen", "Eugene", "Oregon", Gender.M),
                              Person(70, "08/01/1948", "Rickey", "Merlin", "Kitty Hawk", "North Carolina", Gender.M))

    println("Choose what to filter by:")
    println("1. Age")
    println("2. Year of birth")
    println("3. Month of birth")
    println("4. Gender")
    println("5. State of residence")

    val userInput = scanner.nextLine()

    val choice = Integer.parseInt(userInput)

    when (choice){
        1 -> chooseAgeFilterAndSearch(scanner, listOfPeople)
        2 -> chooseYearAndFilter(scanner, listOfPeople)
        3 -> chooseMonthAndFilter(scanner, listOfPeople)
        4 -> chooseGenderAndFilter(scanner, listOfPeople)
        5 -> chooseStateAndFilter(scanner, listOfPeople)
    }
}

private fun chooseStateAndFilter(scanner: Scanner, listOfPeople: List<Person>) {
    print("Enter a state to filter on: ")
    val state = scanner.nextLine()

    println("Finding people who reside in $state state...")
    val peopleWhoResideInStateSpecified = listOfPeople.filter {  it.state == state }.toList()
    if (peopleWhoResideInStateSpecified.isEmpty())
        println("No one found who reside in $state")
    else
        peopleWhoResideInStateSpecified.forEach{println(it)}
}

private fun chooseGenderAndFilter(scanner: Scanner, listOfPeople: List<Person>) {
    print("Choose a gender to filter on (F or M): ")
    val gender = scanner.nextLine()

    var genderEnum : Gender = Gender.F
    when (gender){
        "M" -> genderEnum = Gender.M
        "F" -> genderEnum = Gender.F
    }

    println("finding people who are gender $gender")
    // can be written at sortedBy { it -> it.getYearOfBirth() }
    val peopleByGender = listOfPeople.filter { it.gender == genderEnum }.sortedBy { it.getYearOfBirth() }.toList()
    if (peopleByGender.isEmpty())
        println("No one found with gender $gender")
    else
        peopleByGender.forEach{println(it)}
}

private fun chooseMonthAndFilter(scanner: Scanner, listOfPeople: List<Person>) {
    print("Choose a month to filter on: ")
    val input = scanner.nextLine()
    val month = Integer.parseInt(input)
    val peopleByMonth = listOfPeople.filter { it.getMonthOfBirth() ==  month.toMonth()}.sortedByDescending { it.lastName }.toList()

    if (peopleByMonth.isEmpty()) println("No one found with month $month") else peopleByMonth.forEach { println(it) }
}

private fun chooseYearAndFilter(scanner: Scanner, listOfPeople: List<Person>) {
    print("Search by specific year: ")
    val input = scanner.nextLine()

    val year = Integer.parseInt(input)
    val peopleByYear = listOfPeople.filter { it.getYearOfBirth() == year }.sortedByDescending { it.lastName }.toList()

    if(peopleByYear.isEmpty()) println("No one found with year $year") else peopleByYear.forEach { println(it) }
}

private fun chooseAgeFilterAndSearch(scanner: Scanner, listOfPeople: List<Person>) {
    println("Age range or specific age?")
    println("1. Age range")
    println("2. Specific age")
    val input = scanner.nextLine()

    val choice = Integer.parseInt(input)

    when (choice) {
        1 -> filterOnAgeRange(scanner, listOfPeople)
        2 -> filterOnSpecificAge(scanner, listOfPeople)
    }
}

fun filterOnSpecificAge(scanner: Scanner, listOfPeople: List<Person>) {
    print("Enter an age to filter on: ")
    val input = scanner.nextLine()

    val peopleByAge = listOfPeople.filter { it.age == Integer.parseInt(input) }.toList()

    if (peopleByAge.isEmpty())
        println("No people found at age $input")
    else
        peopleByAge.forEach { println(it) }
}

fun filterOnAgeRange(scanner: Scanner, listOfPeople: List<Person>) {
    print("Enter start range: ")
    val start = scanner.nextLine()
    print("Enter end range: ")
    val end = scanner.nextLine()

    val startAge = Integer.parseInt(start)
    val endAge = Integer.parseInt(end)

    val peopleAgeRange = listOfPeople.filter { it.age in startAge..endAge }.toList()

    if(peopleAgeRange.isEmpty())
        println("No people found between $startAge and $endAge")
    else
        peopleAgeRange.forEach { println(it) }
}
