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

### Data Class
- Data Class는 매개체의 데이터를 관리하는 용도로 사용하는 클래스이다.
- abstract, open, sealed, inner 클래스로 정의할 수 없다.
- 반드시 주 생성자를 가지고 있어야 한다.

**Data Class의 메서드**
- Data Class는 개발자의 개발 편리성을 위해 몇 가지 메서드가 자동으로 구현된다.
- equals : 객체가 가지고 있는 변수를 모두 비교하는 메서드
- hashCode : 객체를 구분하기 위한 고유 정수값
- copy : 객체를 복제하는 메서드
- toString : 객체가 가지고 있는 변수의 값을 출력
- componentN : 객체 분해
```kotlin
// componentN 예제 : 주 생성자의 멤버변수를 반환한다. 1 -> 첫 번째 멤버변수, 2 -> 두 번쨰 멤버변수
val num1 = obj7.component1()
val num2 = obj7.component2()
println("num1 : $num1")
println("num2 : $num2")

// componentN은 객체 분해로 사용할 때 효율적
val (num10, num11) = obj7
println("num10 : $num10")
println("num11 : $num11")
```

**정리**
- 데이터를 담을 변수만 가지고 있는 클래스를 Data Class라고 부른다.