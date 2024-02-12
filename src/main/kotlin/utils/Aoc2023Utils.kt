package utils

import java.io.File

fun readInput(year: String, day: String): List<String> {
    return File("data/$year", "$day.txt").readLines()
}