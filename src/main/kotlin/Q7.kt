fun main(){
    println("Enter a decimal number:")
    val strDecimal = readLine()
    strDecimal?.let{
        println(decimalToBinary(it))
    }

    println("Enter a binary number:")
    val strBinary = readLine()
    strBinary?.let{
        println(binaryToDecimal(it))
    }
}

fun decimalToBinary(strDec: String): String{
    var numDec : Int
    try{
        numDec = strDec.toInt()
    }catch (e: Exception){
        println("You didn't enter a number!")
        return ""
    }
    val listBin = mutableListOf<Int>()
    if (numDec == 0)    return "0"
    while(numDec != 0){
        listBin.add(numDec % 2)
        numDec /= 2
    }
    var listBinStr = listOf<String>()
    listBinStr = listBin.map { e -> e.toString() }
    val strOut = listBinStr.reversed().reduce{a,b -> a + b}
    return strOut
}

fun binaryToDecimal(strBin: String): String{
    var numDec = 0
    val strReverse = strBin.reversed()
    for (i in 0 until strReverse.length){
        if (strReverse[i] == '1')   numDec += pow2(i)
        else if (strReverse[i] == '0')  numDec += 0
        else{
            println("You didn't enter a binary number!")
            return ""
        }
    }
    return numDec.toString()
}
fun pow2 (num: Int): Int{
    var result = 1
    for (i in 0 until num)  result *= 2
    return result
}