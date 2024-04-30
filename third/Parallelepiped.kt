package third

import java.awt.Point

class Parallelepiped(
    var length: Double,
    var width: Double,
    height: Double,
    point: Point
): Figure(point, height){

    override fun square(): Double {
        return length * width
    }

    fun isCube(): Boolean{
        return length == width && width == height
    }

    override fun toString(): String {
        return "Parallelepiped(l=$length, w=$width, h=$height)"
    }


}