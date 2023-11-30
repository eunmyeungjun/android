package com.example.mycalculator

open class Calculator(val a : Int ,val b : Int , val operator : String) {
    fun calculate(): Int {
        return a + b

    }
}