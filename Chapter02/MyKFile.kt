class MyKFile {
    private var name: String? = null
    fun setName(name:String){
        this.name = name
    }

    fun getname(): String? {
        return name
    }

    fun hiKotlin(){
        println("Hello World Kotlin! ${this.name}")
    }
}