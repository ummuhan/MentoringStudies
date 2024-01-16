package com.uoksuz.mentoringstudies.inheritance2

fun main() {

    var house = House(4)
    var palace = Palace(true, 40)
    var villa = Villa(winterGarden = true, pool = true, windowCount = 20)
    var slum = Slum(2)

    var palace2 = House(50)

    println("House:  Window Count:${house.windowCount}")
    println("Palace1:  Pool:${palace.pool} WindowCount:${palace.windowCount}")
    println("Villa:  Winter Garden:${villa.winterGarden} Pool:${villa.pool}  WindowCount:${villa.windowCount}")
    println("Slum:  WindowCount:${slum.windowCount}")
    println("Palace2:  WindowCount:${palace2.windowCount}")

}