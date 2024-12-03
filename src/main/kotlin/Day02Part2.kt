import Utils.toInts

class Day02Part2 {
    fun part2(input: List<String>): Int {
        return input.map { Report(toInts(it)) }.count { it.isSafe() || it.isSafeWithProblemDampener() }
    }

    data class Report(val levels: List<Int>) {
        private val allDecreasing = levels.zipWithNext().all { it.first - it.second in 1..3 }
        private val allIncreasing = levels.zipWithNext().all { it.second - it.first in 1..3 }
        fun isSafe(): Boolean {
            return allDecreasing || allIncreasing
        }

        fun isSafeWithProblemDampener(): Boolean {
            return levels.indices.map { levels.toMutableList().also { patchedLevels -> patchedLevels.removeAt(it) } }
                .map { Report(it) }
                .any { it.isSafe() }
        }
    }
}




