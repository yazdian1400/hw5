
interface PublicTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
interface ServiceTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
interface PrivateTransportationVehicle{
    fun maxSpeed()
    fun maxCapacity()
}
class Taxi(val numberPlate: Int, val color: Color){
    var direction = ""
}
enum class Color{
    Yellow,
    Blue,
    White,
    Red,
    Black
}