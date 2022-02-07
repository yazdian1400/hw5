fun main( ){

}

abstract class Employee(val name: String, val age: Int, val hourRate: Double){
    abstract fun salary()
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
}