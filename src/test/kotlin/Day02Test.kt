import Utils.readLines
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day02Test {
    @Test
    fun day02TestPart1() {
        val input = readLines("src/test/resources/Day02Test.txt")
        assertThat(Day02Part1().part1(input)).isEqualTo(2)
    }

    @Test
    fun day02SolvePart1() {
        val input = readLines("src/main/resources/Day02.txt")
        println("Part 1: " + Day02Part1().part1(input))
    }

    @Test
    fun day02TestPart2() {
        val input = readLines("src/test/resources/Day02Test.txt")
        assertThat(Day02Part2().part2(input)).isEqualTo(4)
    }

    @Test
    fun day02SolvePart2() {
        val input = readLines("src/main/resources/Day02.txt")
        println("Part 2: " + Day02Part2().part2(input))
    }
}