
fun main() {
    println("********** bird class **********")
    var bird = Birds("bird")
    bird.fly()
    bird.eat()
    bird.sleep()

    println("********** Fish class **********")
    var fish = Fish("fish")
    fish.swim()
    fish.eat()
    fish.sleep()
}
open class Animal constructor(var name:String) {
    fun eat() {
        println("$name can be eat")
    }
    fun sleep(){
        println("$name can be sleep")
    }
}
class Fish(name: String):Animal(name){
    fun swim(){
        println("Fish can be swim")
    }
}
class Birds(name: String):Animal(name){
    fun fly(){
        println("Birds can fly")
    }
}