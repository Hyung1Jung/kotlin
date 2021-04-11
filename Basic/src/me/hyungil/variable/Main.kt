package me.hyungil.variable

fun main() {
    // 정수 리터럴
    println(100)
    println(10000000000)
    println(10000000000L)
    println(938_492_934_823)

    // 실수 리터럴
    println(11.11)
    println(22.22F)

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)
    
    // Raw String
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세")

    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())

    println("---------------------------------------------")

    val a1:Int = 100
    //println("a1 : ${a1}")
    println("a1 : $a1")

    // 변수 선언시 자료형을 생략하면 저장하는 값에 따라 자동으로 결정된다. var보다 val이 속도가 더 빠르다.
    val a2 = 100
    println("a2 : $a2")

    println("--------------------------------------------")

    var a3:Int = 100
    val a4:Int = 100

    println("a3 : $a3")
    println("a4 : $a4")

    a3 = 200
    println("a3 : $a3")

    // val 변수는 값을 다시 저장하지 못한다.
    // a4 = 200

    println("---------------------------------------")

    var a5:Int = 100
    var a6:Int? = null
    println("a5 : $a5")
    println("a6 : $a6")

    var a7:Int? = a5
    println("a7 : $a7")

    // !!가 붙으면 null 값을 허용하는 변수를 null 값을 허용하지 않는 변수에 넣는게 가능, 하지만 실행시 오류
    var a8:Int = a6!!

}








