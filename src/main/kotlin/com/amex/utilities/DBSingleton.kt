package com.amex.utilities

object DBSingleton {
    init {
        println("Singleton Invocation..")
    }
    fun getConnection (dbName:String) : String {
        return "local host: 330"+dbName
    }
}