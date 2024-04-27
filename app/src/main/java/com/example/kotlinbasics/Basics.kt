package com.example.kotlinbasics

fun main(){

    // val for const
    // var for let

    println("hello");

    var myAge: Byte = 35 // Byte is a smaller int
    println(myAge);

    var shortNumber: Short = 20001

    val pi = 3.14 //Double, but we can type cast to Float when 3.14f. Double is more precise

    // Hint: Remember, float has a limitation on the precision it can store.

    // Unsigned Integer Types - POSITIVE
    //UByte = 8-bit integer. 0 - 255
    //UShort = 16-bit
    //UInt = 32-bit
    //ULong = 64-bit

//    val age: UByte = 100U

    //Char

    val singleChar: Char = 'a'


    // Unicode

    val unicode = '\u00AE'

    println(unicode)

    // Strings

    var name: String = "Cecon"

    for (c in name) {
        println(c)
    }

    println(name.replace('C', 'p'))


    //IF ELSE C-like

    // COMPARISON C-like

    // READLN

    var value = readln().toInt()
    var age = value.toInt()

    if(age >= 18) {
        println("hey")
    } else {
        println("not hey")
    }
}