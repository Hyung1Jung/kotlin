package me.hyungil.basic_list

fun main() {

    val list1 = listOf(10, 20, 30, 40, 50)
    val list2 = listOf("문자열1", "문자열2", "문자열3")

    println("list1 : $list1")
    println("list2 : $list2")

    val list3 = mutableListOf<Int>()
    val list4 = mutableListOf("문자열1", "문자열2", "문자열3")
    println("list3 : $list3")
    println("list4 : $list4")

    val list5 = emptyList<Int>()
    println("list5 : $list5")

    val list6 = listOfNotNull(10, 20, null, 30, null, 40, 50)
    println("list6 : $list6")

    for(item in list1){
        println("list1 : $item")
    }

    println("list1 size : ${list1.size}")

    println("---------------------------------")

    println("list1 0 : ${list1.get(0)}")
    println("list1 1 : ${list1.get(1)}")
    println("list1 2 : ${list1[2]}")
    println("list1 3 : ${list1[3]}")

    println("------------------------------")

    val list7 = listOf(10, 20, 30, 10, 20, 30)

    val index1 = list7.indexOf(20)
    println("index1 : $index1")

    val index2 = list7.lastIndexOf(20)
    println("index2 : $index2")

    val list8 = list1.subList(1, 3)
    println("list8 : $list8")

    println("-------------------------------")

    println("list3 : $list3")

    list3.add(10)
    list3.add(20)
    list3.add(30)

    println("list3 : $list3")

    list3.addAll(listOf(40, 50, 60))
    println("list3 : $list3")

    list3.add(1, 100)
    println("list3 : $list3")

    list3.addAll(2, listOf(200, 300, 400))
    println("list3 : $list3")

    list3.remove(100)
    println("list3 : $list3")

    list3.removeAll(listOf(200, 300))
    println("list3 : $list3")

    list3.removeAt(1)
    println("list3 : $list3")

    list3.set(1, 200)
    println("list3 : $list3")

    list3[2] = 300
    println("list3 : $list3")

    println("-----------------------------")

    val list100 = list1.toMutableList()
    list100.add(1000)
    println("list100 : $list100")

    val list200 = list100.toList()
    // list200.add(300)
}













