import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce

fun CoroutineScope. producePackets(): ReceiveChannel<String> = produce {
    val packets = listOf("Package 1", "Package 2", "Package 3", "Package 4", "Package 5")
    for (pack in packets) {
        println("Generating: $pack")
        send(pack)
        delay(1000) // Simulates time between packet generation

    }

}

fun CoroutineScope. processPackets(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (pack in input) {
        println("Processing: $pack")
        delay(1500) // Simulates processing time
        send("$pack processed")

    }

}


fun CoroutineScope. packResults(input: ReceiveChannel<String>): ReceiveChannel<String> = produce {

    for (pack in input) {
        println("Packing: $pack")
        delay(1000) // Simulates packaging time
        send("$pack packed and ready for shipping")
    }

}

fun main() = runBlocking {

// Step 1: Generate packets
    val packetChannel = producePackets()

// Step 2: Process packets
    val processedPackets = processPackets(packetChannel)

// Step 3: Package results
    val packaged = packResults(processedPackets)

// Consume the final result

    for (result in packaged) {
        println("Final result: $result")
    }
    println("Pipeline complete.")

}
