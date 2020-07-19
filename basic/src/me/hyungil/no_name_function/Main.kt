package me.hyungil.operator_overloading

fun main() {
    testFunction1()

    // val testFunction2 = testFunction1
    
    val testFunction2 = fun(){
        println("testFunction2 입니다")
    }

    testFunction2()
    
}

fun testFunction1() {
    println("testFunction1 입니다")
}
