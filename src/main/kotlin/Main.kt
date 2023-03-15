fun main(){
    drinks(10)
    drinks(5)
    drinks(20)
    var t = studentsArray(arrayOf("Stephanie","Florence","Joyce","Esther"))
    println(t)
    oddNums()
    products()


}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
    fun drinks(age: Int) {
        if (age in 0..6) {
            println("milk ")}
            else if (age in 7 .. 14){
                println("fanta orange")
            }
            else{
                println("coca cola")

        }
    }


//Create a function that prints out all the odd numbers between 1 and 100
fun oddNums() {
    for (num in 1 .. 100){
        if (num % 2 !=0) {
            println(num)
        }
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun studentsArray(name:Array<String>): Int{
        var addition = 0
        for (n in name){
            if(n.length>5){
                addition++
            }

        }
        return addition


}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun products() {
    for (numbers in 1..100)
        when {
            numbers % 3 == 0 ->
                println("Fizz")

            numbers % 5 == 0 ->
                println("Buzz")

            numbers % 3 == 0 && numbers % 5 == 0 ->
                println("FizzBuzz")
        }
    }

