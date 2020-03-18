

fun main()
{
    val c = Computer("apple",80000)
    c.printComputerData()

    val d = Computer("google",65000,"gaming")
    d.printComputerData()
}
class Computer constructor(val brand:String,var price:Int) // primary con
{
    var uses:String = "Not mentiond"
    constructor(brand:String, price:Int, uses:String):this(brand,price)
    {
        this.uses = uses
    }
    fun printComputerData(){
        println("Brand : $brand\nPrince : $price\nUses : $uses")
    }
}