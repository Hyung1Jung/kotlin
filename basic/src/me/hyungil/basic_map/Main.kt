package me.hyungil.basic_map

fun main() {
    val map1 = mapOf<String, Int>("key1" to 10, "key2" to 20, "key3" to 30)
    println("map1 : $map1")

    val map2 = mutableMapOf<String, Int>()
    println("map2 : $map2")

    val map3 = mapOf<String, Any>("key1" to 10, "key2" to 11.11, "key3" to true)
    println("map3 : $map3")

    println("-----------------------------")

    println("map1 key1 : ${map1.get("key1")}")
    println("map1 key2 : ${map1["key2"]}")

    println("----------------------------------")

    println("map1 size : ${map1.size}")
    println("map1 keys : ${map1.keys}")
    println("map1 values : ${map1.values}")

    println("map1 contains key1 : ${map1.containsKey("key1")}")
    println("map1 contains key100 : ${map1.containsKey("key100")}")

    println("map1 contains value 10 : ${map1.containsValue(10)}")
    println("map1 contains value 100 : ${map1.containsValue(100)}")

    println("--------------------------------")

    println("map2 : $map2")

    map2.put("key1", 100)
    println("map2 : $map2")

    map2["key2"] = 200
    println("map2 : $map2")

    map2.put("key1", 1000)
    map2["key2"] = 2000
    println("map2 : $map2")

    map2.remove("key1")
    println("map2 : $map2")

    println("------------------------------")

    val map100 = map1.toMutableMap()
    map100["key100"] = 1000
    println("map100 : $map100")

    val map200 = map100.toMap()
    //map200["key200"] = 2000
}















