
fun main(){
    ChildClass().myfun()
}
open class ParentClass{
    open fun myfun(){
        println("i am from parent class")
    }
}
class ChildClass:ParentClass(){
    override fun myfun(){
        super.myfun()
        println("i am from child class")
    }
}