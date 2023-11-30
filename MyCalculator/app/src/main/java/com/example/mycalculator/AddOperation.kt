package com.example.mycalculator

class AddOperation(a : Int , b : Int , oper : String) : Calculator (a , b , "+") {
    fun add(a:Int , b: Int) : Int{
        return a + b
    }
}