
interface PublicTransportationVehicle{
    var maxSpeed : Double
    var maxCapacity : Double

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Double{
        return maxCapacity
    }
}
interface ServiceTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
interface PrivateTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
class Taxi(override var maxSpeed: Double, override var maxCapacity: Double, val numberPlate: Int, val color: Color ): PublicTransportationVehicle{
}
class Bus(override var maxSpeed: Double, override var maxCapacity: Double, val grade: Int): PublicTransportationVehicle{
}
enum class Color{
    Yellow,
    Blue,
    White,
    Red,
    Black
}