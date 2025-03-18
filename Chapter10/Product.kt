data class Product(val name: String, val category: String, val price: Double)

fun main() {

    val products = listOf(
        Product("Kotlin Master", "Books", 90.0),
        Product("Phone", "Electronics", 800.0),
        Product("Shoes", "Clothing", 120.0),
        Product("Jacket", "Clothing", 150.0),
        Product("Book", "Books", 30.0)

    )

    val totalsByCategory = products.groupBy { it.category }
        .mapValues { (_, items) -> items.sumOf { it.price } }
    println(totalsByCategory)

}