
fun main(){
    val a:Int = 10000
    val b:Long = 100000
    val c:Double = 100.100
    val d:Short = 10
    val e:Byte = 1
    val f:Float = 10.10f

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)

    val v:Char
    v='A'
    println(v)

    val isJobDone:Boolean
    isJobDone = true
    if (!isJobDone)
        println("is job done successfully")
    else
        println("is job not done successfully")

    var str1:String
    str1="amar"
    println(str1)

    val escapeString:String
    escapeString = "Amar yelane \n From wardha"
    println(escapeString)

    val rawString ="""
        Welcome 
        To haven
        its my world
    """
    println(rawString)
}