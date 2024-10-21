class Book(var title: String, var author: String, var isbn : String, var pages: Int, var isRead: Boolean){
    init {
        title = title.uppercase()
        author = author.uppercase()
        println("Created Book: $title por $author")
    }

    val publisher: String = "Packt"

    init {
        println("Second init Block")
    }

   constructor( title: String, author: String): this(
        title,
        author,
        "Unknow ISBN",
        0,
        false
    ){
       println("Secondary constructor")
   }


}