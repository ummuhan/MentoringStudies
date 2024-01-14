package com.uoksuz.mentoringstudies

fun main() {
    //This parameter is save a lot of values
    fun calculate(vararg number: Int) {
        var total = 0
        for (num in number) {
            total += num
        }
        println("TOTAL :${total}")
    }

    calculate(1, 2, 3, 4, 5, 6, 7)
    calculate(10, 40, 666, 567)
}