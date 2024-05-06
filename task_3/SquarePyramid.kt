package L3

class SquarePyramid(private val sideLength: Double, private val height: Double) : Shape() {

    override fun calcVolume(): Double {
        return (1.0 / 3.0) * calcBaseArea() * height
    }

    override fun calcBaseArea(): Double {
        return sideLength * sideLength * sideLength
    }

}