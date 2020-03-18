

fun main(){
    println("Mobile 1")
    Mobile("apple",150000)

    println("Mobile 2")
    Mobile("pixel",65000)

    println("Mobile 3")
    Mobile()

    println("Mobile 4")
    Mobile("OnePlus",47000)
}
class Mobile(brandName:String = "UnKnown",price:Int = 0){
    init {
        println("Name : $brandName \nPrice : $price")
    }
}