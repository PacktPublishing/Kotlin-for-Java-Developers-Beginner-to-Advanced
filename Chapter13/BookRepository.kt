interface BookRepository {
    suspend fun findById(id: String): Book?
    suspend fun save(book: Book): Book
}