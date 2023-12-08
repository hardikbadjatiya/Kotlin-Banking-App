package com.amex.utilities

import com.amex.dtos.CorporateProducer
import com.amex.dtos.MemberProducer

fun main() {
    var producer = CorporateProducer();
    var producer2 = MemberProducer()

    println("${producer.generateInstance().accNo} ${producer2.generateInstance().memberId}")
}