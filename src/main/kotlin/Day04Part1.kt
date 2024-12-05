typealias Point = Pair<Int, Int>

class Day04Part1 {
    fun part1(input: List<String>): Int {
        val cells = input.mapIndexed { y, line -> line.mapIndexed { x, c -> Point(x, y) to c.toString() } }.flatten().toMap()
        val grid = Grid(cells)
        return grid.allX().let {
            it.count { point -> grid.forwards(point) }
                .plus(it.count { point -> grid.backwards(point) })
                .plus(it.count { point -> grid.upwards(point) })
                .plus(it.count { point -> grid.downwards(point) })
                .plus(it.count { point -> grid.forwardsUp(point) })
                .plus(it.count { point -> grid.forwardsDown(point) })
                .plus(it.count { point -> grid.backwardsUp(point) })
                .plus(it.count { point -> grid.backwardsDown(point) })
        }
    }

    data class Grid(val cells: Map<Point, String>) {
        fun allX(): Set<Point> {
            return cells.filterValues { it.equals("X") }.keys
        }
        fun forwards(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first + 1, point.second), "."))
                .plus(cells.getOrDefault(Point(point.first + 2, point.second), "."))
                .plus(cells.getOrDefault(Point(point.first + 3, point.second), ".")) == "XMAS"
        }
        fun backwards(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first - 1, point.second), "."))
                .plus(cells.getOrDefault(Point(point.first - 2, point.second), "."))
                .plus(cells.getOrDefault(Point(point.first - 3, point.second), ".")) == "XMAS"
        }
        fun upwards(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first, point.second + 1), "."))
                .plus(cells.getOrDefault(Point(point.first, point.second + 2), "."))
                .plus(cells.getOrDefault(Point(point.first, point.second + 3), ".")) == "XMAS"
        }
        fun downwards(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first, point.second - 1), "."))
                .plus(cells.getOrDefault(Point(point.first, point.second - 2), "."))
                .plus(cells.getOrDefault(Point(point.first, point.second - 3), ".")) == "XMAS"
        }
        fun forwardsUp(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first + 1, point.second + 1), "."))
                .plus(cells.getOrDefault(Point(point.first + 2, point.second + 2), "."))
                .plus(cells.getOrDefault(Point(point.first + 3, point.second + 3), ".")) == "XMAS"
        }
        fun forwardsDown(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first + 1, point.second - 1), "."))
                .plus(cells.getOrDefault(Point(point.first + 2, point.second - 2), "."))
                .plus(cells.getOrDefault(Point(point.first + 3, point.second - 3), ".")) == "XMAS"
        }
        fun backwardsUp(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first - 1, point.second + 1), "."))
                .plus(cells.getOrDefault(Point(point.first - 2, point.second + 2), "."))
                .plus(cells.getOrDefault(Point(point.first - 3, point.second + 3), ".")) == "XMAS"
        }
        fun backwardsDown(point: Point): Boolean {
            return cells.getOrDefault(point, ".")
                .plus(cells.getOrDefault(Point(point.first - 1, point.second - 1), "."))
                .plus(cells.getOrDefault(Point(point.first - 2, point.second - 2), "."))
                .plus(cells.getOrDefault(Point(point.first - 3, point.second - 3), ".")) == "XMAS"
        }
    }

}




