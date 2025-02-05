//Functional programming Section 01

//functional programming code 1st code
fun main(){
    val greet: (String) -> String = { name -> "Hello, $name!" }
    println(greet("Noemi"))

}

/*some code that passes functions as arguments
fun applyOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {

    return operation(x, y)

}
 */


/*Example code to see how to return functions from other functions
fun createMultiplier(factor: Int): (Int) -> Int {

    return { n -> n * factor }

}

val double = createMultiplier(2)

println(double(5))
 */

/*
val operations = listOf<(Int, Int) -> Int>(

    { a, b -> a + b },

    { a, b -> a - b },

    { a, b -> a * b }

)
println(operations[0](10, 5))
println(operations[1](10, 5))
println(operations[2](10, 5))
 */


/*
val list = lisfof(1,2,3,4,5)
//list.add(100) This uncommented line of code would be an error since the list is immutable
 */



////Inmutability/////
/*
val list = listOf(1,2,3,4,5)

val myList = list + 10 // we have a new list[1,2,3,4,5,10]
 */


/*
data class  User(val name:String, val email: String)

val user = User (“Viena”, 3)

//user.name = “Madison”  If we were to uncomment this line of code, this would flag an error since the properties we have defined are immutable because we use the word val.
 */

/*
val list = listOf(1,2,3,4,5)

val myList = list + 10 // we have a new list[1,2,3,4,5,10]
 */

///Purity

/*
fun add(a:Int, b:Int): Int {

return a + b

}
 */


/*
var result = 0

fun add(a:Int){

result += 1

}
 */

/* example of a higher-order function

fun operate(a: Int, b:Int, operation: (Int, Int) -> Int): Int{

return operation(a,b)

}

val sum = operate(10,1) { x, y -> x + y }
val product = operate(10,1){ x, y -> x *y }
 */