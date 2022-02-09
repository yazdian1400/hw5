fun main(){

}

fun <T> List<T>.sliceList(num: Int){
    val listOut = mutableListOf<MutableList<T>>()
    for ( i in 0 until this.size){
        if (i % (num+1) == 0){
            listOut.add(mutableListOf(this[i]))
        }
        else    listOut.last().add(this[i])
    }
    println(listOut)
}