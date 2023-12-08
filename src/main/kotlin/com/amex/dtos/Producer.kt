package com.amex.dtos

interface Producer <out T>{
    fun generateInstance() : T
}