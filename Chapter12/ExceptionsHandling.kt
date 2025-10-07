import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce

fun CoroutineScope. producePackets(): ReceiveChannel<String> = produce {

    val packages = listOf("Packet 1", "Packet 2", "Packet 3", "Packet 4", "Packet 5")
    for (pack in packages) {
        try {
            println("Generating: $pack")
            send(pack)
            delay(1000)
        } catch (e: Exception) {
            println("Error generating packet: ${e.message}")
            throw e // Propagate the error
        }

    }

}

fun CoroutineScope.processPackets(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (packet in input) {
        try {
            withTimeout(2000) { // 2 second timeout
                println("Processing: $packet")
                delay(1500)
                send("$packet processed")
            }

        } catch (e: TimeoutCancellationException) {
            println("Timeout processing $packet")
            throw e
        } catch (e: Exception) {
            println("Error processing packet: ${e.message}")
            throw e
        }

    }

}

fun CoroutineScope.packagingResults(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (pack in input) {
        try {
            println("Packaging: $pack")
            delay(1000)
            send("$pack packed and ready for shipping")
        } catch (e: Exception) {
            println("Error packaging package: ${e.message}")
            throw e
        }

    }

}

fun main() = runBlocking {

// Global exception handler

    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        println("Error caught by CoroutineExceptionHandler: ${exception.message}")
    }

// Creating the scope with the exception handler
    val scope = CoroutineScope(Dispatchers.Default + exceptionHandler)

    try {
        val packageChannel = scope.producePackets()
        val packagesProcessed = scope.processPackets(packageChannel)
        val packaged = scope.packagingResults(packagesProcessed)
        // Consume the final result

        for (result in packaged) {
            println("Final result: $result")
        }

        println("Pipeline complete.")
    } catch (e: Exception) {
        println("An error occurred in the pipeline: ${e.message}")
    } finally {

        println("Closing resources and channels.")
        scope.cancel() // Cancel all coroutines

    }
}
