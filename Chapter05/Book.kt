class Book {
    var title:String = "Everything about Kotlin"
    var autor:String = "Jose Lujan"
    var readDate:String? = null
    var isbn = "192838493"
    var pages = 250
    var isRead = false

    fun printTitle(){
        println("Book title: $title")
    }
    fun markAsRead(readDate: String) {
        this.isRead = true
        this.readDate = readDate
    }
    fun getNumberOfPages(): Int {
        return pages
    }

    //Unit and modifiers
    /*
    fun printTitle():Unit{
        println("Book title: $title")
    }

    fun markAsRead(readDate:String) {
        this.isRead = true
        this.readDate = readDate
    }
     fun getNumberOfPages(): Int {
        return pages
    }
     */

    //properties with Modifiers
    /*
    private var pages = 250
    private var isRead = false
     */



}