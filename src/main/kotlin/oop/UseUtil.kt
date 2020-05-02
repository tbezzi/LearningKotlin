package oop

import oop.singleton.util.Distance
import oop.singleton.util.unitsSupported
import oop.singleton.util.Temperature.c2f as celsius2farhenait

fun main() {

    unitsSupported().stream().forEach(::println)

    println(celsius2farhenait(33.4))

    println(Distance.kmToMiles(33.4))
}