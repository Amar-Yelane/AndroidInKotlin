
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

    val a1 : Int = 12
    val b1 : Int = 24
    val result1 = when(operator){
        "+" ->"$a1 + $b1 = "+(a1 + b1)
        "-" ->"$a1 - $b1 = "+(a1 - b1)
        "*" ->"$a1 * $b1 = "+(a1 * b1)
        "/" ->"$a1 / $b1 = "+(a1 / b1)
        else -> "$operator is invalid"
    }
    println(result1)
}