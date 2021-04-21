package me.hyungil.operator_overloading

fun main() {
    val r1 = testFun1(100, 200)
    println("r1 : $r1")

    val r2 = testFun2(100, 200)
    println("r2 : $r2")

    val r3 = testFun3(100, 200)
    println("r3 : $r3")

    val lambda1 : (Int, Int) -> Int = {a1:Int, a2:Int -> a1 + a2}

    val lambda2 = {a1:Int, a2:Int -> a1 + a2}

    val lambda3 : (Int, Int) -> Int = {a1, a2 -> a1 + a2}

    val r4 = lambda1(100, 200)
    println("r4 : $r4")

    val r5 = lambda2(100, 200)
    println("r5 : $r5")

    val r6 = lambda3(100, 200)
    println("r6 : $r6")

    val r7 = testFun4(100, 200)
    println("r7 : $r7")

    val lambda4 = {a1:Int, a2:Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2

        r1 * r2
    }

    val r8 = lambda4(100, 200)
    println("r8 : $r8")
}

fun testFun1(a1:Int, a2:Int) : Int {
    return a1 + a2
}

fun testFun2(a1:Int, a2:Int) : Int = a1 + a2

fun testFun3(a1:Int, a2:Int) = a1 + a2

fun testFun4(a1:Int, a2:Int) : Int {
    val r1 = a1 + a2
    val r2 = a1 - a2
    val r3 = r1 * r2
    return r3
}

