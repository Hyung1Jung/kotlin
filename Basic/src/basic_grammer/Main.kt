package basic_grammer

fun main() {
    println("값 : " + 100)
    println("값 : ${100}")

    // 세미콜론은 선택사항 하지만 한 줄에 여러 개를 쓸때는 세미콜론 필요 -> 자바코드로 컴파일될때 알아서 세미콜론이 붙음.
    println("명령문1"); println("명령문2")
}