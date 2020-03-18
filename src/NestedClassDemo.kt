
fun main()
{
    val o = Outer()
    o.findsum()
}
class Outer{
    fun findsum(){
        val sum = Outer.Nested().a + Outer.Nested().b
        println(sum)
    }
    class Nested{
        var a = 10
        var b = 20
    }
}