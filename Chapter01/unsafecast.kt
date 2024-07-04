fun main(args: Array<String>) {
    // execute this code, it will show us an exception that complies with what was mentioned above
    /*
    var name: Any = 100
    val lastname: String = name as String
    */

    //If we execute the code, we’ll see the code is working, the code will compule, but at runtime the as?
    // operator will fall because 100 cannot be converted to String.
    // If we print lastname in this case, we will see that the result of printing it will be null.
    var name: Any = 100
    val lastname: String? = name as? String




}