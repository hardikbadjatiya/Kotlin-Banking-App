package com.amex.dtos

interface Consumer<in T, out Q> {
    fun writeToFile(message : T) : Q
}