package com.amex.models

import java.time.LocalDate

fun Account.validateOpeningDate():Boolean {

    return openingDate.isBefore(LocalDate.now())
}