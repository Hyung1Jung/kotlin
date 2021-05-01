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

### Generic
- 클래스를 설계할 때 변수의 타입을 유동적으로 하고 싶을 때가 있을 수도 있다.
- 이 때 Generic 개념을 활용하면 클래스 작성시가 아닌 객체 생성시에 변수의 타입을 설정할 수 있다.

**가변성**
- 불변성 : 제네릭이 설정된 주소의 값을 같은 타입의 제네릭이 설정된 변수에만 담을 수 있다.
- 공변성 : 제네릭이 설정된 객체의 주소 값을 부모 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(out)
- 반 공변성 : 제네릭이 설정된 객체의 주소 값을 자식 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(in)
    - 자식 클래스에 담게 되면 자식 클래스에 없는 것을 사용했을 때 에러가 발생 확률이 많기 때문에 지양.

**정리**
- 객체를 생성할 때 타입을 결정하는 것을 Generic라고 부른다.

### 중첩 클래스
- 클래스 안에 만드는 클래스를 중첩 클래스라고 부른다.
- 중첩 클래스에서는 각 클래스에 정의한 멤버를 사용할 수 있는가를 숙지해야 한다.
```kotlin
class Outer1 {
    inner class Inner1 {
        
    }
}
```

**중첩 클래스**
- 내부 클래스는 외부 클래스로부터 생성된 객체를 통해서만 객체 생성이 가능하다.
- 외부 클래스는 내부 클래스의 멤버를 자유롭게 사용할 수 없지만, 내부 클래스는 외부 클래스의 멤버를 자유롭게 사용할 수 있다.
```kotlin
var a1 = Outer1()
var a2 = a1.Inner()
```

**익명 중첩 클래스**
- 이름이 없는 클래스를 중첩 클래스라고 부른다.
- 인터페이스나 추상클래스를 사용할 때 이용한다.
- 인터페이스를 구현한 클래스나 추상 클래스를 상속받은 클래스를 만듬과 동시에 메서드를 Overriding하고 객체를
  생성하는 것 까지 수행된다.
- 이름이 없으므로 다시는 객체를 생성할 수 없다.

**정리**
- 클래스 안에 클래스를 정의하는 것을 중첩 클래스라고 부른다.

### null 처리
**NullPointerException**
- Java언어로 소프트웨어를 개발하다보면 NullPointerException 이라는 오류를 자주 만나게 된다.
- 이는 객체의 주소 값이 담겨져 있지 않는 (null 값이 들어있는) 참조 변수를 통해 객체 접근을 시도하면 발생하는 오류이다.

**null safe**
- kotlin은 개발자가 null이 담겨 있는 참조변수를 통해 겍체 접근을 시도할 때 오류가 발생되는 것을 방지하고자 다양한 방법을 제공하고 있다.
- 이를 통해 null 값에 대한 안정성을 확보(null safe)할 수 있다.

**!!연산자**
- !! 연산자는 null을 허용하는 변수에 담긴 객체의 주소 값을 null을 허용하지 않는 형태의 값으로 변환하는 연산자이다.
- null을 허용하는 변수에 담긴 값을 null을 허용하지 않는 형태의 변수에 담을 경우 사용한다.
- 변환 과정에서 null 값이 들어 있을 경우 오류가 발생한다.
- 이 연산자의 사용은 권장하지 않는다.

**?: 연산자**
- ?: 연산자는 참조변수에 null이 들어있으면 지정된 기본값을 반환한다.

**?. 연산자**
- 참조변수를 통해 메서드를 호출하거나 멤버 변수를 사용할 때 참조 변수에 객체의 주소값이 들어 있다면 객체에 접근해서
  메서드나 변수를 사용한다.
- 만약 참조 변수에 null이 들어있다면 오류가 발생하지 않고 null을 반환한다.
  
**정리**
- !! - null을 허용하지 않는 형태로 반환한다.
- ?: - null이라면 지정된 기본 값이 반환한다.
- ?. - 메서드 호출 시 null이라면 메서드가 호출되지 않고 null을 반환한다.



