class Day03Part1 {
    fun part1(input: List<String>): Int {
        return "mul\\((\\d+),(\\d+)\\)".toRegex()
            .findAll(input.joinToString(separator = ""))
            .sumOf { it.destructured.let { (a, b) -> a.toInt().times(b.toInt()) } }
    }
}




