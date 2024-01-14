package com.uoksuz.mentoringstudies

class ConstructorExample(var name: String, var surname: String, var age: Int) {

    init {
        println("Constructor running!!")
    }

    fun getInfo() {
        println("Customer name: $name ")
        println("Customer surname: $surname ")
        println("Customer age: $age ")
    }
}