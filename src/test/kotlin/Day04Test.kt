import Utils.readLines
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day04Test {
    @Test
    fun day04TestPart1() {
        val input = readLines("src/test/resources/Day04Test.txt")
        assertThat(Day04Part1().part1(input)).isEqualTo(18)
    }

    @Test
    fun day04SolvePart1() {
        val input = readLines("src/main/resources/Day04.txt")
        println("Part 1: " + Day04Part1().part1(input))
    }

    @Test
    fun day04TestPart2() {
        val input = readLines("src/test/resources/Day04TestPart2.txt")
        assertThat(Day04Part2().part2(input)).isEqualTo(9)
    }

    @Test
    fun day04SolvePart2() {
        val input = readLines("src/main/resources/Day04.txt")
        println("Part 2: " + Day04Part2().part2(input))
    }
}