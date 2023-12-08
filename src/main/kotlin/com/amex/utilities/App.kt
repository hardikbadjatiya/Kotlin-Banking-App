package com.amex.utilities

import com.amex.models.Address
import com.amex.models.Customer
import com.amex.models.Member

fun main() {

    val accNo :  Long = 232323

//   var cust =  Customer("dfdfhasd", accNo, _email  ="hardik@gmail.com", "dummypass",4544, _address = Address())
//   var form = String.format("%s,%s,%s,%s,%s,%s",cust.name,cust.accNo,cust.email,cust.pass,cust.contactNo,cust.address)
//        println("CustObj "+ form )
//    var custObj = Customer()
//    println( "" +cust + " "+ form)
//    var form2 = String.format("%s,%s,%s,%s,%s",custObj.name,custObj.accNo,custObj.email,custObj.pass,custObj.contactNo)
//
//    println( "cust obj 2" +custObj + " "+ form2)

//    var customer = Customer(3434343434)
//    form = String.format("%s,%s,%s",customer.name, customer.accNo,customer.address)
//    var custome23 = Customer()
//    var customer1 = Customer(3434222343434)
//
//    println("$form")
//
//    println( cust.showCounter())

    Customer
    println(Customer.counter)

    var member = Member(232, "Dummy")
    println("${member}")


    var address = Address()
    address.streetName = "Hell"
    address.doorNo = "door"

    println("address ${address.doorNo} ${address.streetName}")
}