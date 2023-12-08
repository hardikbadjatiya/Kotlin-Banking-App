package com.amex.utilities

import kotlinx.coroutines.*

var name="RPS Consulting Services"
fun main() = runBlocking{
    println("Start main thread ${Thread.currentThread().name}")
    var job : Job = GlobalScope.launch {

        println("New Launch thread ${Thread.currentThread().name}")
        run {
            name.toCharArray().forEach {
                delay(100)
                println(it)
            }
        }
    }


//    job.cancel()
    job = GlobalScope.launch {
        println("New Launch thread ${Thread.currentThread().name}")
        run {
            "ooooooooooooxxx".toCharArray().forEach {

                delay(200)
                println(it)
            }
        }
    }

    //main thread waits for coroutine to complete the job
    //we can avoid writing delay or sleep
    delay(200)
    job.cancel()
    job.join()
    println("Exit main thread ${Thread.currentThread().name}")

}