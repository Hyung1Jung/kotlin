package me.hyungil.basic_generic

fun main() {
    val t1 = TestClass1<Int>()
    t1.testMethod1(100)

    val t2 = TestClass1<String>()
    t2.testMethod1("문자열")

    println("-------------------------------")

    val t3 = TestClass2<Int>(100)
    t3.testMethod2(200)

    val t4 = TestClass2<String>("문자열1")
    t4.testMethod2("문자열2")

    println("-------------------------------")

    val t5 = TestClass3<Int, String>()
    t5.testMethod3(100, "문자열")

    val t6 = TestClass4<Int, Double, String, Boolean>(100, 11.11)
    t6.testMethod4("문자열", true)

    println("--------------------------------------")
    // 불변성 : 같은 타입의 제네릭이 설정된 변수에만 담기 가능.
    val t7:TestClass5<SubClass1> = TestClass5<SubClass1>()
    val t8:TestClass5<SubClass2> = TestClass5<SubClass1>()
    val t9:TestClass5<SuperClass1> = TestClass5<SubClass1>()

    // 공변성 : 부모 = 자식
    val t10:TestClass6<SubClass1> = TestClass6<SubClass1>()
    val t11:TestClass6<SubClass2> = TestClass6<SubClass1>()
    val t12:TestClass6<SuperClass1> = TestClass6<SubClass1>()

    // 반공변성 : 자식 = 부모
    val t13:TestClass7<SubClass1> = TestClass7<SubClass1>()
    val t14:TestClass7<SubClass2> = TestClass7<SubClass1>()
    val t15:TestClass7<SuperClass1> = TestClass7<SubClass1>()

}

class TestClass1<T>{

    fun testMethod1(a1:T){
        println("a1 : $a1")
    }
}

class TestClass2<T>(var a1 : T){

    fun testMethod2(a2 : T){
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass3<A, B>{

    fun testMethod3(a1:A, a2:B){
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass4<A, B, C, D>(var a1:A, var a2:B){

    fun testMethod4(a3:C, a4:D){
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}

open class SuperClass1

open class SubClass1 : SuperClass1()

class SubClass2 : SubClass1()

// 불변성
class TestClass5<A>()

// 공변성
class TestClass6<out A>()

// 반 공변성
class TestClass7<in A>()











