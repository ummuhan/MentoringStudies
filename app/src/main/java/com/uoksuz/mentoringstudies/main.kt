package com.uoksuz.mentoringstudies

fun main() {

    val customer1 = Customer("Ümmühan", "Öksüz", 25)
    customer1.getData()

    customer1.isMarried(true, "Kulaksız")

    customer1.getData()

    customer1.newAge()

    customer1.getData()

    //lateinit ifadesi primitive tiplerde geçerli değildir. Sadece referans tiplerde kullanılabilmektedir.
}