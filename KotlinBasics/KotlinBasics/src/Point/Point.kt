package Point

data class Point(val x: Double, val y : Double){
    operator fun plus(p : Point) : Point {
        return Point(this.x + p.x, this.y + p.y)
    }
    // Can write it either way!
    operator fun minus(p : Point) : Point = Point(this.x - p.x, this.y - p.y)
}