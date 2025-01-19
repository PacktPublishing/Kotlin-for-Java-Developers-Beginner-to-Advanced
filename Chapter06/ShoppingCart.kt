//Generics vs. Any
class ShoppingCart {

    private val items = mutableListOf<Any>()

    fun addItem(item: Any) {
        items.add(item)
    }

    fun calculateTotal(): Double {
        var total = 0.0
        items.forEach { item ->

// We need to check the type of each item
            when (item) {
                is Product -> total += item.price
                is DiscountedProduct -> total += item.discountedPrice
                else -> println("Unrecognized product type")
            }
        }

        return total
    }

}
/*// Generic cart that only accepts types that implement PricedItem
interface PricedItem {
    fun getPrice(): Double
}

class Product(
    val name: String,
    val price: Double
) : PricedItem {
    override fun getPrice() = price
}

class DiscountedProduct(
    val name: String,
    val price: Double,
    val discount: Double
) : PricedItem {
    override fun getPrice() = price * (1 - discount)
}

// Generic cart that only accepts types that implement PricedItem

class ShoppingCart<T : PricedItem> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun calculateTotal(): Double {
        return items.sumOf { it.getPrice() }
    }

}
*/

//Main
fun main() {
    val cart = ShoppingCart()
    cart.addItem(Product("Laptop", 999.99))
    cart.addItem(DiscountedProduct("Phone", 599.99, 0.1))
    cart.addItem("This shouldn't be here")// we can add any type
    println(cart.calculateTotal()) // Posible error

}

/*
Main for generic cart only accepts types that implement PricedItem
fun main() {
val cart = ShoppingCart<PricedItem>() 
cart.addItem(Product("Laptop", 999.99))
cart.addItem(DiscountedProduct("Phone", 599.99, 0.1))
// cart.addItem("This won't compile") // error: not a `PricedItem`
println(cart.calculateTotal()) // Print the total of the prices

}
 */