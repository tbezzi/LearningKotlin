package oop

class Car(val yearOfMake: Int, theColor: String, val price: Double = 1200.00) {
    private var fuelLevel = 100
        private set

    var color = theColor
        get() = field + "ssss"
        set(value) {
            if (value.isBlank()) {
                throw RuntimeException("no empty, please")
            }
            field = value
        }

    var weight = theColor


    override fun toString(): String {
        return "Car made in ${yearOfMake} color is ${color} weight is ${weight} fuel ${fuelLevel}% - Price is ${price}$"
    }
}


fun main() {
    val car = Car(1232, "Blue", 1234.55)
    car.color = "Red"
    car.weight = "Ligth"
    //car.fuelLevel = 33
    println(car)
}