package machine

import java.util.*
import kotlin.system.exitProcess

class CoffeeMachine {
    var money = 550
    var water = 400
    var milk = 540
    var coffeeBeans = 120
    var cups = 9

    private fun availableCups(variant: CoffeeVariant): Int =
            listOf(water / variant.neededWater, milk / variant.neededBeans, milk / variant.neededMilk, coffeeBeans / variant.neededBeans).min()
                    ?: -1

    fun sell(variant: CoffeeVariant) {
        fun brew() {
            water -= variant.neededWater
            milk -= variant.neededMilk
            coffeeBeans -= variant.neededBeans
            money += variant.cost
            cups--
            println("I have enough resources, making you a coffee!")
        }
        when {
            water < variant.neededWater -> println("Sorry, not enough water!")
            coffeeBeans < variant.neededBeans -> println("Sorry, not enough coffee beans!")
            milk < variant.neededMilk -> println("Sorry, not enough milk!")
            cups == 0 -> println("Sorry, not enough cups!")
            else -> brew()
        }
    }
}

private fun main() {
    val scanner = Scanner(System.`in`)
    val machine = CoffeeMachine()

    askForOperation(scanner, machine)

}

private fun askForOperation(scanner: Scanner, machine: CoffeeMachine) {
    print("Write action (buy, fill, take, remaining, exit): ")
    if (scanner.hasNext()) {
        when (scanner.next()) {
            "fill" -> fill(scanner, machine)
            "take" -> take(machine)
            "buy" -> buy(scanner, machine)
            "remaining" -> printStatus(machine)
            "exit" -> exitProcess(0)
            else -> println("Unknown Operation")
        }
    } else {
        exitProcess(0)
    }
    askForOperation(scanner, machine)
}

private fun printStatus(machine: CoffeeMachine) {
    println("""The coffee machine has:
                |${machine.water} of water
                |${machine.milk} of milk
                |${machine.coffeeBeans} of coffee beans
                |${machine.cups} of disposable cups
                |${machine.money} of money
    """.trimMargin())
}

enum class CoffeeVariant(val neededWater: Int, val neededMilk: Int, val neededBeans: Int, val cost: Int, val id: Int) {
    ESPRESSO(250, 0, 16, 4, 1),
    LATTE(350, 75, 20, 7, 2),
    CAPPUCCINO(200, 100, 12, 6, 3);
}

private fun buy(scanner: Scanner, machine: CoffeeMachine) {
    print("What dou you want to buy?")
    getArgument(scanner, machine) { input ->
        val selection = CoffeeVariant.values().firstOrNull { it.id == input.toInt() }
                ?: error("Unknown type")
        machine.sell(selection)
    }
}

private fun fill(scanner: Scanner, machine: CoffeeMachine) {
    print("Write how many ml of water do you want to add: ")
    val water = scanner.nextInt()
    print("Write how many ml of milk do you want to add: ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add: ")
    val coffeeBeans = scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    val cups = scanner.nextInt()
    machine.apply {
        this.water += water
        this.milk += milk
        this.coffeeBeans += coffeeBeans
        this.cups += cups
    }
}

private fun take(machine: CoffeeMachine) {
    println("I gave you $${machine.money}")
    machine.money = 0
}

private fun getArgument(scanner: Scanner, machine: CoffeeMachine, block: (String) -> Unit) {
    val nextInput = scanner.next()
    if (nextInput == "back") {
        askForOperation(scanner, machine)
    } else {
        block(nextInput)
    }
}
