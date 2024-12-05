class Day04Part2 {
    fun part2(input: List<String>): Int {
        val cells = input.mapIndexed { y, line -> line.mapIndexed { x, c -> Point(x, y) to c.toString() } }.flatten().toMap()
        val grid = Grid(cells)
        return grid.allA().count { point -> grid.xmas(point) }
    }

    data class Grid(val cells: Map<Point, String>) {
        fun allA(): Set<Point> {
            return cells.filterValues { it == "A" }.keys
        }
        fun xmas(point: Point): Boolean {
            return ((cells.getOrDefault(point.topLeft(), ".") == "M"
                    && cells.getOrDefault(point.bottomRight(), ".") == "S")
                    || (cells.getOrDefault(point.topLeft(), ".") == "S"
                    && cells.getOrDefault(point.bottomRight(), ".") == "M"))
                    && ((cells.getOrDefault(point.bottomLeft(), ".") == "M"
                    && cells.getOrDefault(point.topRight(), ".") == "S")
                    || (cells.getOrDefault(point.bottomLeft(), ".") == "S"
                    && cells.getOrDefault(point.topRight(), ".") == "M"))
        }
    }


}

fun Point.topLeft(): Point = Point(this.first - 1, this.second - 1)
fun Point.topRight(): Point = Point(this.first + 1, this.second - 1)
fun Point.bottomLeft(): Point = Point(this.first - 1, this.second + 1)
fun Point.bottomRight(): Point = Point(this.first + 1, this.second + 1)
