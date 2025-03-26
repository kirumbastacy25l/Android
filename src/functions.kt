fun main() {
    //Standard Library Functions/Predefined
    var x = Math.sqrt(144.0)
    println("The square root of 144 is $12")

    var y = Math.round(45.45)
    println("The output is $y")

    school()//Calling a function
    student("Joseph",23)
    student("Ian",19)
    employee("Raphael James",80000,false)
    employee("Silin James",60000,false)





}

//User-Defined Functions
fun school(){
    println("eMobilis")

}

//Parameter/Variable and Argument/Value
fun student(name:String,age :Int){
    println("$name is $age years old")

}
fun employee(name:String,salary:Int,disability:Boolean,){
    println("$name is earning $salary.Disability:$disability")


}
























































