package oop

class Person(val first: String, val last: String) {
    var fulltime = true
    var location: String = "-"
    constructor(first: String, last: String, fte: Boolean): this(first, last) {
        fulltime = fte
    }
    constructor(
        first: String, last: String, loc: String): this(first, last, false) {
        location = loc
    }
    constructor(
        first: String, last: String, fte: Boolean, loc: String): this(first, last, fte) {
        location = loc
    }
    override fun toString() = "$first $last $fulltime $location"
}

fun main() {
    val person1=Person("Gino","Pilotino")
    println(person1)
    val person2=Person("Gino","Pilotino", true,"denver")
    println(person2)

}