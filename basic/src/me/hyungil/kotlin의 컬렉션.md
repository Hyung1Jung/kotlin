## kotlin의 컬렉션

### 배열
- 연속된 기억공간을 확보하여 값 들을 저장하고 관리하는 자료 구조를 의미한다.
- 배열은 0부터 시작되는 인덱스 번호로 관리한다.
- kotlin에서는 다양한 타입의 값을 배열에 담을 수 있으며 한 가지 타입으로 제한하여 값을 담을 수 도 있다.

**배열 생성하기**
- 배열을 생성할 때는 arrayOf(값들) 함수를 이용한다.
- arrayOf는 다양한 값들을 담을 수 있다.
- 담을 값의 자료형을 제한하고 싶다면 자료형 + arrayOf 형태의 함수를 사용한다.
- arrayOf<제네릭타입>도 가능하다.

```kotlin
val array1 = arrayOf(10, 20, 30, 40, 50)
val array2 = arrayOf(10, 20, 30, "문자열", true)

val array3 = intArrayOf(10, 20, 30, 40, 50)
val array4 = doubleArrayOf(11.11, 22.22, 33.33, 44.44, 55.55)
val array5= ArrayOf<Boolean>(true, true, true, false, false, false)
```

- arrayOf 함수가 아닌 Array 클래스를 통해 직접 객체를 생성할 수도 있다.
- Array(개수. {식})

```kotlin
val array10 = Array(5, {0})
val array11 = Array(5, {a -> a * 2})
```

**for 문 사용하기**
- for문을 통해 배열이 가지고 있는 값의 수 만큼 반복하여 값을 사용할 수 있다.
```kotlin
for(item in array1){
    println("array1 : $item")
}
```

**다차원 배열**
```kotlin
val array6 = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
for(item1 in array6){
    for(item2 in item1){
        println("array6 : $item2")
    }
}
```

**배열 요소 접근**
- 배열은 0부터 시작하는 인덱스 번호를 이용해 관리하며 다음과 같이 값을 가져다 사용할 수 있다.
```kotlin
println("array1 - 0 : ${array1[0]}")
println("array1 - 1 : ${array1[1]}")
println("array1 - 2 : ${array1.get(2)}")
println("array1 - 3 : ${array1.get(3)}")
```

**배열 요소에 값 저장하기**
- 배열은 0 부터 시작하는 인덱스 번호를 통해 기억공간에 접근하고 값을 저장할 수 있다.
```kotlin
array1[0] = 100
println("array1 - 0 : ${array1[0]}")
array1.set(1, 200)
println("array1 - 1 : ${array1[1]}")
```

**배열 오소 개수**
- size 프로퍼티를 사용하면 배열이 관리하는 요소의 개수를 파악할 수 있다.

**제공 메서드**
- plus : 요소를 추가한 새로운 배열을 만들어 반환한다.
- sliceArray : 지정된 범위의 요소를 관리하는 배열을 만들어 반환한다.
- first : 제일 앞의 값을 반환한다.
- last : 제일 마지막 값을 반환한다.
- indexOf : 지정된 값의 index를 반환한다.
- average : 평균 값을 반환한다.

- count : 요소의 개수를 반환한다.
- contains : 지정된 값이 포함되어 있는지 반환한다.
- sotedArray: 오름 차순 정렬된 배열을 반환한다.
- sortedArrayDescending : 내림 차순 정렬된 배열을 반환한다.

**정리**
- kotlin은 배열에 다양한 기능을 추가하여 더욱 편리하게 사용할 수 있도록 제공한다.

### 문자열
- " "로 묶어서 관리하는 문자열을 의미한다.
- Kotlin은 문자열을 Java에 동일하게 String 클래스의 객체를 생성해서 관리한다.
- Java와 거의 동일하게 제공되며 몇가지 메서드를 추가하였다.

**문자열의 인덱스**
- kotlin은 문자열을 배열 형태로 관리한다.
- 문자열의 글자를 0부터 시작하는 인덱스 번호로 관리할 수 있어 Java보다 편리하게 사용할 수 있다.
- 문자열은 불변형으로 가져다 사용하는 것만 가능하다.
```kotlin
println("str[0] : ${str[0]}")
println("str[0] : ${str[1]}")
```

**제공 메서드**
- substring : 지정된 범위의 문자열을 반환한다.
- compareTo : 문자열을 비교한다. 같으면 0이며 음수나 양수면 다른 문자열이다. 두 번째 값으로 true를 넣어주면 대소문자를 무시하고 비교한다.
- split : 문자열 지정된 구분자를 이용해 잘라낸다.

**StringBuffer**
- 문자열은 불변형이므로 + 연산자를 통해 문자열을 합치면 문자열 객체가 계속 생성된다.
- StringBuffer를 사용하면 관리하는 문자열을 직접 조작할 수 있다.
- String은 지속적인 문자열을 수행하면 메모리를 많이 사용하지만 원본이 유지된다.
- StringBuffer는 메모리를 절약할 수 있지만 원본을 유지할 수 없다.

