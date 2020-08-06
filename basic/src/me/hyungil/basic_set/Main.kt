package me.hyungil.basic_set

fun main() {
    val set1 = setOf(1, 5, 10, 1, 5, 10)
    println("set1 : $set1")

    val set2 = mutableSetOf<Int>()
    println("set2 : $set2")

    println("----------------------------------")

    // println("set1 0 : ${set1.get(0)}")
    // println("set1 1 : ${set1[1]}")

    for(item in set1){
        println("set1 : $item")
    }

    println("-----------------------------------")

    println("set1 size : ${set1.size}")

    println("----------------------------------")

    println("set2 : $set2")

    set2.add(10)
    set2.add(20)
    set2.addAll(listOf(30, 40, 50))
    println("set2 : $set2")

    set2.add(20)
    println("set2 : $set2")

    set2.addAll(listOf(40, 50, 60, 70))
    println("set2 : $set2")

    set2.remove(30)
    println("set2 : $set2")

    println("--------------------------------")

    val set3 = set1.toMutableSet()
    set3.add(1000)
    println("set3 : $set3")

    val set4 = set3.toSet()
    // set4.add(2000)

    val list100 = listOf(10, 20, 30, 10, 20, 30)
    println("list100 : $list100")

    val set5 = list100.toSet()
    val set6 = list100.toMutableSet()

    println("set5 : $set5")
    println("set6 : $set6")

    val set7 = set5.toList()
    val set8 = set5.toMutableList()
    println("set7 0 : ${set7[0]}")
    println("set8 0 : ${set8[0]}")
}













