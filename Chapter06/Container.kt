class Container<T>(var content: T)


fun main(){
    val myAContainer = Container("jose")
    val myBContainer = Container(9999)

    println(myAContainer.content)
    println(myBContainer.content)

}