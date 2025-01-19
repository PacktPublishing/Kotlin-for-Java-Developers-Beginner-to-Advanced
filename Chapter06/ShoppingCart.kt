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