fun main()
{
    val members = Members("vaishnavi",50000)
    println("Name : ${members.name} and Salary ${members.salary}")
}
data class Members(val name:String,var salary:Int)