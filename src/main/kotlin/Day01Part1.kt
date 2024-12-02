import Utils.toInts
import kotlin.math.absoluteValue

class Day01Part1 {
    fun part1(input: List<String>): Int = input.fold(State(), { acc, line ->
            toInts(line).let { acc.add(it[0], it[1]) }
        })
        .let { State(it.leftList.sorted(), it.rightList.sorted()) }
        .let { it.leftList.zip(it.rightList) }
        .let { it.sumOf { (it.first - it.second).absoluteValue } }

}

data class State(val leftList: List<Int> = mutableListOf(), val rightList: List<Int> = mutableListOf()) {
    fun add(left: Int, right: Int): State = State(leftList + left, rightList + right)
}
