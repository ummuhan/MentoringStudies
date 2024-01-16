package com.uoksuz.mentoringstudies.inheritance

import com.uoksuz.mentoringstudies.MotorPower

class Bmw(
    speed: Int, motorPower: MotorPower, var
    seatHeater: Boolean
) : Car(speed, motorPower) {

}