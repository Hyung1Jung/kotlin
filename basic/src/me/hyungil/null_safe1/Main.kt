package me.hyungil.null_safe1

fun main() {

    testFun1("문자열")
    // testFun1(null)

    println("------------------------")

    testFun2("문자열")
    testFun2(null)

    println("----------------------------------")

    testFun3("문자열")
    testFun3(null)
}

fun testFun1(str:String?){
    val value1:String = str!!
    println("value1 : $value1")
}

fun testFun2(str:String?){

    val value1:String = str ?: "기본문자열"
    println("value1 : $value1")
}

fun testFun3(str:String?){
    println("str : $str")

    println("str length : ${str?.length}")
}










