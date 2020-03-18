
fun main(){
    var mens = Mens("Amar",24)
    var mens1 = mens.copy("Akash",27)
    var mens2 = mens.copy("jivan",26)
    var mens3 = mens.copy("gaurav",25)

    println("Men1 \nName : ${mens.name}\nAge : ${mens.age}")

    println("Men2 \nName : ${mens1.name}\nAge : ${mens1.age}")

    println("Men3 \nName : ${mens2.name}\nAge : ${mens2.age}")

    println("Men4 \nName : ${mens3.name}\nAge : ${mens3.age}")
}
data class Mens(val name:String,var age:Int)