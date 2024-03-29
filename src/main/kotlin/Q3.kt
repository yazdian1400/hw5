class MyClass<T> (val var1: T, val var2: T){
    fun compare(): T{
        if (var1 is Int && var2 is Int){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is Byte && var2 is Byte){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is Long && var2 is Long){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is Double && var2 is Double){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is Float && var2 is Float){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is String && var2 is String){
            if (var1.length > var2.length)  return var1
            else    return var2
        }
        else if (var1 is Char && var2 is Char){
            if (var1 > var2)  return var1
            else    return var2
        }
        else if (var1 is Boolean && var2 is Boolean){
            if (var1 == true)  return var1
            else    return var2
        }
       return var2
    }

    override fun toString(): String {
        val result = this.compare()
        if ( result == var1 && result == var2)   return "$var1 == $var2"
        else if (result == var1)    return "$var1 > $var2"
        else    return "$var1 < $var2"
    }
}

fun main(){
    val int1 = MyClass(3, 6)
    println("${int1.compare()}\t ${int1.toString()}")

    val long1 = MyClass(5000000000000, 20000000000)
    println("${long1.compare()}\t ${long1.toString()}")

    val double1 = MyClass(4.00001, 4.00001)
    println("${double1.compare()}\t ${double1.toString()}")

    val string1 = MyClass("Maedeh", "Y")
    println("${string1.compare()}\t ${string1.toString()}")

    val char1 = MyClass('m', 'y')
    println("${char1.compare()}\t ${char1.toString()}")

    val boolean1 = MyClass(true, false)
    println("${boolean1.compare()}\t ${boolean1.toString()}")


}



