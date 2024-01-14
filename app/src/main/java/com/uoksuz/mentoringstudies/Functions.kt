package com.uoksuz.mentoringstudies

fun main() {

    fun calculate(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
    println("Toplam sayı ${calculate(10, 20, 30)}")

    var calculate1 = mathCalculate()

    calculate1.calculate(12, 13, 14)
    calculate1.calculate(11, 15, "Domates")
}