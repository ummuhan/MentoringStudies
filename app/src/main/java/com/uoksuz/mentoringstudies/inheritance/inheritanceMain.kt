package com.uoksuz.mentoringstudies.inheritance

import com.uoksuz.mentoringstudies.MotorPower

fun main() {
    var car = Bmw(400, MotorPower.POWER, true)

    println("Car power :${car.motorPower}")
    println("Car speed : ${car.speed}")
    println("Car seat heater : ${if (car.seatHeater) "Yes" else "False"}")
    
}