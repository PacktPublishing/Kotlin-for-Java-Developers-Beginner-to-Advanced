import kotlinx.coroutines.*

import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {

    val ordersChannel = Channel<String>(3) // Buffer with capacity for 3 orders
    launch {

        val orders = listOf("Order 1", "Order 2", "Order 3", "Order 4", "Order 5")

        for (order in orders) {

            println("Sending: $order to the order system")

            ordersChannel.send(order) // Only blocks if the buffer is full

        }

        ordersChannel.close() // We close the channel after sending all the orders

    }

    launch {

        for (order in ordersChannel) {

            delay(1500) // Simulates the order processing

            println("Processing: $order in the kitchen")

        }

    }

    //Unbuffered Channels
/*
fun main() = runBlocking {
    val ordersChannel = Channel<String>() // Unbuffered channel
    launch {
        val orders = listOf("Order 1", "Order 2", "Order 3", "Order 4", "Order 5")
        for (order in orders) {
            println("Sending: $order to the order system")
            ordersChannel.send(order) // Blocks until the consumer receives the order
        }

    ordersChannel.close() // Close the channel after sending all orders
}

launch {
    for (order in ordersChannel) {
        delay(1500) // Simulates order processing
    println("Processing: $order in the kitchen")
    }

}
 */
