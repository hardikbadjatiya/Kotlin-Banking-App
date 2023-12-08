package com.amex.utilities

import com.amex.models.Member
import kotlin.random.Random

fun main() {
    var map = mutableMapOf<Int, Member>()

    for(i in 1..100) {
        map.put(i, Member(Random.nextLong(), "sdsdsd"))
    }
    var sorted=map.toSortedMap()
    sorted.values.sorted().forEach{it->println("$it")}

    sorted.values.sorted().forEach{println(it)}
}