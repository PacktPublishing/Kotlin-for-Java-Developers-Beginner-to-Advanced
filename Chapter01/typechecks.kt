fun main(args: Array<String>) {
    val name = "Noemi"
    //we will see the word "String" as a result because the name is a string and then the condition is true.
    if(name is String){
        print("String")
    }
    //if we use !is, the condition is not met and, therefore, we will not execute the code found within the if condition.
    if(name !is String){
        print("String")
    }

}