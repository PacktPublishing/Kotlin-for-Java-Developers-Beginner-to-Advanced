import kotlinx.coroutines.channels.ticker


fun main() = runBlocking {

    val tickerChannel = ticker(delayMillis = 1000, initialDelayMillis = 0) // Generate a packet every 1 second

    launch {

        repeat(5) { // Simulate the generation of 5 packets

            tickerChannel.receive() // Receive an event from the ticker

            println("Packet generated: ${System.currentTimeMillis()}")

        }

        tickerChannel.cancel() // Cancel the ticker after generating the packets

    }

    launch {

        delay(1500) // Simulate a small delay before starting to process

        repeat(5) { // Process the 5 packets

            println("🚚 Processing packet: ${System.currentTimeMillis()}")

            delay(2000) // Simulates the time it takes to process each packet

        }

    }
}