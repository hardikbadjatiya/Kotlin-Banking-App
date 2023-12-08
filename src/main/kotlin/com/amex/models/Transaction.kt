package com.amex.models

class Transaction {
    // Internal visibility
    fun confirmTransaction (customer: Customer) {
        println("Customer  ${customer.code}")
    }
}