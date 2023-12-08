package com.amex.dtos

class ConsoleConsumer : Consumer<Number, String> {
    override fun writeToFile(message: Number): String {
        println(message)
        return "message sent to console"
    }
}