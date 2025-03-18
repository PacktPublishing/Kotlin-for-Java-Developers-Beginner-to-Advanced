// Kotlin file: Books.kt

data class Book(
    val title: String,
    val author: String,
    val year: Int

)

// Function that creates and returns a Kotlin list

fun getKotlinBooks(): List<Book> {

    return listOf(

        Book("Clean Code", "Robert Martin", 2008),

        Book("Design Patterns", "Gang of Four", 1994)

    )

}