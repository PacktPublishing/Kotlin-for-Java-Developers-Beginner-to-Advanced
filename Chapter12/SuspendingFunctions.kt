import kotlinx.coroutines.*

// Suspendable function to take the order

suspend fun takeOrderSuspend(): String {
    delay(3000) // Simulates the preparation time of the order
    return "Delicious Meal"

}

fun main() = runBlocking {
    println("Taking the order...")


// We call the suspendable function directly in the coroutine
    val order = takeOrderSuspend()
    println("Order served: $order")
    println("Serving drinks while waiting...")

}


// API calls
/*
suspend fun getProduct(id: String): Product {

    return withContext(Dispatchers.IO) {

        api.getProduct(id) // Simulates a call to get product data

    }

}
 */

// Database operations
/*
suspend fun saveProduct(product: Product) {

    withContext(Dispatchers.IO) {

        database.insert(product) // Simulates inserting the product into the database

    }

}

 */


// Combination of operations

/*suspend fun updateInventory(id: String, newStock: Int) {

    val product = getProduct(id) // Gets the product from the API

    product.updateStock(newStock) // Updates the available quantity of the product

    saveProduct(product) // Saves the updated product to the database

}

 */