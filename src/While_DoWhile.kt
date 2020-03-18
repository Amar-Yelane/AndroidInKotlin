

fun main(){

    // working with while loop
    var count = 0
    while (count <=10)
    {
        //count++
        println("count is :"+count)
        count++
    }
    //println("count is :"+count)

    // Working with do while loop
    var num1:String
    var num2:String
    var isContinue:String
    do {
        println("Enter the first number : ")
        num1 = readLine()!!
        println("Enter the second number : ")
        num2 = readLine()!!

        val result = num1.toInt() + num2.toInt()
        println("$num1 + $num2 :: "+result)

        println("Do you want to continue..? press y/n ")
        isContinue = readLine()!!
    }while (isContinue == "y"|| isContinue =="Y")
}