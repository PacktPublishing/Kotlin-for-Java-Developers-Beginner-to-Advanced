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

    // Before
    //fun buildMenu(init: (MenuBuilder) -> Unit): List<MenuItem>

    // Later
    //fun buildMenu(init: MenuBuilder.() -> Unit): List<MenuItem>

    // Before
    //init(builder)

    // Latter
    //builder.init()
    fun main() {
        val menu = buildMenu {
            item("Option 1") { println("Option 1") }
            item("Option 2") { println("Option 2") }
            item("Exit") { println("Exit") }
        }
    }

}