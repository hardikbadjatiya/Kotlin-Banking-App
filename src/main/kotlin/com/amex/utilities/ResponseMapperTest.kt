package com.amex.utilities

import com.amex.dtos.ResponseMapper
import com.amex.models.Member
//
//private operator fun <T> T.plus(t: Any): Any {
//
//}
//
//fun <T:Number> aggregate(data : List<T>) :T {
//    var result : T
//    for(va in data) {
//        result.plus(va)
//    }
//}

fun <T> displayName (value:List<T>) {
    value.forEach{
        println(it)
    }
}

fun main() {
    var responseWrapper1 = ResponseMapper<String> ("Fstrr")
    var responseWrapper2 = ResponseMapper<Member> (Member(34343, "3cvss"))
        println("${responseWrapper1}")
    println( "${responseWrapper2}")

    displayName(listOf<Int>(43434,34,43,434,3431))
    displayName(listOf<String>("dfdfdf","derrwewer","dfdfdsfadf"))
}