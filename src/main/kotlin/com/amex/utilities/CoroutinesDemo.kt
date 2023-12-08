package com.amex.utilities

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    //This main Thread
    println("Main Starts->${Thread.currentThread().name}")

    Thread.currentThread().name
    var orgName="RPS CONSULTING SERVICES"
    thread {
        println("New 2 User Thread Starts->${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("New 2 User Thread Ends->${Thread.currentThread().name}")

    }
    //creating the coroutine
    GlobalScope.launch {
        println("User Thread Starts->${Thread.currentThread().name}")
//        delay(1000)

        showVerticalDelay()

        orgName.toCharArray().forEach { it ->
            run {

                println("$it")
                delay(50)
            }
        }
        println("User Thread Ends->${Thread.currentThread().name}")

    }
    var name3 = "good code algo"
    GlobalScope.launch {
        println("New User Thread ${Thread.currentThread().name}")
        name3.toCharArray().forEach {
            delay(50)
            println(it)
        }
        println("New User thread ends... ${Thread.currentThread().name } ${Thread.currentThread().id}")
    }
    runBlocking {
        launch {
            println("Run blocking User Thread ${Thread.currentThread().name}")
            delay(3000)
            println("Run blocking thread ends... ${Thread.currentThread().name} ${Thread.currentThread().id}")
        }
    }
//    delay(5000)
    println("Main Ends->${Thread.currentThread().name}")
}
suspend fun showVerticalDelay() {
    var s = "xxxxxxxxxxxxxx"
    s.toCharArray().forEach {
        run {
            delay(100)
            println(it)
        }
    }
}