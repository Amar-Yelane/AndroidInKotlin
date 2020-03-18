
fun main()
{
    val names = arrayOf("amar","akash","sapna","jivan","gaurav","swapnil")

    for (items in names){
        println(items)
    }

    for (index in names.indices){
        println("names[$index] :"+names[index])
    }

    for (i in 1..5){
        print(" "+i)
    }

    println()
    val mystring = "programming"
    for (letters in mystring){
        print(letters+" ")
    }
    
}