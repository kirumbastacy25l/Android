import java.util.*

//1 number,2number,operator,when....+-*/,invalid operator
import java.util.Scanner
fun main() {

    var read = Scanner(System.`in`)
    println("Enter the first number:")
    var x = read.nextInt()

    println("Select an operator(+,-,*,/):")
    var operator = read.nextInt()



    println("Enter second number:")
    var y = read.nextInt()



    var answer = when(operator){
        1-> x + y
        2 -> x-y
        3 -> x*y
        4 -> x/y

        else -> "Invalid operator entered"


    }

    println(" The answer is $answer")











}












