import kotlinx.coroutines.*


// Simulate a repository that fetches book data
class BookRepository {

// Simulate an API call to fetch a book
    suspend fun fetchBookFromApi(bookId: String): Book {
        delay(2000) // Simulate network response time
        return Book(bookId, "Clean Code", "Robert C. Martin")
    }

}


//Timeouts and cancellations

/*
class BookRepository {
    // Simulates an API call to get a book
    suspend fun fetchBookFromApi(bookId: String): Book {
        delay(3000) // Simulates network response time
        return Book(bookId, "Clean Code", "Robert C. Martin")
    }
}

data class Book(
val id: String,
val title: String,
val author: String
)

Now we will change the launch, it will look like this:

val job = launch {
    try {
        println(" Loading book information...")
        // Set a timeout for the operation
        val book = withTimeout(2000) { // 2 second timeout
        repository.fetchBookFromApi("1")
    }

    println(" Book loaded: ${book.title} by ${book.author}")

    } catch (e: TimeoutCancellationException) {
        println(" Timeout exceeded when loading book.")
    } catch (e: Exception) {
    println(" Error loading book information: ${e.message}")
    }

}
 */



