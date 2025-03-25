// Book.kt
class Book(
    val title: String,
    val price: Double
) {
    fun calculateDiscountedPrice(discountPercent: Int): Double {
        require(discountPercent in 0..100) {
            "Discount must be between 0 and 100"
        }
        return price - (price * discountPercent / 100)
    }
}


//Book Domain
/*
data class Book(
    val id: String,
    val title: String,
    val price: Double,
    val author: String,
    val isbn: String
)
 */