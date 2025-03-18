// Inmutables

interface Collection<out E>
interface List<out E>
interface Set<out E>
interface Map<K, out V>



// Mutables
interface MutableCollection<E>
interface MutableList<E>
interface MutableSet<E>
interface MutableMap<K, V>

fun main() {
// Example of using an immutable list
    val immutableList: List<String> = listOf("Viena", "Noemi", "Jose")
// immutableList.add("Fabiola")  // Error: unable to add item


// Example of using a mutable list
    val mutableList: MutableList<String> = mutableListOf("Viena", "Noemi", "Jose")
    mutableList.add("Fabiola")  // it works: You can add a new item
    println(mutableList)  // Output: [Viena, Noemi, Jose, Fabiola]

    val numbers = listOf(1, 2, 3, 4, 5)

// Element access
    val firstNumber = numbers.first()       // 1
    val lastNumber = numbers.last()         // 5
    val thirdNumber = numbers[2]            // 3
    val safeFirst = numbers.firstOrNull()   // 1 (null if list is empty)

// Verification

    val contains = list.contains(3) // true
    val isEmpty = list.isEmpty() // false

    val numbers = listOf(10, 20, 30, 40, 50)

// Map - transforms each element by multiplying it by 2
    val doubled = numbers.map { it * 2 } // [20, 40, 60, 80, 100]

// Filter - filters elements larger than 25
    val filteredNumbers = numbers.filter { it > 25 } // [30, 40, 50]

// FlatMap - flattens and transforms, using a list of lists based on `numbers`
    val nested = numbers.map { listOf(it, it + 5) } // [[10, 15], [20, 25], [30, 35], [40, 45], [50, 55]]

    val flattened = nested.flatMap { it } // [10, 15, 20, 25, 30, 35, 40, 45, 50, 55]


//Collections and lambdas

// Immutable list

    val immutableList: List<String> = listOf("Viena", "Noemi", "Jose")
// Lambda operations on immutable list

    val namesWithA = immutableList.filter { it.contains('a') }
    println("Names with 'a': $namesWithA")

    val upperNames = immutableList.map { it.uppercase() }
    println("Uppercase names: $upperNames")

    val nameLengths = immutableList.map { "${it}: ${it.length} characters" }
    println("Name length: $nameLengths")


// Mutable list

    val mutableList: MutableList<String> = mutableListOf("Viena", "Noemi", "Jose")
    mutableList.add("Fabiola")

// Operations with lambda in mutable list
    val sortedNames = mutableList.sortedBy { it.length }
    println("Names sorted by length: $sortedNames")

// Combining multiple operations

    val processedNames = mutableList
        .filter { it.length > 4 }
        .map { it.uppercase() }
        .sortedBy { it }

    println("Processed Names: $processedNames")
}