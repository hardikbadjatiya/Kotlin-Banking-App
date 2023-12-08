package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import java.time.LocalDate

fun main() {
    val find : (ind1 : Indiviual, ind2 : Indiviual) -> Boolean = fun(i1, i2) : Boolean{
            return i1.dob.isBefore(i2.dob)
    }
    var individual1= Indiviual(1353246, Address(),"Bala", Gender.MALE, LocalDate.of(1970,12,2))
    var individual2= Indiviual(1353289, Address(),"Manickam", Gender.MALE, LocalDate.of(1995,12,7))
    val result= find(individual1,individual2)

    println("The result=${result}")
}