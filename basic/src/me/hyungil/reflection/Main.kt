package me.hyungil.reflection

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

fun main() {
    // 클래스 타입
    val a1: KClass<String> = String::class
    val a2:Class<String> = String::class.java

    println("String 코틀린에서의 타입 : $a1")
    println("String 자바에서의 타입 : $a2")

    val str1:String = "안녕하세요"
    val a3:KClass<out String> = str1::class
    val a4:Class<out String> = str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a3")
    println("안녕하세요 자바에서의 타입 : $a4")

    val a5:KClass<*> = str1::class
    val a6:Class<*> = str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a5")
    println("안녕하세요 자바에서의 타입 : $a6")

    val test1:TestClass = TestClass()
    val a7:KClass<*> = test1::class
    val a8:Class<*> = test1::class.java
    println("test1 코틀린에서의 타입 : $a7")
    println("test1 자바에서의 타입 : $a8")

    // 클래스 정보 분석
    println("추상 클래스 인가 : ${test1::class.isAbstract}")
    println("Companion 클래스 인가 : ${test1::class.isCompanion}")
    println("Data 클래스 인가 : ${test1::class.isData}")
    println("final 클래스 인가 : ${test1::class.isFinal}")
    println("open 클래스 인가 : ${test1::class.isOpen}")
    println("중첩 클래스 인가 : ${test1::class.isInner}")
    println("Sealed 클래스 인가 : ${test1::class.isSealed}")

    // 생성자 정보
    val constructors = test1::class.constructors

    // println(constructors)
    for(con in constructors){
        println("constructor : $con")

        for (param in con.parameters){
            println("parameter index : ${param.index}")
            println("parameter type : ${param.type}")
            println("parameter name : ${param.name}")
        }
    }

    println("-------------------------------")

    // 주 생성자
    val primaryCon = test1::class.primaryConstructor
    if(primaryCon != null){
        println(primaryCon)

        for(param in primaryCon.parameters){
            println("parameter index : ${param.index}")
            println("parameter type : ${param.type}")
            println("parameter name : ${param.name}")
        }
    }

    // 프로퍼티
    val properties = test1::class.declaredMemberProperties
    for (prop in properties){
        println(prop.name)
    }

    // 메서드 정보
    val methods = test1::class.declaredMemberFunctions
    for (met in methods){
        println(met.name)
    }
}

class TestClass(){

    val number1:Int = 100
    var number2:Int = 200

    constructor(a1:Int) : this(){

    }

    constructor(a1:Int, a2:Int) : this(){

    }

    fun testMethod1(){

    }
}











