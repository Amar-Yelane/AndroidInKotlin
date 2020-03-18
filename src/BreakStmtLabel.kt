
fun main()
{
    test@for (i in 1..10)
    {
        for (j in 1..10)
        {
            if (j==5)
            {
                break@test
            }
            println("i = $i & j = $j")
        }
    }
}