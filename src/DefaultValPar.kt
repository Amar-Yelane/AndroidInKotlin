

fun main(){
    myFunction()
    myFunction(50)
    myFunction(75,'T')
    myFunction(x='N')
}

fun myFunction(num:Int=15,x:Char='X'){
    println("num = $num and x = $x")
}