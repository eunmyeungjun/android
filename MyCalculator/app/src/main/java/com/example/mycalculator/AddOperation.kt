package com.example.mycalculator

class AddOperation : AbstractOperation() {
    override fun operate(num1 : Int , num2 : Int) : Double = (num1 + num2).toDouble()
}