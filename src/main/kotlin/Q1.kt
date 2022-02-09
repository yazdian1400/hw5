
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
    var maxSpeed : Double
    var maxCapacity : Double

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Double{
        return maxCapacity
    }
}
interface PrivateTransportationVehicle{
    var maxSpeed : Double
    var maxCapacity : Double

    fun maxSpeed(): Double{
        return maxSpeed
    }
    fun maxCapacity(): Double{
        return maxCapacity
    }
}
class Taxi(override var maxSpeed: Double, override var maxCapacity: Double, val numberPlate: Int, val color: Color ): PublicTransportationVehicle{
}
class Bus(override var maxSpeed: Double, override var maxCapacity: Double, val grade: Int): PublicTransportationVehicle{
}
class Ambulance(override var maxSpeed: Double, override var maxCapacity: Double, val numberOfPatient: Int): ServiceTransportationVehicle{
}
class Truck(override var maxSpeed: Double, override var maxCapacity: Double, val loadCapacity: Int): ServiceTransportationVehicle{
}
class Van(override var maxSpeed: Double, override var maxCapacity: Double, val grade: Int): PrivateTransportationVehicle{
}
class SportCar(override var maxSpeed: Double, override var maxCapacity: Double, val color: Color): PrivateTransportationVehicle{
}
enum class Color{
    Yellow,
    Blue,
    White,
    Red,
    Black
}