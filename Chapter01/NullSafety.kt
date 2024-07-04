fun main(args: Array<String>) {
   /* Incorrect:
    var name: String = "Viena"
    name = null // Null can not be a value of a non-null type String
    */

    // Correct:
    var name: String? = "Viena"
    name = null

}