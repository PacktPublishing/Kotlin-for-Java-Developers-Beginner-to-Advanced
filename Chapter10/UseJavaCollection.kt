// Kotlin file

// Using Java collection in Kotlin
fun main(){
    val javaRepo = JavaBookRepository()
    val javaBooks: java.util.List<Book> = javaRepo.getJavaBooks()
    // We can use Java methods

    javaBooks.add(Book("Refactoring", "Martin Fowler", 1999))
    // Or convert to Kotlin collection
    val kotlinBooks: List<Book> = javaBooks

    // We can also convert to Kotlin MutableList
    val mutableKotlinBooks: MutableList<Book> = javaBooks.toMutableList()

    javaBooks.add(Book("Refactoring", "Martin Fowler", 1999))
    kotlinBooks.add(Book("New Book", "Author", 2023)) // Error: `add` is not available on a Kotlin `List`
    val mutableKotlinBooks: MutableList<Book> = javaBooks.toMutableList()


}
