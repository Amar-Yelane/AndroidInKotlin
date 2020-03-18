
fun main() {
    val p1 = Product("Mobile",10000)
    val p2 = Product("Laptop",3000)

    println("Product 1 Name : ${p1.component1()} Price : ${p1.component2()}")
    println("Product 2 Name : ${p2.component1()} Price : ${p2.component2()}")
}
data class Product(val name:String,var price:Int)