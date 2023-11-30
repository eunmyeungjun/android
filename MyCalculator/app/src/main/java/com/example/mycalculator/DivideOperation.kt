package com.example.mycalculator

class DivideOperation(a : Int , b : Int , oper : String) : Calculator (a , b , "%") {

    fun divide (a : Int , b : Int) : Int {
        return a/b
    }
}