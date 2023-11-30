package com.example.mycalculator

class MultiplyOperaiton(a : Int , b : Int , oper : String) : Calculator (a , b , "*") {
    fun multiple (a : Int , b : Int) : Int {
        return (a * b)
    }
}