data class Book(
    val title: String,
    val author: String,
    val genre: String,
    val year: Int,
    val rating: Double,
    val pages: Int
)

fun main(){
    val books = listOf(
        Book("The Pragmatic Programmer", "Dave Thomas", "Programming", 1999, 4.8, 320),
        Book("Clean Code", "Robert Martin", "Programming", 2008, 4.7, 464),
        Book("Design Patterns", "Gang of Four", "Programming", 1994, 4.6, 395),
        Book("Refactoring", "Martin Fowler", "Programming", 1999, 4.7, 431),
        Book("Domain-Driven Design", "Eric Evans", "Programming", 2003, 4.5, 560) )

    val (longBooks, shortBooks) = books.partition { it.pages > 400 }

    //sorterBy
    /*
    val booksByYear = books.sortedBy { it.year }
    println("Books sorted by year: ${booksByYear.map { "${it.title} (${it.year})" }}")
     */

    //associatedBy
    /*
    val booksByAuthor = books.associateBy { it.author }
    println("Books by author: ${booksByAuthor.keys}")
     */

    //maxBy-minBy
    /*
    val longestBook = books.maxBy { it.pages }
    println("Longest book: ${longestBook.title} (${longestBook.pages} pages)")
     */

    //What happens if the list is empty?
    /*
    val longestBook = books.maxBy { it.pages }
    if (longestBook != null) {
        println("Longest book: ${longestBook.title} (${longestBook.pages} pages)")
    } else {
        println("There are no books in the list.")
    }
     */
}