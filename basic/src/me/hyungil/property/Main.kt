package me.hyungil.property

val obj1 = TestClass1(100, 200)
println("obj1.a1 : ${obj1.a1}")
println("obj1.a2 : ${obj1.a2}")

obj1.a1 = 1000
println("obj1.a1 : ${obj1.a1}")

println("----------------------------------")

val obj2 = TestClass2()

obj2.v1 = 100
// obj2.v2 = 200
println("obj2.v1 : ${obj2.v1}")
println("obj2.v2 : ${obj2.v2}")

obj2.v3 = 5000
println("ob2.v3 : ${obj2.v3}")
}

class TestClass1 (var a1:Int, val a2:Int)

class TestClass2 {
    var v1:Int = 0
    val v2:Int = 0
    var v3:Int = 100
        // get() = field
        get() {
            println("get 호출")
            return field
        }
        set(value) {
            println("set 호출")
            field = value
        }
}





