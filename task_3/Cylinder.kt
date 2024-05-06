package L3

class Cylinder(override val radius: Double, private val height: Double) : BodyOfRotation() {


    override fun calcVolume(): Double {
        return Math.PI * radius * radius * height
    }

    override fun calcBaseArea(): Double {
        return Math.PI * radius * radius
    }
}