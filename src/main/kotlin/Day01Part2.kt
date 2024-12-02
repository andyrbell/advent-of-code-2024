import Utils.toInts

class Day01Part2 {
    fun part2(input: List<String>): Int = input.fold(State(), { acc, line ->
            toInts(line).let { acc.add(it[0], it[1]) }
        })
        .let { Pair(it.leftList, it.rightList.groupingBy { it }.eachCount()) }
        .let { it.first.sumOf { leftListInt ->
            (leftListInt.times(it.second.getOrDefault(leftListInt, 0))) } }

}

