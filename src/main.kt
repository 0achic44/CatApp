fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    binnie.walk(1)
    clyde.walk(1)
    println(binnie)
    println(clyde)

    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    flathead.eat(2)
    flathead.eat(3)
    println(flathead)
    cupra.walk(1)
    cupra.walk(1)
    cupra.walk(1)
    cupra.walk(1)
    println(cupra)
}