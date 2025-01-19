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