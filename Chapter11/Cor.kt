import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//Coroutines
//import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("World Jose!")
    }
    println("Hello")
}


//Coroutines
/*
fun main() = runBlocking {
    println("Taking order...")

    // Coroutine 1: Preparing food in the kitchen
    val food = async { prepareFood() }

    // Coroutine 2: Serving drinks
    serveDrinks()

    // Wait for food to be ready and serve it
    println("Food is ready: ${food.await()}")
}



suspend fun prepareFood(): String {
    delay(3000) // Simulate food preparation
    return "Delicious meal"
}



fun serveDrinks() {
    println("Serving drinks to the table...")
}
 */