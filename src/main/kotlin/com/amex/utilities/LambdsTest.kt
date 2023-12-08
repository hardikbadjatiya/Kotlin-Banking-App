package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import java.time.LocalDate

fun invoke(indiviual: Indiviual, indiviual2: Indiviual) : (Indiviual, Indiviual) -> Boolean {
    val find = fun(indiviual : Indiviual , indiviual2 : Indiviual) : Boolean{
        return indiviual.dob.isBefore(indiviual2.dob)
    }
    return find
}

fun main () {
    val find=fun(individual1: Indiviual, individual2:Indiviual): Boolean{

        return individual1.dob.isBefore(individual2.dob)

    }
    val find2 : (indiviual : Indiviual, indiviual2 : Indiviual) -> Boolean = {i1, i2 -> i1.dob.isBefore(i2.dob)}

    val indiviual =  Indiviual(2132323232323, Address(), "Dummy Surname", Gender.MALE, LocalDate.of(2001, 12, 12))
    val indiviual2 =  Indiviual(2132323232323, Address(), "Dummy Surname", Gender.MALE, LocalDate.of(2008, 11, 12))
    val result = find(indiviual, indiviual2)
    val result2 = find2(indiviual, indiviual2)


    println("the result is ${result}")
    println("the result is ${result2}")
}