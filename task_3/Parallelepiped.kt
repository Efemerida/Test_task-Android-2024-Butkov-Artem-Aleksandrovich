package L3

open class Parallelepiped(
    var length: Double,
    var width: Double,
    var height: Double,
): Shape() {


    override fun calcVolume(): Double {
        return length * width * height
    }

    override fun calcBaseArea(): Double {
        return length * width
    }

}