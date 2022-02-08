fun main(){

}

fun <T> ArrayList<T>.myPrint(){
    for (i in 0 until this.size){
        println("$i: ${this[i]}")
    }
}