package me.hyungil.operator_overloading

fun main() {

    val str1 = "abcd"
    println(str1.getUpperString())
}

fun String.getUpperString() : String {
    return this.toUpperCase()
}