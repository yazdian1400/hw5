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
}



