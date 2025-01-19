// Instead of creating multiple classes:

class StringBox(val value: String)
class IntBox(val value: Int)
class PersonBox(val value: Person)

// Create a single generic class:
class Box<T>(val value: T) {
    fun getValue(): T = value
}

// Use generic classes:
val stringBox = Box("Hello")
val numberBox = Box(100)
val personBox = Box(Person("Jose Lujan"))

/*
// Generic function to process lists
fun <T> List<T>.processEach(action: (T) -> Unit) {
    forEach { item -> action(item) }
}

// Use with different types:
val numbers = listOf(33, 3, 38)
numbers.processEach { println("Number: $it") }
val names = listOf("Noemi", "Viena", "Jose")
names.processEach { println("Name: $it") } */



/* When not to use generics?

// BAD (overcomplicated):
class UserRepository<T : User> {
fun save(item: T)
fun find(id: Int): T
}

// BETTER (simpler and clearer):
class UserRepository {
fun save(user: User)
fun find(id: Int): User
}
 */

/*
// If you only need to print items:
// BAD (unnecessarily generic):
fun <T> printItem(item: T) {
    println(item.toString())
}



// BETTER (simpler):
fun printItem(item: Any) {
    println(item.toString())
}
 */