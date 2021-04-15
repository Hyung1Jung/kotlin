fun main() {
    // val obj1 = Super1()
    // testFun1(obj1)

    val obj2 = Sub1()
    testFun1(obj2)

    val obj3 = Sub2()
    testFun1(obj3)
}

open abstract class Super1{

    fun method1(){
        println("Super1의 method1 입니다")
    }

    open abstract fun method2()
}

class Sub1 : Super1(){
    override fun method2() {
        println("Sub1의 method2 입니다")
    }
}

class Sub2 : Super1(){
    override fun method2() {
        println("Sub2의 method2 입니다")
    }
}

fun testFun1(obj1:Super1){
    obj1.method1()
    obj1.method2()
}