fun String.addAsterisk(): String {

    return "$this*"

}

fun main(){
    print("Hello".addAsterisk())
}

/*Other example
fun main(){
    print("Hello".addAsterisk().addAsterisk().addAsterisk())
}
 */