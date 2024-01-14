package com.uoksuz.mentoringstudies

class Customer(var name: String, var surname: String, var age: Int) {

    fun getData() {
        println("Customer name: $name")
        println("Customer surname: $surname")
        println("Customer name: $age")
    }

    fun isMarried(married: Boolean, surname: String) {
        if (married)
            changeSurname(surname)
    }

    fun changeSurname(surname: String) {
        println("Customer new surname ${this.surname} $surname")
        this.surname = this.surname + " " + surname
    }

    fun newAge() {
        println("Happy birthday!! New age is ${this.age + 1}")
        age += 1
    }
}