package me.hyungil.class

fun main() {

    val obj1:TestClass1 = TestClass1()
    println("obj1 : $obj1")

    val obj2 = TestClass1()
    println("obj2 : $obj2")

    val obj3 = obj1
    println("obj3 : $obj3")

    val obj4 = TestClass2()
    println("obj4 : $obj4")

    val obj5 = TestClass3()
    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    // obj5.a1 = 100
    obj5.a2 = 200
    println("obj5.a2 : ${obj5.a2}")

    obj5.testMethod1()
    obj5.testMethod2()
}

class TestClass1{

}

class TestClass2

class TestClass3{
    // 멤버 변수
    val a1 = 0
    var a2 = 0

    // 멤버 메서드
    fun testMethod1(){
        println("testMethod1")
    }

    fun testMethod2(){
        println("testMethod2")
    }
}

