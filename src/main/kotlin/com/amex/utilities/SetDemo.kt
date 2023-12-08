package com.amex.utilities

import kotlin.random.Random

fun main () {
    var idSet = mutableSetOf<Long>()

    for(i in  1..100) {
        idSet.add(Random.nextInt(1, 50).toLong())
    }
    println(" Set ${idSet}")

    idSet.sorted().forEach{
        println(it)
    }

    var java = setOf("sdsd","sdsdsd", "sdsdsdsdsdsdsd", "sdsd")
    var kotlin = setOf("sdsd", "dsdsdsdsd", "ssdsdsdsdsdsdsd")

    println( java.intersect(kotlin))

    println( java.minus(kotlin))

    println(java.union(kotlin))


}