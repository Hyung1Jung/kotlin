package me.hyungil.basic_when

fun main() {
    val a1 = 10

    when(a1){
        1 -> println("a1은 1입니다")
        2 -> {
            println("수행되는 코드")
            println("a1은 2입니다")
        }
        3 -> println("a1은 3입니다")
        else -> println("a1은 1, 2, 3이 아닙니다")
    }

    val a2 = 3

    when(a2){
        1, 2 -> println("a2는 1이거나 2입니다")
        3, 4 -> println("a2는 3이거나 4입니다")
        5, 6 -> println("a2는 5이거나 6입니다")
        else -> println("a2는 1, 2, 3, 4, 5, 6이 아닙니다")
    }

    val a3 = 55.55
    when(a3){
        33.33 -> println("a3은 33.33입니다")
        55.55 -> println("a3은 55.55입니다")
        77.77 -> println("a3은 77.77입니다")
        else -> println("a3은 33.33, 55.55, 77.77이 아닙니다")
    }

    val a4 = "문자열2"
    when(a4){
        "문자열1" -> println("첫 번째 문자열 입니다")
        "문자열2" -> println("두 번째 문자열 입니다")
        "문자열3" -> println("세 번째 문자열 입니다")
        else -> println("else 문자열 입니다")
    }

    val a5 = 5
    when(a5){
        in 1..3 -> println("a5는 1 ~ 3사이의 숫자입니다")
        in 4..6 -> println("a5는 4 ~ 6사이의 숫자입니다")
        in 1..6 -> println("a5는 1 ~ 6사이의 숫자입니다")
        else -> println("a5는 1 ~ 6사이의 숫자가 아닙니다")
    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println("str1 : $str1")
    println("str2 : $str2")
    println("str3 : $str3")
}

fun setValue(a1 : Int) = when(a1){
    1 -> "문자열1"
    2 -> {
        println("두 번째 경우의 수")
        "문자열2"
    }
    else -> "그 외의 문자열"
}









