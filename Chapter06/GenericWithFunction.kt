fun <T> printItem(item: T) {
    println(item)
}
/*Restrictions on type parameters
fun <T:Number> printItem(item: T) {
    println(item)
}*/

/*Reified types
inline fun <reified T> printItem(item: T) where T: Number, T:Comparable<T>{
    when(T::class){
        Int::class -> println("Integer")
        Float::class -> println("Float")
	else -> println("Unknow")
    }
}
 */
fun main(){
    printItem("Viena")
    printItem(50)
    printItem(true)

}