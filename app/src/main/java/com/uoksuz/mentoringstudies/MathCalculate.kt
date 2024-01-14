package com.uoksuz.mentoringstudies

class mathCalculate() {

    fun calculate(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    fun calculate(a: Int, b: Int, c: String) {
        println("Toplam değer: ${a + b}  Değer adı: $c")
    }
}