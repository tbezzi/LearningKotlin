class Person(val first: String, val last: String) {

    internal fun fullName() = "$last, $first"
    private fun yearsOfService(): Int =
            throw RuntimeException("Not implemented yet")
}

val p=Person("ddd","vvv")
println(p.fullName()+" dd")

val a=10
