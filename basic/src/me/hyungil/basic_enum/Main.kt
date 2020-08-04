package me.hyungil.basic_enum

fun main() {
    printDirection(Direction.EAST)
    printDirection(Direction.SOUTH)

    val dir:Direction = Direction.WEST
    printDirection(dir)

    println(Direction.WEST)
    println(Direction.SOUTH)

    println("-----------------------------------")

    printNumber(Number.TWO)
}

enum class Direction{
    NORTH, SOUTH, WEST, EAST
}

enum class Number(val num:Int, val str:String){
    ONE(1, "일"), TWO(2, "이"), THREE(3, "삼")
}

fun printDirection(a1:Direction){
    
    when(a1){
        Direction.NORTH -> println("북쪽입니다")
        Direction.SOUTH -> println("남쪽입니다")
        Direction.WEST -> println("서쪽입니다")
        Direction.EAST -> println("동쪽입니다")
    }
}

fun printNumber(a1:Number){
    when(a1){
        Number.ONE -> println("ONE 입니다")
        Number.TWO -> println("TWO 입니다")
        Number.THREE -> println("THREE입니다")
    }

    when(a1.num){
        1 -> println("1 입니다")
        2 -> println("2 입니다")
        3 -> println("3 입니다")
    }
    
    when(a1.str){
        "일" -> println("일 입니다")
        "이" -> println("이 입니다")
        "삼" -> println("삼 입니다")
    }
}
