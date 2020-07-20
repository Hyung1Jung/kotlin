package me.hyungil.operator_overloading

fun main() {
    testFunc1()
    testFunc1()

    testFunc2()
    testFunc2()
}

fun testFunc1(){
    println("------------------------")
    println("testFunc1")
    println("------------------------")
}

inline fun testFunc2(){
    println("------------------------")
    println("testFunc2")
    println("------------------------")
}