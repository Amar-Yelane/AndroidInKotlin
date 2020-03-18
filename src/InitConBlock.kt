
fun main(){
    Employee("amar","yelane")
}
class Employee(val fname:String,val lname:String){
    val firstname : String
    val lastname : String

    init {
        firstname= fname
        lastname=lname

        val name = (firstname +" "+lastname).toUpperCase()
        println(name)
    }
}