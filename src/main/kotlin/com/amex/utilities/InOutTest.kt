package com.amex.utilities

import com.amex.dtos.ConsoleConsumer
import com.amex.dtos.CsvFileConsumer
import com.amex.models.Member

fun main() {
    var csvFile = CsvFileConsumer()
    println( "${csvFile.writeToFile(Member(3434343434, "sfdfsf"))}")
    var console = ConsoleConsumer()
    println("${console.writeToFile(4343434)}")

}