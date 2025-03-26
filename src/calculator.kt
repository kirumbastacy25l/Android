import java.util.*

//1 number,2number,operator,when....+-*/,invalid operator
import java.util.Scanner
fun main() {

    var read = Scanner(System.`in`)
    println("Enter the first number:")
    var x = read.nextInt()

    println("Select an operator(+,-,*,/):")
    var operator = readln()



    println("Enter second number:")
    var y = read.nextInt()



    var answer = when(operator){
        "+" -> x + y
        "-" -> x-y
        "*"-> x*y
        "/" -> x/y

        else -> "Invalid operator entered"


    }

    println("The answer is $answer")











}












