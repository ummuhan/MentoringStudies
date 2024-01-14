package com.uoksuz.mentoringstudies.c

import com.uoksuz.mentoringstudies.a.A

class C : A() {

    fun accessModifiers() {
        println(internalValue)
        println(publicValue)
        println(protectedValue)
    }

}