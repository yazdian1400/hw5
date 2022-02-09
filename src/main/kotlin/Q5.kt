fun main(){
    val listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    listInt.sliceWith(2)

    val listChar = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g')
    listChar.sliceWith(3)

    val listEmpty = listOf<String>()
    listEmpty.sliceWith(4)
}

fun <T> List<T>.sliceWith(num: Int){
    val listOut = mutableListOf<MutableList<T>>()
    for ( i in 0 until this.size){
        if (i % (num+1) == 0){
            listOut.add(mutableListOf(this[i]))
        }
        else    listOut.last().add(this[i])
    }
    println(listOut)
}