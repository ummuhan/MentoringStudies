package com.uoksuz.mentoringstudies

// Overloading Example

class Calculator() {

    fun calculate(a: Int, b: Int, c: Int) {
        println("TOPLAM: ${a + b + c}")
    }

    fun calculate(a: Int, b: Int, c: Int, d: Int) {
        println("TOPLAM: ${a + b + c + d}")
    }

    fun calculate(a: Double, b: Double, c: Double) {
        println("TOPLAM: ${a + b + c}")
    }

    fun calculate(a: Int, b: Int) {
        println("TOPLAM: ${a + b}")
    }

    fun calculate(a: Int, b: Int, c: String) {
        println("TOPLAM: ${a + b}  TOPLAM DEĞERİ BULUNAN ÜRÜN: $c")
    }
}