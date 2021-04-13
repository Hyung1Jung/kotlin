package me.hyungil.access

fun main() {

    // private class는 외부에서 사용이 불가능하다.
    val obj1 = PrivateClass1()
    val obj2 = PublicClass1()
    val obj3 = InternalClass1()

    // private class는 외부에서 사용할수 없다.
    val obj4 = PrivateClass2()
    val obj5 = PublicClass2()
    val obj6 = InternalClass2()

    // private class는 외부에서 사용할 수 없다
    val obj7 = PrivateClass3()
    val obj8 = PublicClass3()
    // internal class는 다른 모듈에서는 사용할 수 없다.
    val obj9 = InternalClass3()

    val t1 = TestClass1()
    // private 맴버는 사용할 수 없다
    println("t1.private1 : ${t1.private1}")
    println("t1.public1 : ${t1.public1}")
    // protected 맴버는 상속관계가 아니므로 사용할 수 없다.
    println("t1.protected1 : ${t1.protected1}")
    println("t1.internal1 : ${t1.internal1}")

    val t2 = TestClass2()
    // private 맴버는 사용 불가
    println("t2.private2 : ${t2.private2}")
    println("t2.public2 : ${t2.public2}")
    // protected 맴버는 상속관계가 아니므로 사용 불가
    println("t2.protected2 : ${t2.protected2}")
    println("t2.internal2 : ${t2.internal2}")

    val t3 = TestClass3()
    // private 맴버는 사용 불가
    println("t3.private3 : ${t3.private3}")
    println("t3.public3 : ${t3.public3}")
    // protected 맴버는 상속관계가 아니기 때문에 사용이 불가하다.
    println("t3.protected3 : ${t3.protected3}")
    // internal 맴버는 같은 모듈이 아니기 때문에 사용이 불가하다.
    println("t3.internal3 : ${t3.internal3}")
}

class SubClass1 : TestClass1(){

    fun subMethod1(){
        // private 맴버 사용 불가
        println("private1 : $private1")
        println("public1 : $public1")
        println("protected1 : $protected1")
        println("internal1 : $internal1")
    }
}

class SubClass2 : TestClass2(){

    fun subMethod2(){
        // private 맴버 사용 불가
        println("private2 : $private2")
        println("public2 : $public2")
        println("protected2 : $protected2")
        println("internal2 : $internal2")
    }
}

class SubClass3 : TestClass3(){
    fun subMethod3(){
        // private 맴버는 사용 불가
        println("private3 : $private3")
        println("public3 : $public3")
        println("protected3 : $protected3")
        // 같은 모듈이 아니기 때문에 사용이 불가
        println("internal3 : $internal3")
    }
}