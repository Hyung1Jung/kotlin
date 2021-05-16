### 예외

- 프로그램 실행 중 예측이 가능한 오류들을 예외라고 부른다.
- 예외가 발생하면 코드의 수행이 중단된다.
- 예외 처리는 예외가 발생했을 때 프로그램이 수행되는 것을 막고 예외 발생시 동작해야 하는 코드를 수행시켜 프로그램이 문제없이
  동작하게 하기 위한 목적을 가조기 있다.

**예외처리**
```kotlin
try{
    예외가 발생할 가능성이 있는 코드
}catch (e:예외클래스)
    예외가 발생할 때 수행할 코드
}finally{
    예외 발생 여부에 관계없이 수행해야 하는 코드
}
```

```kotlin
package me.hyungil.basic_exception

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    try {
//      val a1 = 10 / 0
//      val str:String? = null
//      println(str!!.length)

        val str2 = "안녕하세요"
        val a2: Int = str2.toInt()
        println("a2 : $a2")
    } catch (e: ArithmeticException) {
        println("수학적 오류가 발생하였습니다")
    } catch (e: KotlinNullPointerException) {
        println("Null 오류가 발생하였습니다")
    } catch (e: Exception) {
        println("예외 발생")
        e.printStackTrace()
    }

    println("이 부분이 수행될까요?")
}

```