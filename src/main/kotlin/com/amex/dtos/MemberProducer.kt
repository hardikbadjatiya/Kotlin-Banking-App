package com.amex.dtos

import com.amex.models.Member

class MemberProducer : Producer<Member> {
    override fun generateInstance(): Member {
        return Member(3434, "sdfsdfsdf")
    }
}