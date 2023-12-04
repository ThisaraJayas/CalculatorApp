package com.example.hello.models

class Calculator(private val Number1:Double, private val Number2:Double) {
    fun add():Double{
        return Number1 + Number2
    }

    fun substract() = Number1-Number2
    fun multiply() = Number1*Number2
    fun divide() = Number1/Number2

}