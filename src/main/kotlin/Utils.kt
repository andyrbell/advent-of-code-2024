import java.io.File

object Utils {
    fun readLines(filename: String): List<String> = File(filename).bufferedReader().readLines()

    fun toWords(line: String): List<String> = line.trim().split("\\s+".toRegex())

    fun toInts(line: String): List<Int> = toWords(line).map { Integer.valueOf(it) }

}