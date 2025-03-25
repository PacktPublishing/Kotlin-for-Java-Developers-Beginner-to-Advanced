// We import the libraries needed for the tests
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.*

// We import kotlinx.coroutines to handle suspended functions in tests
import kotlinx.coroutines.runTest
// We define the integration test class
class BookServiceIntegrationTest {
    // Variables for the components to be tested
    private lateinit var bookRepository: BookRepository
    private lateinit var bookService: BookService
    private lateinit var testBook: Book

    @BeforeEach
    fun setup() {
        bookRepository = TestBookRepository()
        bookService = BookService(bookRepository)
        testBook = Book("1", "Clean Code", 100.0, "Robert C. Martin", "978-0132350884")

        runTest {
            bookRepository.save(testBook)
        }
    }

    @Test
    fun `should apply discount to book price and persist changes`() = runTest {
        // Given: We set up the test scenario
        val discountPercent = 20

        // When: We apply the discount
        val discountedBook = bookService.applyDiscount(testBook.id, discountPercent)

        // Then: We verify that the discount was applied correctly
        assertEquals(80.0, discountedBook.price)

        // We also verify that the updated book was saved in the "database"
        val savedBook = bookRepository.findById(testBook.id)
        assertNotNull(savedBook)
        assertEquals(80.0, savedBook?.price)
    }

    @Test
    fun `should throw exception when book not found`() = runTest {
        assertThrows<NoSuchElementException> {
            bookService.applyDiscount("non-existent-id", 20)
        }
    }

    @Test
    fun `should throw exception for invalid discount percentage`() = runTest {
        assertThrows<IllegalArgumentException> {
            bookService.applyDiscount(testBook.id, 101)
        }
    }
}