class BookService(private val repository: BookRepository) {
    suspend fun applyDiscount(bookId: String, discountPercent: Int): Book {
        require(discountPercent in 0..100) {
            "Discount must be between 0 and 100"
        }

        val book = repository.findById(bookId)
            ?: throw NoSuchElementException("Book not found")

        val discountedPrice = book.price - (book.price * discountPercent / 100)

        return repository.save(Book(
            book.id,
            book.title,
            discountedPrice,
            book.author,
            book.isbn
        ))
    }
}