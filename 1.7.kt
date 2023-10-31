fun main() {
    println("Enter the number:")
    val num = readLine()!!.toInt()
    val result:Long
    result = factorial(num)
    println("Factorial of $num is = $result")
}

fun factorial(n: Int): Long {
    return if(n == 0 || n == 1){
        n.toLong()
    }
    else{
        n.toLong()*factorial(n-1)
    }
}