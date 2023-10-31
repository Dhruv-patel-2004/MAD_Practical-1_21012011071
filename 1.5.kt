fun main(){
    fun getmonthname(monthnum:Int):String{
        return when(monthnum){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Invalid month number"
        }
    }
    print("Enter monthnumber between(1-12):")
    val userInput = readLine()?.toIntOrNull()

    if (userInput != null && userInput in 1..12) {
        val monthName = getmonthname(userInput)
        println("Month: $monthName")
    } else {
        println("Invalid input. Please enter a valid month number between 1 and 12.")
    }
}
 

 