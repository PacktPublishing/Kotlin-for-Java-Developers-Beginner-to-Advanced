class Book {
    var title:String = "Everything about Kotlin"
    var autor:String = "Jose Lujan"
    var isbn = "192838493"
    var pages = 250
    var isRead = false

}
//The generated constructor would be equivalent to the following:
/*
class Book constructor () {
    var title:String = "Everything about Kotlin"
    var autor:String = "Jose Lujan"
    var isbn = "192838493"
    var pages = 250
    var isRead = false

}
 */


//Now, let's create a primary constructor. This is the code:
/*
//class Book(var title: String, var author: String, var isbn : String, var pages: Int, var isRead: Boolean){
}
*/



fun main(){
    val myBook:Book = Book()
    println(myBook.title)

}

//Testing primary constructor
/*
fun main() {
    val myBook:
            Book = Book(
        "The best Kotlin Book", "Jose Lujan",
        "192839ND39431", 250, false
    )
    println(myBook.title)
}
 */