import Utils.toInts

class Day02Part1 {
    fun part1(input: List<String>): Int {
        return input.map { Report(toInts(it)) }.count { it.isSafe() }
    }

    data class Report(val levels: List<Int>) {
        private val allDecreasing = levels.zipWithNext().all { it.first - it.second in 1..3 }
        private val allIncreasing = levels.zipWithNext().all { it.second - it.first in 1..3 }
        fun isSafe(): Boolean {
            return allDecreasing || allIncreasing
        }
    }
}




