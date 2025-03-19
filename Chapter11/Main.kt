fun main() {
    val screen = BookScreen()
    screen.loadBookData()

}


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