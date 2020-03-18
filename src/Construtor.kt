
fun main(){
    val s = Student("amar",61)
    println("name : ${s.name} \nRoll number : ${s.roll_num}")
}
class Student(val name:String,val roll_num:Int){}