package L3

class Sphere( override val radius: Double) : BodyOfRotation() {

    override fun calcVolume(): Double {
       return (4.0 / 3.0) * Math.PI * radius * radius * radius
    }

    override fun calcBaseArea(): Double {
        return Math.PI * radius * radius
    }
}