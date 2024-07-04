class Student(val name: String) {

    private val id = "AL0013670"



    internal fun printName() {

        println("Name: $name")

    }



    protected fun printId() {

        println("Id: $id")

    }

}