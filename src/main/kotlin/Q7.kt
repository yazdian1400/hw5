fun main(){
    println("Enter a decimal number:")
    val strDecimal = readLine()
    strDecimal?.let{
        println(decimalToBinary(it))
    }

    println("Enter a binary number:")
    val strBinary = readLine()
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