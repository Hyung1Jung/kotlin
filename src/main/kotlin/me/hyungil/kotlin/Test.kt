package me.hyungil.kotlin

import java.util.Collections.max

class Person(val name: String) // 코틀린 클래스 기본 가시성: public

fun main(args: Array<String>) {
    fun eval(e: Expr): Int {
        when (e) {
            is Num ‐> e.value // 컴파일러가 캐스트 처리
            is Sum ‐> eval(e.left) + eval(e.right)
            else ‐>
                throw IllegalArgumentException("Unknown exp")
        }

}
