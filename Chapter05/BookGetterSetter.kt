class Book(var title: String, var author: String, var isbn: String, var pages: Int)

fun main() {
    val book = Book("The Best Kotlin Book", "Jose Lujan", "1234567890", 250)

    //Getter
    println("Title: ${book.title}")

    //Setter
    book.title = "My New Kotlin Programming Book"

    println("Updated Title: ${book.title}")

}