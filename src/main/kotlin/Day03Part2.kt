class Day03Part2 {
    val mul = "mul\\((\\d+),(\\d+)\\)"
    val doo = "do\\(\\)"
    val dont = "don't\\(\\)"
    fun part2(input: List<String>): Int {
        return "$mul|$doo|$dont".toRegex()
            .findAll(input.joinToString(separator = ""))
            .onEach { println(it.value) }
            .fold(State(), {acc, match ->
                when {
                    acc.enabled && mul.toRegex().matches(match.value) ->
                        match.destructured.let {
                            (a:String, b:String) -> State(true, acc.total + (a.toInt().times(b.toInt())))
                        }
                    doo.toRegex().matches(match.value) -> State(true, acc.total)
                    dont.toRegex().matches(match.value) -> State(false, acc.total)
                    else -> { acc }
                }
            })
            .total
    }

    data class State(val enabled: Boolean = true, val total: Int = 0)
}




