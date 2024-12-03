import Utils.readLines
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day03Test {
    @Test
    fun day03TestPart1() {
        val input = readLines("src/test/resources/Day03Test.txt")
        assertThat(Day03Part1().part1(input)).isEqualTo(161)
    }

    @Test
    fun day03SolvePart1() {
        val input = readLines("src/main/resources/Day03.txt")
        println("Part 1: " + Day03Part1().part1(input))
    }

    @Test
    fun day03TestPart2() {
        val input = readLines("src/test/resources/Day03TestPart2.txt")
        assertThat(Day03Part2().part2(input)).isEqualTo(48)
    }

    @Test
    fun day03SolvePart2() {
        val input = readLines("src/main/resources/Day03.txt")
        println("Part 2: " + Day03Part2().part2(input))
    }
}