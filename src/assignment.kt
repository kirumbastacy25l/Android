import java.util.Scanner


//largest number 3numbers
fun main() {

    var read = Scanner(System.`in`)
    println("Enter first number :")
    var num1 = read.nextInt()

    println("Enter second number:")
    var num2 = read.nextInt()

    println("Enter third number:")
    var num3 = read.nextInt()


    var largest = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    println("The largest number is: $largest")









}