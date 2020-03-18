

fun main(){

    println("**** Car *****")
    val car = Car()
    car.showFualType()
    car.showNoTyre()
    car.shoMaxSpeed()
    car.showPowerSteer()

    println("**** truck *****")
    val truck = Truck()
    truck.showFualType()
    truck.showNoTyre()
    truck.shoMaxSpeed()
    truck.showPowerSteer()
}
abstract class Vehicle{
    abstract var fuel:String
    abstract var noTyre:Int

    abstract fun showFualType()
    abstract fun showNoTyre()

    val maxSpeed = 150

    fun shoMaxSpeed(){
        println("max speed $maxSpeed")
    }
    fun showPowerSteer() {
        println("Power steer available")
    }
}
class Car: Vehicle() {
    override var fuel = "Petrol"
    override var noTyre = 4

    override fun showFualType() {
        println("fuel : $fuel")
    }

    override fun showNoTyre() {
        println("noTyre : $noTyre")
    }
}
class Truck: Vehicle() {
    override var fuel = "Disel"
    override var noTyre = 10

    override fun showFualType() {
        println("fuel : $fuel")
    }

    override fun showNoTyre() {
        println("noTyre : $noTyre")
    }

}