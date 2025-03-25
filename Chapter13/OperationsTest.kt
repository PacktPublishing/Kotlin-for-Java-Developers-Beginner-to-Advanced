import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class OperationsTest {
    private val testOperation: Operations = Operations()

    //private lateinit var operations: Operations   // improve the code

    @Test
    fun sum() {
        val expected = 10
        assertEquals(expected, testOperation.sum(5,5))
    }

    @BeforeEach
    fun setup() {
        operations = Operations()
    }

    @Test
    fun `sum of 5 and 5 should return 10`() {
        // Given
        val expected = 10
        // When
        val result = operations.sum(5, 5)
        // Then
        assertEquals(expected, result)
    }

    val result = operations.sum(5, 5)

}