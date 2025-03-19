import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce

fun CoroutineScope. producePackets(): ReceiveChannel<String> = produce {
    val packets = listOf("Package 1", "Package 2", "Package 3", "Package 4", "Package 5")
    for (package in packets) {
        println("Generating: $packet")
        send(package)
        delay(1000) // Simulates time between packet generation

    }

}

fun CoroutineScope. processPackets(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (package in input) {
        println("Processing: $packet")
        delay(1500) // Simulates processing time
        send("$package processed")

    }

}


fun CoroutineScope. packResults(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (package in input) {
        println("Packing: $package")
        delay(1000) // Simulates packaging time
        send("$package packed and ready for shipping")
    }

}

fun main() = runBlocking {

// Step 1: Generate packets
    val packetChannel = producePackets()

// Step 2: Process packets
    val processedPackets = processPackets(packageChannel)

// Step 3: Package results
    val packaged = packageResults(processedPackets)

// Consume the final result

    for (result in packaged) {
        println("Final result: $result")
    }
    println("Pipeline complete.")

}