fun add(a: Double, b: Double, c: Double): Double {
    return a + b + c
}
fun subtract(a: Double, b: Double, c: Double): Double {
    return a - b - c
}
fun multiply(a: Double, b: Double, c: Double): Double {
    return a * b * c
}
fun divide(a: Double, b: Double, c: Double): Double {
    if (b != 0.0 && c != 0.0) {
        return a / b / c
    } else {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
}
fun main(){
    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull()
    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull()
    print("Enter the third number: ")
    val num3 = readLine()?.toDoubleOrNull()
    if (num1 == null || num2 == null || num3 == null) {
        println("Invalid input. Please enter valid numbers.")
    } else {
        println("Addition: ${add(num1, num2, num3)}")
        println("Subtraction: ${subtract(num1, num2, num3)}")
        println("Multiplication: ${multiply(num1, num2, num3)}")
        try {
            println("Division: ${divide(num1, num2, num3)}")
        } catch (ex: IllegalArgumentException) {
            println(ex.message)
        }
    }
}
