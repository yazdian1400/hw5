fun main(){
    val arrayListInt = arrayListOf(55, 60, 65, 70)
    arrayListInt.myPrint()

    val arrayListString = arrayListOf("Hello", "world", "!")
    arrayListString.myPrint()
}

fun <T> ArrayList<T>.myPrint(){
    println()
    for (i in 0 until this.size){
        println("$i: ${this[i]}")
    }
}