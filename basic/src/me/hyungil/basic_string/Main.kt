package me.hyungil.basic.string

fun main() {
    val str1 = "안녕하세요"

    println("str1[0] : ${str1[0]}")
    println("str1[1] : ${str1[1]}")

    // str1[0] = 'A'

    println("-------------------------------")

    val str2 = str1.substring(1..3)
    println("str2 : $str2")

    println("--------------------------------")

    val str3 = "Hello World"
    val str4 = "hello world"

    println(str3.compareTo(str4))
    println(str3.compareTo(str4, true))
    println(str3.contentEquals(str4))

    println("----------------------------------")

    val str5 = "ab cd ef gh"
    val r1 = str5.split(" ")
    println("r1 : $r1")

    println("----------------------------------")

    val str6 = "abc"
    val str7 = str6 + "def"
    println("str6 : $str6")
    println("str7 : $str7")

    val buffer1 = StringBuffer()
    buffer1.append("abc")
    buffer1.append(100)
    buffer1.append(11.11)
    println("buffer1 : $buffer1")

    buffer1.insert(3, "테스트")
    println("buffer1 : $buffer1")

    buffer1.delete(3, 6)
    println("buffer1 : $buffer1")
}








