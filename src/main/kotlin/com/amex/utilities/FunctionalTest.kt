package com.amex.utilities

import com.amex.facades.CancatanateFunction

fun main () {

    //Implementation for the abstract function
    //No need for the sub class.

    val result = CancatanateFunction {first, lastName -> first+lastName }
    println(result.generateFullName("hards","ssdsdsdsdsd"))
}