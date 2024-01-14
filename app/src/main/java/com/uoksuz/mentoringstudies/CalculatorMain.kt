package com.uoksuz.mentoringstudies

fun main() {

    val calculate = Calculator()

    calculate.calculate(10, 10)
    calculate.calculate(10, 20, 30)
    calculate.calculate(20.0, 30.0, 42.9)
    calculate.calculate(34, 56, 78, 69)
    calculate.calculate(23, 45, "Patato")
}