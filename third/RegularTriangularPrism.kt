package third

import java.awt.Point
import kotlin.math.sqrt

class RegularTriangularPrism (
    var triangleSideLength: Double,
    height: Double,
    point: Point
) : Figure(point, height){

    override fun square(): Double {
        return triangleSideLength * triangleSideLength * sqrt(3.0) / 4
    }
}