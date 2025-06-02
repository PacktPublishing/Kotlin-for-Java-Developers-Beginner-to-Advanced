fun main() {
    val screen = BookScreen()
    screen.loadBookData()

}

//first example
/*
import kotlinx.coroutines.delay 
import kotlinx.coroutines.launch 
import kotlinx.coroutines.runBlocking 

fun main() = runBlocking {
    launch { 
        delay(1000L) 
        println("Kotlin World! ")
    }  
    println("Hello") 
} 
*/



//main Context and Scope

/*
fun main() {

    val screen = BookScreen()
// Start loading book details
    screen.loadBookDetails("1")

// Simulate task cancellation after 5 seconds
    runBlocking {
    delay(5000)
    screen.cancelAllTasks()

    }

}
 */
