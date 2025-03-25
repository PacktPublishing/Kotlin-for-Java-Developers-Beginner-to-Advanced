import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class BookTest {
    @Test
    fun `calculate 20 percent discount for a 100 dollar book`() {
        // Given
        val book = Book("Clean Code", 100.0)

        // When
        val discountedPrice = book.calculateDiscountedPrice(20)

        // Then
        assertEquals(80.0, discountedPrice)
    }

    //more complete test
    /*
    @Test
    fun `no discount should return original price`() {
    // Given
    val discountPercent = 0

    // When
    val discountedPrice = book.calculateDiscountedPrice(discountPercent)

    // Then
    assertEquals(100.0, discountedPrice)
}
     */


    // case that verifies when a 100% discount is applied (discountPercent = 100), the calculated price of a book is equal to zero.
    /*
    @Test
    fun `full discount should return zero`() {
    // Given
    val discountPercent = 100

    // When
    val discountedPrice = book.calculateDiscountedPrice(discountPercent)

    // Then
    assertEquals(0.0, discountedPrice)
    }
     */

    // case that verifies that the calculateDiscountedPrice method throws an exception when a negative discount percentage is provided
    /*
    @Test
    fun `should throw exception when discount is negative`() {
    // When/Then
        assertThrows<IllegalArgumentException> {
        book.calculateDiscountedPrice(-1)
        }
    }
     */

    //This test case verifies that the calculateDiscountedPrice method throws an exception when a discount percentage greater than 100 is provided, which is invalid
    /*
    @Test
    fun `should throw exception when discount is over 100`() {
    // When/Then
        assertThrows<IllegalArgumentException> {
            book.calculateDiscountedPrice(101)
        }
    }
     */


    //OperationTest Parameterized
    /*
    import org.junit.jupiter.api.Test
    import org.junit.jupiter.params.ParameterizedTest
    import org.junit.jupiter.params.provider.CsvSource
    import org.junit.jupiter.api.Assertions.*

    class OperationsTest {
        val testOperation = Operations()

        @ParameterizedTest
        @CsvSource(
            "5, 5, 10",
            "1, 2, 3",
            "0, 0, 0",
            "-1, 1, 0",
            "10, -5, 5"
        )
        fun sum(a: Int, b: Int, expected: Int) {
            assertEquals(expected, testOperation.sum(a, b))
        }
    }
     */

}