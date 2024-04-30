package third

import java.awt.Point

abstract class Figure (
    var point: Point,
    var height: Double
) {
    abstract fun square(): Double

    open fun volume(): Double {
        return height + square()
    }
}