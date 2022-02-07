fun main( ){

}

abstract class Employee(val name: String, val age: Int, val hourRate: Double){
    abstract fun salary()
    override fun toString(): String {
        return "name: $name age: $age hourRate: $hourRate"
    }
}
class Manager(name: String, age: Int, hourRate: Double): Employee(name, age, hourRate){
    override fun salary() {
        TODO("Not yet implemented")
    }

}
class Clerk(name: String, age: Int, hourRate: Double): Employee(name, age, hourRate){
    override fun salary() {
        TODO("Not yet implemented")
    }

}
data class Customer(val name: String, val age: Int, val gender: Gender){
}

enum class Gender{
    Female,
    Male
}