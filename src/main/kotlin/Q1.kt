fun main(){
    val taxi1 = Taxi(10.0, 4, 222, Color.Yellow)
    val taxi2 = Taxi(9.5, 4, 333, Color.White)
    val bus1 = Bus(8.0, 30, 1)
    val bus2 = Bus(12.0, 35, 2)
    val ambulance1 = Ambulance(15.0, 2, 2)
    val truck1 = Truck(5.0, 2, 30)
    val van1 = Van(9.2, 11, 1)
    val van2 = Van(8.9, 11, 2)
    val sportCar1 = SportCar(17.0, 4,Color.Blue)
    val sportCar2 = SportCar(16.0, 4,Color.Red)
    val vehicleList = arrayListOf(taxi1, taxi2, bus1, bus2, ambulance1, truck1, van1, van2, sportCar1, sportCar2)

}

interface PublicTransportationVehicle{
    var maxSpeed : Double
    var maxCapacity : Int

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Int{
        return maxCapacity
    }
}
interface ServiceTransportationVehicle{
    var maxSpeed : Double
    var maxCapacity : Int

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Int{
        return maxCapacity
    }
}
interface PrivateTransportationVehicle{
    var maxSpeed : Double
    var maxCapacity : Int

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Int{
        return maxCapacity
    }
}
class Taxi(override var maxSpeed: Double, override var maxCapacity: Int, val numberPlate: Int, val color: Color ): PublicTransportationVehicle{
}
class Bus(override var maxSpeed: Double, override var maxCapacity: Int, val grade: Int): PublicTransportationVehicle{
}
class Ambulance(override var maxSpeed: Double, override var maxCapacity: Int, val numberOfPatient: Int): ServiceTransportationVehicle{
}
class Truck(override var maxSpeed: Double, override var maxCapacity: Int, val loadCapacity: Int): ServiceTransportationVehicle{
}
class Van(override var maxSpeed: Double, override var maxCapacity: Int, val grade: Int): PrivateTransportationVehicle{
}
class SportCar(override var maxSpeed: Double, override var maxCapacity: Int, val color: Color): PrivateTransportationVehicle{
}
enum class Color{
    Yellow,
    Blue,
    White,
    Red,
    Black
}