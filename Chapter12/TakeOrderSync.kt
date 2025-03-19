fun takeOrderSync(): String {
    Thread.sleep(3000) // Simulates the order preparation time
    return "Delicious Meal"
}

fun main() {
    println("Taking the order...")
    val order = takeOrderSync()
    println("Order served: $order")
}


//What is asynchronous programming?
/*
fun takeOrderAsync(callback: (String) -> Unit) {
    Thread {
        try {
            Thread.sleep(3000) // Simulates the order preparation time
            callback("Delicious Meal")
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }.start()
}

fun main() {
    println("Taking the order...")
    takeOrderAsync { result ->
        println("Order served: $result")
    }
    println("Serving drinks while waiting...")
}
 */

///////////
//Coroutine
//////////
/*
import kotlinx.coroutines.*



fun main() = runBlocking {
    println("Taking the order...")
    // We start a coroutine to simulate the preparation of the order
    takeOrderAsync { result ->
        println("Order served: $result")
}


println("Serving drinks while waiting...")
delay(4000) // We wait to make sure the application does not finish early

}



fun takeOrderAsync(callback: (String) -> Unit) {
    GlobalScope.launch {
    delay(3000) // Simulate the preparation time of the order without blocking the main thread
    callback("Delicious Meal")
    }

}

 */