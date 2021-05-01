## Kotlin의 다양한 클래스

### Companion 객체

**정적 멤버**
- 클래스를 정의할 때 변수나 메서드를 정적 멤버로 정의하면 객체를 생성하지 않고 사용할수 있다.
- java에서는 static을 사용하는데 kotlin은 companion을 사용한다.

```kotlin
compaion object {
    val a2:Int = 200
    
    fun test2() {
        println("test2")
    }
}
```

**Cmpanion 멤버 사용하기**
- Companion 멤버는 객체 생성 없이 클래스의 이름으로 접근해서 사용한다.
```kotlin
println("TestClass.a2 : & {TestClass.a2}")
TestClass.test2()
```

**kotlin와 java 사이에서 사용하기**
- kotlin와 java 사이에서 사용하기
- kotlin에서 java의 static 멤버 사용은 다른 점이 없다.
```kotlin
println("JavaMain.java2 : &{JavaMain.java2}")
JavaMain.javaTest2()
```
- 만약 kotlin에서 정의한 Companion 멤버 중 java에서 사용할 수 있도록 하기 위해서는 @JavaStatic 으로 정의해야 한다.
```kotlin
Companion object {
    @JvmStatic val a2:Int = 200
    
    @JvmStatic fun test2() {
        println("test2")
    }
}
```

**정리**
- Companion 멤버는 객체 생성 없이 클래스의 이름을 통해 접근해 사용한다.

