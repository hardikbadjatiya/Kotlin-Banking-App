package com.amex.utilities

import com.amex.models.Member

fun main() {
    var membersList = listOf<Member>(Member(2323322323, "gasdgasdg"), Member(234324234324, "sfsdfsdfsdf"),Member(24324, "sfahatds"))

    membersList.sortedWith(Comparator<Member>{
     m1,m2 -> m1.memberId.compareTo(m2.memberId)
    }).forEach{ it -> println("${it.memberId} ${it.name}") }
}