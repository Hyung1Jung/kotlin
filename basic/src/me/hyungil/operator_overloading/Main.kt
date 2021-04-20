package me.hyungil.operator_overloading

fun main() {
    val num1 = 100
    val num2 = 200
    val a1 = num1 + num2
    println("a1 : $a1")

    val a2 = num1.plus(num2)
    println("a2 : $a2")

    println("----------------------------------")

    val obj1 = TestClass(100, 200)
    val obj2 = TestClass(1000, 2000)

    val obj3 = obj1 + obj2
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")

    val obj4 = obj1 - obj2
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")
}

class TestClass(var a1:Int, var a2:Int){

    operator fun plus(target:TestClass) : TestClass{

        val r1 = this.a1 + target.a1
        val r2 = this.a2 + target.a2

        val result = TestClass(r1, r2)
        return result
    }

    operator fun minus(target:TestClass) : TestClass {
        val r1 = this.a1 - target.a1
        val r2 = this.a2 - target.a2

        val result = TestClass(r1, r2)
        return result
    }
}

