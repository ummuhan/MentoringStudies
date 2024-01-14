package com.uoksuz.mentoringstudies

fun main() {

    //Extension add new feature in kotlin class
    fun Int.calculate(number: Int): Int {
        return this * number
    }

    //If You can use infix,your code is becomes shorter
    infix fun String.combine(text: String): String {
        return this + text
    }

    println(10.calculate(20))

    println("Ümmühan" combine "Öksüz")
}