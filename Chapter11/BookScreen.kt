class BookScreen {

    private val repository = BookRepository()

    fun loadBookData() = runBlocking {

        try {
            println(" Loading book information...")
            // Send the request in a coroutine
            val book = withContext(Dispatchers.IO) {
                repository.fetchBookFromApi("1")
            }

            //Context and Scope change
            /*
                val book = withTimeout(3000) {
                // Set a timeout of 3 seconds

                withContext(Dispatchers.IO) {

                // Run the task in the I/O Dispatcher
                repository.fetchBookFromApi(bookId)

}

}
             */



            println(" Book loaded: ${book.title} by ${book.author}")
        } catch (e: Exception) {
            println(" Error loading book information: ${e.message}")

        }

    }

}
//Context and Scope
/*
class BookScreen {
    private val repository = BookRepository()
    private val scope = CoroutineScope(Dispatchers.Main + Job())


    fun loadBookDetails(bookId: String) {
        scope.launch {
        withContext(Dispatchers.IO) {
        // code here

        }

    }

}
fun cancelAllTasks() {
    scope.cancel() // Cancels all coroutines in the Scope
    println("All tasks were cancelled.")

}
 */


/*
    val book = withTimeout(3000) {
    // Set a timeout of 3 seconds
    withContext(Dispatchers.IO) {
    // Run the task in the I/O Dispatcher
    repository.fetchBookFromApi(bookId)
    }

}
 */


//Timeouts and cancellations
/*
class BookRepository {

    // Simulates an API call to get a book
    suspend fun fetchBookFromApi(bookId: String): Book {
    delay(3000) // Simulates network response time
    return Book(bookId, "Clean Code", "Robert C. Martin")
}

}
 */


