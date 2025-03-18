class MenuBuilder {

    private val items = mutableListOf<MenuItem>()

    fun item(name: String, action: () -> Unit) {
        items.add(MenuItem(name, action))
    }

    fun build(): List<MenuItem> {
        return items.toList()
    }

    fun buildMenu(init: (MenuBuilder) -> Unit): List<MenuItem> {
        val builder = MenuBuilder()
        init(builder)
        return builder.build()
    }

}

data class MenuItem(val name: String, val action: () -> Unit)

fun main() {
    val menu = buildMenu { builder ->
        builder.item("Option 1") { println("Option 1") }
        builder.item("Option 2") { println("Option 2") }
        builder.item("Exit") { println("Exit") } }
        menu.forEachIndexed { index, item ->
            println("${index + 1}. ${item.name}")

    }

    menu[0].action()

}