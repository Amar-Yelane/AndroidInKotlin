
fun main(){
    val a : Int = 12
    val b : Int = 24

    print("Enter an arithmatic operator ::")
    val operator = readLine()
    when(operator){
        "+" ->
        {
            val result = a+b
            println("$a + $b ="+result)
        }
        "-" ->
        {
            val result = a-b
            println("$a - $b ="+result)
        }
        "*" ->
        {
            val result = a*b
            println("$a * $b ="+result)
        }
        "/" ->
        {
            val result = a/b
            println("$a / $b ="+result)
        }
        else -> println("$operator is invalid operator")
    }
}