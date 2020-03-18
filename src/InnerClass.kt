
fun main(args:Array<String>){
    var i = Test().Inner()
    i.findSum()
}
class Test
{
    var a= 110
    var b= 120
    inner class Inner
    {
        fun findSum()
        {
            var res = a+b
            println("Sum : "+res)
        }
    }
}