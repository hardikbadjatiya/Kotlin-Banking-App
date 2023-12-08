package com.amex.utilities

import com.amex.dao.IndiviualSubSystems
import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate
import kotlin.random.Random


fun main():Unit = runBlocking{
    var channl = Channel<String>(capacity = 5 , BufferOverflow.DROP_OLDEST)
    var individualSubSystem= IndiviualSubSystems()
    for(records in 1..100)
        individualSubSystem.addIndiviual(
            Indiviual(Random.nextInt(100000,100000000).toLong(), Address(),
                "Bala", Gender.FEMALE, LocalDate.of(Random.nextInt(1960,2022),Random.nextInt(1,12),
                    Random.nextInt(1,26)))
        )



    launch {
        println("Inside Corotine..")
        // Data Corotine
        individualSubSystem.getAllIndiviual().sortedWith(Comparator<Indiviual> { x, y ->
                x.dob.compareTo(y.dob)
        }).forEach{it->channl.send("${it.accNo},${it.dob.toString()}")}
        channl.close()

    }
    launch {
        println("Inside Coroutin test..")
        for( i in channl) {
            println(i )
            delay(100)
        }
    }
}