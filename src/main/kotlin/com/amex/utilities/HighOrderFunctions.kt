package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import java.time.LocalDate
import java.util.regex.Pattern

//High Order Function
fun validate(data:String,ind1: Indiviual, ind2: Indiviual, operation : (String)-> Boolean, operation2: (Indiviual, Indiviual) -> Boolean) : Boolean {
    return operation(data) && operation2(ind1, ind2)
}

fun validateAccountNo(account : String) : Boolean{
    return account.length ==16
}

fun validateName (name :String ) : Boolean {
    val pattern = Regex("[a-zA-Z]*")
    return pattern.matches(name)
}
fun compareInstance(ind1 : Indiviual, ind2 : Indiviual) : Boolean {
    return ind1.dob.isBefore(ind2.dob)
}

fun main() {

    var ind1 = Indiviual(3434343434343434343, Address(), "sdsdsdsdsdsdsdsd", Gender.FEMALE, LocalDate.of(1970, 12, 12))
    var ind2 = Indiviual(34343434343434343, Address(), "hsfg8sdfnbsdfn", Gender.FEMALE, LocalDate.of(1978, 12, 12))

    println(validate("1234567812345678", ind1, ind2,::validateAccountNo,::compareInstance))
    println(validate("hardidksd",ind1, ind2,::validateName,::compareInstance))
}