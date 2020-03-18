fun main(){
    val bike = Bike()
    bike.availableColor()
    bike.availableFualType()
}
interface Motors{
    var name :String
    var fual :String
    var color:String

    fun availableFualType()
    fun availableColor(){
        println("$name available in $color")
    }
}
class Bike:Motors {
    override var name = "Honda"
    override var fual = "Petrol"
    override var color = "black"

    override fun availableFualType() {
        println("$name avilable in $fual")
    }
}