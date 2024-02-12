package aoc2023

import utils.readInput

fun main() {
    val inputs = readInput("2023", "day01")
    println("la somme est : ${solvePartOne(inputs)}")
}

fun solvePartOne(inputs: List<String>): Int {
    //Return sum of values from every input line
    return inputs.sumOf {line->
        val numbers = line.filter {
            it.isDigit()
        }
        val firstDigit = numbers.first()
        //If lastDigit is null, return firstDigit
        val lastDigit = numbers.lastOrNull()?:firstDigit
        //Create string to int with first and last digit
        "$firstDigit$lastDigit".toInt()
    }
}



