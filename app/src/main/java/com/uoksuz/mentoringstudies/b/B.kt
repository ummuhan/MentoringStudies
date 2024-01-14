package com.uoksuz.mentoringstudies.b

import com.uoksuz.mentoringstudies.a.A

class B {
    fun accessModifiers(){
        val accessModifiers= A()
        println(accessModifiers.internalValue)
        println(accessModifiers.publicValue)
    }
}