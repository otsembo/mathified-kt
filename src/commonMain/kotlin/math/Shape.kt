package math

import kotlin.math.PI
import kotlin.math.sqrt

/* Custom shape blueprint */
abstract class Shape {

    var sides: Int = 1
        protected set

    abstract fun area(): Double
    abstract fun perimeter(): Double
    open fun surfaceArea(): Double? = null
    open fun volume(): Double? = null

}

/* Circle shape */
class Circle(private val radius: Double) : Shape() {

    init {
        sides = 0
    }

    override fun area(): Double = PI * radius * radius

    override fun perimeter(): Double = 2 * PI * radius
}

/* Rectangle shape */
class Rectangle(
    private val length: Double,
    private val breadth: Double) : Shape() {

    init {
        sides = 4
    }

    override fun area(): Double = length * breadth

    override fun perimeter(): Double = 2 * (length + breadth)
}

/* Square shape */
class Square(
    private val side: Double) : Shape() {

    init {
        sides = 4
    }

    override fun area(): Double = side * side

    override fun perimeter(): Double = 4 * side
}

/* Rhombus shape */
class Rhombus(
    private val side: Double,
    private val height: Double) : Shape() {

    init {
        sides = 4
    }

    override fun area(): Double = side * height

    override fun perimeter(): Double = 4 * side
}

/* Triangle shape */
class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double) : Shape() {

    init {
        sides = 3
    }

    override fun area(): Double {
        val s = (sideA + sideB + sideC) / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun perimeter(): Double = sideA + sideB + sideC
}

/* Trapezoid shape */
class Trapezoid(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    private val sideD: Double,
    private val height: Double) : Shape() {

    init {
        sides = 4
    }

    override fun area(): Double = ((sideA + sideB) * height) / 2

    override fun perimeter(): Double = sideA + sideB + sideC + sideD
}

/* Parallelogram shape */
class Parallelogram(
    private val sideA: Double,
    private val sideB: Double,
    private val height: Double) : Shape() {

    init {
        sides = 4
    }

    override fun area(): Double = sideB * height

    override fun perimeter(): Double = 2 * (sideA + sideB)
}

/* Cone shape */
class Cone(
    private val radius: Double,
    private val height: Double) : Shape() {

    init {
        sides = 1
    }

    override fun area(): Double = PI * radius * (radius + sqrt((height * height) + (radius * radius)))

    override fun surfaceArea(): Double = PI * radius * (radius + sqrt((height * height) + (radius * radius)))

    override fun perimeter(): Double = 2 * PI * radius

    override fun volume(): Double = (PI * radius * radius * height) / 3
}

/* Cube shape */
class Cube(
    private val side: Double) : Shape() {

    init {
        sides = 6
    }

    override fun area(): Double = 6 * side * side

    override fun surfaceArea(): Double = 6 * side * side

    override fun perimeter(): Double = 12 * side

    override fun volume(): Double = side * side * side
}

/* Cylinder shape */
class Cylinder(
    private val radius: Double,
    private val height: Double) : Shape() {

    init {
        sides = 3
    }

    override fun area(): Double = 2 * PI * radius * (height + radius)

    override fun surfaceArea(): Double = 2 * PI * radius * (height + radius)

    override fun perimeter(): Double = 2 * PI * radius

    override fun volume(): Double = PI * radius * radius * height
}

/* Sphere shape */
class Sphere(
    private val radius: Double) : Shape() {

    init {
        sides = 0
    }

    override fun area(): Double = 4 * PI * radius * radius

    override fun surfaceArea(): Double = 4 * PI * radius * radius

    override fun perimeter(): Double = 2 * PI * radius

    override fun volume(): Double = (4 * PI * radius * radius * radius) / 3
}

/* Hemisphere shape */
class Hemisphere(
    private val radius: Double) : Shape() {

    init {
        sides = 0
    }

    override fun area(): Double = 3 * PI * radius * radius

    override fun surfaceArea(): Double = 3 * PI * radius * radius

    override fun perimeter(): Double = 2 * PI * radius

    override fun volume(): Double = (2 * PI * radius * radius * radius) / 3
}

/* Torus shape */
class Torus(
    private val majorRadius: Double,
    private val minorRadius: Double) : Shape() {

    init {
        sides = 0
    }

    override fun area(): Double = 4 * PI * PI * majorRadius * minorRadius

    override fun surfaceArea(): Double = 4 * PI * PI * majorRadius * minorRadius

    override fun perimeter(): Double = 2 * PI * majorRadius

    override fun volume(): Double = 2 * PI * PI * majorRadius * minorRadius * minorRadius
}

/* Ellipse shape */
class Ellipse(
    private val majorRadius: Double,
    private val minorRadius: Double) : Shape() {

    init {
        sides = 0
    }

    override fun area(): Double = PI * majorRadius * minorRadius

    override fun perimeter(): Double = 2 * PI * sqrt((majorRadius * majorRadius + minorRadius * minorRadius) / 2)
}