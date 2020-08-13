package me.hyungil.type_casting

fun main() {
    val obj1:SubClass1 = SubClass1()
    val obj2:SubClass2 = SubClass2()

    // 부모 클래스 타입 참조변수에 담는다.
    // 스마트 캐스팅 발생
    val super1:SuperClass1 = obj1
    // 스마트 캐스팅 발생
    val inter1:Inter1 = obj2

    println("------------------------------------")
    // as : 지정된 클래스 타입으로 강제 변환하는 연산자
    super1 as SubClass1
    inter1 as SubClass2

    super1.subMethod1()
    inter1.subMethod2()

    println("--------------------------------------")

    val obj3:SubClass1 = SubClass1()

    val chk1 = obj3 is SuperClass1
    println("chk1 : $chk1")

    //val chk2 = obj3 is Inter1

    val super3:SuperClass1 = obj3
    val chk3 = super3 is SubClass1
    println("chk3 : $chk3")

    if(super3 is SubClass1){
        //super3 as SubClass1
        // is 연산자 값이 true라면 형변환이 가능한 상황이므로 스마트 캐스팅 발생
        super3.subMethod1()
    }
    // super3.subMethod1()

    println("-------------------------------")

    val obj10:SubClass1 = SubClass1()
    val obj11:SubClass2 = SubClass2()

    anyMethod(obj10)
    anyMethod(obj11)
    anyMethod(100)
    anyMethod("문자열")

    println("------------------------------------")

    val number1:Int = 100
    val number2:Long = number1.toLong()
    println("number2 : $number2")

    val str1:String = "100"
    val number3:Int = str1.toInt()
    println("number3 : $number3")

//    val str2:String = "안녕하세요"
//    val number4:Int = str2.toInt()
//    println("number4 : $number4")
}

open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1(){
    fun subMethod1(){
        println("SubClass1의 subMethod1입니다")
    }
}
class SubClass2 : Inter1{
    fun subMethod2(){
        println("SubClass2의 subMethod2입니다")
    }
}

fun anyMethod(obj:Any){
    if(obj is SubClass1){
        obj.subMethod1()
    } else if(obj is SubClass2){
        obj.subMethod2()
    } else if(obj is Int){
        println("정수입니다")
    } else if(obj is String){
        println("문자열 입니다")
    }
}










