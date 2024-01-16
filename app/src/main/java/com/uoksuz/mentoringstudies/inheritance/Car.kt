package com.uoksuz.mentoringstudies.inheritance

import com.uoksuz.mentoringstudies.MotorPower

open class Car(speed: Int, var motorPower: MotorPower) : Vehicle(speed) {

}