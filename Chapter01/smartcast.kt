fun main(args: Array<String>) {
    fun testSmartCast(x:Any){
        if(x is String){
            println(x.length)
        }

        if(x is Int){
            println(x.inc())
        }

    }

    testSmartCast("Jose")
    testSmartCast(9)

}