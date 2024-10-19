class Book {
    var title:String = "Everything about Kotlin"
    var autor:String = "Jose Lujan"
    var isbn: String = "192838493"
}


fun main(){
    var myBook:Book = Book();
    println(myBook.autor)
    //Apply
    /*
    myBook.apply {
        title = "The Best Java book"
        autor = "Dimas Lujan"
        isbn = "10000000"
    }
     */
}