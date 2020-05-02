open class Fruit
class Banana : Fruit()
class Orange: Fruit()

fun receiveFruits(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

fun receiveFruit(fruit: Fruit) {
    println("Fruit: $fruit")
}

fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun main() {
    val bananas: List<Banana> = listOf()
    receiveFruit(Banana())
    receiveFruits(bananas)

    val fruitsBasket1 = Array<Fruit>(3) { Fruit() }
    val fruitsBasket2 = Array<Fruit>(3) { Fruit() }
    copyFromTo(fruitsBasket1, fruitsBasket2)

    val bananaBasket = Array<Banana>(3) { _ -> Banana() }
    // Array<T>
    copyFromTo(bananaBasket, fruitsBasket1)

}
