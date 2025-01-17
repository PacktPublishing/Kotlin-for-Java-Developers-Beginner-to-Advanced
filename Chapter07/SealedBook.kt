sealed class Book {

    abstract val title: String
    abstract val author: String
    abstract val year: Int

    class Fiction(
        override val title: String,
        override val author: String,
        override val year: Int,
        val genre: String
    ) : Book() }

class NonFiction(
    override val title: String,
    override val author: String,
    override val year: Int,
    val subject: String
) : Book()

class TextBook(
    override val title: String,
    override val author: String,
    override val year: Int,
    val subject: String,
    val grade: Int

) : Book()

class ComicBook(
    override val title: String,
    override val author: String,
    override val year: Int,
    val illustrator: String

) : Book()

}

fun getBookDetails(book: Book): String {

    return when (book) {
        is Book.Fiction -> "${book.title} by ${book.author} (${book.year}) - Genre: ${book.genre}"
        is Book.NonFiction -> "${book.title} by ${book.author} (${book.year}) - Subject: ${book.subject}"
        is Book.TextBook -> "${book.title} by ${book.author} (${book.year}) - Subject: ${book.subject} for Grade ${book.grade}"
        is Book.ComicBook -> "${book.title} by ${book.author} (${book.year}) - Illustrated by ${book.illustrator}"
    }

}

fun recommendBook(book: Book): String {

    return when (book) {
        is Book.Fiction -> "If you like ${book.genre}, you'll love this book!"
        is Book.NonFiction -> "Great for learning about ${book.subject}."
        is Book.TextBook -> "Essential for students in grade ${book.grade} studying ${book.subject}."
        is Book.ComicBook -> "A visual treat illustrated by ${book.illustrator}."
    }

}

fun main() {
    val books = listOf(
    Book.Fiction("Yo, robot", "Isaac Asimov", 1950, "Fantasy literature"),
    Book.NonFiction("The Theory of Everything: The Origin and Fate of the Universe", "Stephen Hawking", 2002, "Physics"),
    Book.TextBook("Basic Mathematics", "Jose Lujan", 2010, "Sciense", 10),
    Book.ComicBook("Spiderman", "Stan Lee", 1986, "Steve Ditko")
    )

    books.forEach { book ->
        println(getBookDetails(book))
        println(recommendBook(book))
        println()
    }

}