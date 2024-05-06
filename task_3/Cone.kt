package L3

class Cone(override val radius: Double, private val height: Double) : BodyOfRotation() {

    override fun calcVolume(): Double {
        return (1.0 / 3.0) * Math.PI * radius * radius * height
    }

    override fun calcBaseArea(): Double {
        return Math.PI * radius * radius
    }


}