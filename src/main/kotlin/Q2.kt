fun main( ){
    //employees
    val employeeList = mutableListOf<Employee>()
    employeeList.add(Manager("Ali", 52, 104.0))
    employeeList.add(Clerk("Sama", 26, 110.0))
    employeeList.add(Manager("Reza",42, 120.0))
    employeeList.add(Manager("Farhad", 34, 120.0))

    employeeList.forEach { println(it.toString())}
    val hours = listOf(140.0, 150.0, 130.0, 180.0)
    var totalSalaries = 0.0
    (0 .. 3).forEach {totalSalaries += employeeList[it].salary(hours[it])}
    println("\ntotal payment of all: $totalSalaries")

    //customers
    val costomerList = mutableListOf<Customer>()
    costomerList.add(Customer("Sara", 22, Gender.Female))
    costomerList.add(Customer("Maryam", 30, Gender.Female))
    println("\ncustomer1 == customer2: ${costomerList[0] == costomerList[1]}")

    //managers
    val managerList = employeeList.filter { employee -> employee is Manager }
    println("\nmanager with max age:")
    println(managerList.maxByOrNull { employee -> employee.age }.toString())
}

abstract class Employee(val name: String, val age: Int, val hourRate: Double){
    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name: $name \tage: $age \thourRate: $hourRate"
    }
}
class Manager(name: String, age: Int, hourRate: Double): Employee(name, age, hourRate){
    override fun salary(hours: Double): Double {
        return hourRate * hours
    }

}
class Clerk(name: String, age: Int, hourRate: Double): Employee(name, age, hourRate){
    override fun salary(hours: Double): Double {
        return hourRate * hours / 2
    }

}
data class Customer(val name: String, val age: Int, val gender: Gender){
}
enum class Gender{
    Female,
    Male
}