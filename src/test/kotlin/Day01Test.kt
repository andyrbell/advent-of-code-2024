import Utils.readLines
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day01Test {
    @Test
    fun day01TestPart1() {
        val input = readLines("src/test/resources/Day01Test.txt")
        assertThat(Day01Part1().part1(input)).isEqualTo(11)
    }

    @Test
    fun day01SolvePart1() {
        val input = readLines("src/main/resources/Day01.txt")
        println("Part 1: " + Day01Part1().part1(input))
    }

    @Test
    fun day01TestPart2() {
        val input = readLines("src/test/resources/Day01Test.txt")
        assertThat(Day01Part2().part2(input)).isEqualTo(31)
    }

    @Test
    fun day01SolvePart2() {
        val input = readLines("src/main/resources/Day01.txt")
        println("Part 2: " + Day01Part2().part2(input))
    }
}