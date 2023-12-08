package com.amex.dtos

import com.amex.models.Address
import com.amex.models.CompanyType
import com.amex.models.Corporate
import com.amex.models.Member

class CorporateProducer : Producer<Corporate> {
    override fun generateInstance(): Corporate {
        return Corporate("dfsdf", 556456, "sdsdsds", "gfdgfdsgdgg", 46565654656, Address(), CompanyType.AUTONOMOUS)
    }
}