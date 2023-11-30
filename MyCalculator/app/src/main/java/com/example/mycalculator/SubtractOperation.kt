package com.example.mycalculator

class SubtractOperation(a : Int , b : Int , oper : String) : Calculator (a , b , "-") {
    fun subtract (a : Int , b : Int) : Int {
        return a-b
    }
}