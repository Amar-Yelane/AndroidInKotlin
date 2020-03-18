
fun main(){
    Derivedclass("Hello")
}
open class Baseclass(msg:String){ // it can contain primary con
    init {
        println("from the base class $msg")
    }
}
class Derivedclass:Baseclass{
    constructor(msg: String):super(msg){
    println("from the derived class $msg")
}
}