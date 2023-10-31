fun main() {
    fun checkOddOrEven(number: Int): String {
        return if (number % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }
    print("Enter a number: ")
    val userInput = readLine()?.toIntOrNull()
    if (userInput != null) {
        val result = checkOddOrEven(userInput)
        println("$userInput is $result")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}


