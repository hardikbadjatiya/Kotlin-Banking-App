package com.amex.utilities



import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import java.time.LocalDate
import java.util.regex.Pattern

//High Order Function
inline fun validate1(data:String,ind1: Indiviual, ind2: Indiviual, operation : (String)-> Boolean, operation2: (Indiviual, Indiviual) -> Boolean) : Boolean {
    return operation(data) && operation2(ind1, ind2)
}

inline fun validateAccountNo1(account : String) : Boolean{
    return account.length ==16
}

inline fun validateName1 (name :String ) : Boolean {
    val pattern = Regex("[a-zA-Z]*")
    return pattern.matches(name)
}
inline fun compareInstance1(ind1 : Indiviual, ind2 : Indiviual) : Boolean {
    return ind1.dob.isBefore(ind2.dob)
}

fun main() {

    var ind1 = Indiviual(3434343434343434343, Address(), "sdsdsdsdsdsdsdsd", Gender.FEMALE, LocalDate.of(1970, 12, 12))
    var ind2 = Indiviual(34343434343434343, Address(), "hsfg8sdfnbsdfn", Gender.FEMALE, LocalDate.of(1978, 12, 12))

    println(validate("1234567812345678", ind1, ind2,::validateAccountNo,::compareInstance))
    println(validate("hardidksd",ind1, ind2,::validateName,::compareInstance))
}