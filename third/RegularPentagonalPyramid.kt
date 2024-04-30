package third

import java.awt.Point
import kotlin.math.sqrt

class RegularPentagonalPyramid(
    var pentagonSideLength: Double,
    height: Double,
    point: Point,
): Figure(point, height) {
    override fun square(): Double {
        return pentagonSideLength * pentagonSideLength / 4 * sqrt(25 + 10 * sqrt(5.0))
    }

    override fun volume(): Double {
        return super.volume() / 3
    }
}