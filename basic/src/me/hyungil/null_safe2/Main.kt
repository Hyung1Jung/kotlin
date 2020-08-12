package me.hyungil.null_safe2

fun main() {

    testMethod1("안녕하세요")
    testMethod1(null)

    println("---------------------")

    testMethod2("안녕하세요")
    testMethod2(null)
}

fun testMethod1(str:String?){
    println(str?.length)

    if(str is String){
        // 스마트 캐스팅 발생
        println(str.length)
    }

    if(str != null){
        // 스마트 캐스팅 발생생
       println(str.length)
    }

    // println(str.length)
}

fun testMethod2(str:Any?){

    if(str is String){
        println(str.length)
    }

//    if(str != null){
//        println(str.length)
//    }
}
