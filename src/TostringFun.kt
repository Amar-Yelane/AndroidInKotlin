
fun main() {
    val women1 = Women("Sapna",30)
    val women2 = Women("viju",40)
    println(women1.toString()) // toString fun
    println(women1.equals(women2))
}
data class Women(val name:String,var age:Int)