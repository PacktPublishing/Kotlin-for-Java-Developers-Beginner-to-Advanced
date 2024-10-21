class Book(var title: String, var author: String, var isbn : String, var pages: Int, var isRead: Boolean){
    init {
        title = title.uppercase()
        author = author.uppercase()
        println("Created Book: $title by $author")
    }
    val publisher: String = "Packt"
    //Second init block, if we need it, we can use more init blocks.
    init {
        println("Second init Block")
    }


}