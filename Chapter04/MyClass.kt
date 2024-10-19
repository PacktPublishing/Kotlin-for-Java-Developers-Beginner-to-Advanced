class MyClass {
    //Companion
    /*companion object {
        const val STATIC_VALUE = "this is a static value"

        fun printMsg(){
            println("Companion MSG")
        }
    }
    */

    //Init block
    /*
        init {
            println("init block")
        }
     */
    fun printString(){
        println("Just a new String")
    }


}

fun main(){

    val newString = MyClass()
    newString.printString()

    //PrintInt
    /*
    fun MyClass.printInt() = println(10)
    newString.printInt()
    */

}