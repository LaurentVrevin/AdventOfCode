package aoc2023

import utils.readInput

fun main() {
    val inputs = readInput("2023", "day01")
    println("la somme est : ${solvePartOne(inputs)}")
}

fun solvePartOne(inputs: List<String>): Int {
    return inputs.sumOf {line->
        val numbers = line.filter {
            it.isDigit()
        }
        val firstDigit = numbers.first()
        val lastDigit = numbers.lastIndex?:firstDigit
        "$firstDigit$lastDigit".toInt()
    }

}


