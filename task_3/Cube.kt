package L3

class Cube (
    var sideLength: Double,
): Shape() {


    override fun calcVolume(): Double {
        return sideLength * sideLength * sideLength
    }

    override fun calcBaseArea(): Double {
        return sideLength * sideLength
    }

}