### List

**컬렉션**
- 자료구조에 나오는 다양한 데이터 관리 기법을 사용할 수 있도록 제공하고 있는 라이브러리
- List : 순서를 통해 관리한다.
- Map : 이름을 통해 관리한다.
- Set : 집합 관리

**List**
- 배열과 동일하게 인덱스 번호를 통해 객체를 관리한다.
- 배열의 크기가 정해지면 변경할 수 없지만 List는 추가, 삭제 등이 가능하다.

**List 생성**
- listOf : 불변형 리스트 생성
- mutableListOf : 가변형 리스트 생성
- emptyList : 가변형 리스트 생성
- listOfNotNull : null을 제외한 나머지만으로 리스트를 생성한다.

**객체 가져오기**
- get : 0부터 시작하는 인덱스 번호를 통해 객체를 추출할 수 있다.
- kotlin의 리스는 배열과 동일하게 []를 사용할 수 있다.
```kotlin
println("list1 0 : ${list1.get(0)}")
println("list1 1 : ${list1[2]}")
```

**기타 메서드**
- indexOf : 지정된 값의 인덱스 번호를 반환한다. 값이 없을 경우 -1을 반환한다.
- lastIndexOf : 지정된 값이 마지막에 해당하는 값의 인덱스 번호를 반환한다. 값이 없을 경우 -1을 반환한다.
- subList : 지정된 범위의 값을 추출하여 새로운 리스트를 생성해 반환한다.

**가변형 리스트의 메서드**
- add(객체) : 객체를 추가한다.
- add(인덱스, 객체) : 주어진 인덱스에 객체를 삽입한다.
- remove(객체) : 주어진 객체를 제거한다.
- removeAt(인덱스) : 주어진 인덱스의 객체를 제거한다.
- set(인덱스 ,객체) : 주어진 인덱스에 객체를 덮어씌운다.

**리스트 상호 변경**
- toList : 불변형 리스트를 생성해 반환한다.
- toMutableList : 가변형 리스트를 생성해 반환한다.

**정리**
- 리스트는 인덱스 번호를 통해 객체들을 관리하는 컬렉션 객체이다.

### Map 
- 객체 이름을 통해 관리하는 컬렉션이다

**Map 생성**
- mapOf : 불변형 Map를 생성한다.
- mutableMapOf : 가변형 Map를 생성한다.

**객체 가져오기**
- get : 이름을 통해 객체를 추출할 수 있다.
- kotlin의 Map는 []를 사용할 수 있다.
```kotlin
println("map1 key1 : ${map1.get("key1")}")
println("map1 key2 : ${map1["key2"]}")
```

**기타 메서드**
- size : 관리하는 요소의 개수
- keys : key를 배열로 반환한다.
- values : 객체들을 배열로 반환한다.
- containsKey : 저장된 이름으로 객체가 있는지 확인한다.
- containsValue : 지정된 값으로 객체가 있는지 확인한다.

**가변형 메서드**
- put : 객체를 추가한다. 기존 이름과 동일할 경우 덮어 씌운다.
- remove : 주어진 이름으로 객체를 제거한다.

**Map 상호 변경**
- toMap : 불변형 Map을 생성해 반환한다.
- toMutableMap : 가변형 Map을 생성해 반환한다.

### Set
- 객체 이름이나 순서 등으로 관리하는 주체가 없는 컬렉션이다.
- 중복된 객체를 담을 수 없다.
- 순서에 관계 없고 중복된 객체를 담지 않을 경우 사용한다.

**set 생성**
- setOf : 불변형 set를 생성한다.
- mutableSet : 가변형 set을 생성한다.

**객체 가져오기**
- set은 관리 주체가 없으므로 객체를 직접 가져오는 메서드가 제공되지 않는다.
- for문을 통해 객체를 순회해야 한다.

**기타 메서드**
- size : 관리하는 요소의 개수

**가변형 set의 메서드**
- add : 관리하는 객체를 추가한다. 같은 객체일 경우 추가되지 않는다.
- remove : 관리하는 객체를 제거한다.

**set 변경**
- toSet : 불변형 set으로 변환한다.
- toMutableSet : 가변형 set으로 변환한다.
- toList : 불변형 List로 변환한다.
- toMutableList : 가변형 List로 변환한다.

**List를 Set으로 변경**
- toSet : 불변형 set으로 변경한다. 이 때 중복된 객체는 제거된다.
- toMutableSet : 가변형 set으로 변환한다. 이 떄 중복된 객체는 제거한다

**정리**
- set은 순서, 이름 같은 관리 주체가 없으며 중복된 객체를 담을 수 없는 컬렉션이다.