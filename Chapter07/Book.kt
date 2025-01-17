data class Book(
    val title: String,
    val author: String,
    val isbn: String,
    val pageCount: Int,
    val price: Double
)

fun main() {
    val originalBook = Book("Title", "Author", "123456", 300, 29.99)
    val discountedBook = originalBook.copy(price = 24.99)
    val book = Book("The Best Kotlin Book", "Jose Lujan", "0395415152", 510, 99.99)

    println(originalBook)
    println(discountedBook)
    println(book)
}