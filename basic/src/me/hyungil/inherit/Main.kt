package src.me.hyungil.inherit

fun main() {
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMember1()

    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMethod1()
}

// open 키워드를 붙여주지 않으면 자바 코드로 컴파일 될 때 자동으로 final이 붙어서 상속이 불가능해진다. asd
open class SuperClass1{
    var superMember1 = 100

    fun superMethod1(){
        println("SuperClass1의 메서드 입니다")
    }
}

class SubClass1 : SuperClass1(){
    val subMember1 = 200

    fun subMember1(){
        println("SubClass1의 메서드 입니다")
    }
}

open class SuperClass2(val a1:Int)

class SubClass2 : SuperClass2(100)

class SubClass3 : SuperClass2{

    constructor() : super(100)
}
