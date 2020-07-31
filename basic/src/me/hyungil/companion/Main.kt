package me.hyungil.companion

fun main() {

    val obj1 = TestClass()
    println("obj1.a1 : ${obj1.a1}")
    obj1.testFun1()

    val obj2 = TestClass()
    println("obj2.a1 : ${obj2.a1}")
    obj2.testFun1()

    obj1.a1 = 200
    println("obj1.a1 : ${obj1.a1}")
    println("obj2.a1 : ${obj2.a1}")

    println("TestClass.a2 : ${TestClass.a2}")
    TestClass.testFun2()

    val obj3 = JavaMain()
    println("obj3.javaA1 : ${obj3.javaA1}")
    obj3.javaMethod1()

    println("JavaMain.javaA2 : ${JavaMain.javaA2}")
    JavaMain.javaMethod2()

}

class TestClass{
    var a1 = 100

    companion object{
        var a2 = 1000
        @JvmStatic var a3 = 2000

        fun testFun2(){
            println("testFun2")
            // println ("a1 : $a1")
            println("a2 : $a2")
        }

        @JvmStatic fun testFun3(){
            println("testFun3")
        }
    }

    fun testFun1(){
        println("testFun1")
        println("a1 : $a1")
        println("a2 : $a2")
        testFun2()
    }
}









