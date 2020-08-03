package me.hyungil.sealed_class

fun main() {
    val v1 = Number.TWO
    checkNumber(v1)

    val v2 = Number2.SealedTwo(1)
    val v3 = Number2.SealedTwo(2)
    val v4 = Number2.SealedOne(100, 200)
    val v5 = Number2.SealedTHREE(100, 11.11)

    checkNumber2(v2)
    checkNumber2(v3)
    checkNumber2(v4)
    checkNumber2(v5)
}

enum class Number(val num:Int){
    ONE(1), TWO(2), THREE(3)
}

fun checkNumber(a1:Number){
    when(a1){
        Number.ONE -> println("1입니다")
        Number.TWO -> println("2입니다")
        Number.THREE -> println("3입니다")
    }

    when(a1.num){
        1 -> println("1입니다")
        2 -> println("2입니다")
        3 -> println("3입니다")
    }
}

sealed class Number2{
    class SealedOne(val a1:Int, val a2:Int) : Number2()
    class SealedTwo(val a1:Int) : Number2(){
        fun sealedFun2(){
            println("SealedTwo의 sealedFun2 입니다")
        }
    }
    class SealedTHREE(val a1:Int, val a2:Double) : Number2()
}

fun checkNumber2(obj1:Number2){
    when(obj1){
        is Number2.SealedOne -> {
            println("One 입니다")
            println(obj1.a1)
            println(obj1.a2)
        }
        is Number2.SealedTwo -> {
            println("Two 입니다")
            println(obj1.a1)
            when(obj1.a1){
                1 -> println("1 입니다")
                2 -> println("2 입니다")
            }
            obj1.sealedFun2()
        }
        is Number2.SealedTHREE -> {
            println("Three 입니다")
            println(obj1.a1)
            println(obj1.a2)
        }
    }
}














