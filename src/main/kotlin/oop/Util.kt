package oop

object Util {
    fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

fun main() {
    println(Util.numberOfProcessors()) //8
}