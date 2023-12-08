package com.amex.utilities

fun main() {
    var cust  = listOf<String>("c1","c2","c3","c4")

    var loanList = listOf(2323, 344545, 4543,34343443)
    var fdList = listOf(3434,3434,34311211,4456445454545)
    fdList.zip(cust).zip(loanList).forEach{
        println("${it.first} , ${it.second}")
    }
}