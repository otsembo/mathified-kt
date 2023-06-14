package math

import kotlin.test.Test
import kotlin.test.assertEquals

class ShapeTest {

        @Test
        fun testCircle() {
            val circle = Circle(5.0)
            assertEquals(78.53981633974483, circle.area())
            assertEquals(31.41592653589793, circle.perimeter())
        }

        @Test
        fun testRectangle() {
            val rectangle = Rectangle(5.0, 10.0)
            assertEquals(50.0, rectangle.area())
            assertEquals(30.0, rectangle.perimeter())
        }

        @Test
        fun testSquare() {
            val square = Square(5.0)
            assertEquals(25.0, square.area())
            assertEquals(20.0, square.perimeter())
        }

        @Test
        fun testTriangle() {
            val triangle = Triangle(5.0, 4.0, 3.0)
            assertEquals(6.0, triangle.area())
            assertEquals(12.0, triangle.perimeter())
        }

        @Test
        fun testRhombus() {
            val rhombus = Rhombus(5.0, 10.0)
            assertEquals(50.0, rhombus.area())
            assertEquals(20.0, rhombus.perimeter())
        }

        @Test
        fun testTrapezoid() {
            val trapezoid = Trapezoid(5.0, 10.0, 5.0, 10.0, 6.0)
            assertEquals(45.0, trapezoid.area())
            assertEquals(30.0, trapezoid.perimeter())
        }

        @Test
        fun testParallelogram() {
            val parallelogram = Parallelogram(5.0, 10.0, 5.0)
            assertEquals(50.0, parallelogram.area())
            assertEquals(30.0, parallelogram.perimeter())
        }

        @Test
        fun testEllipse() {
            val ellipse = Ellipse(5.0, 10.0)
            assertEquals(157.07963267948966, ellipse.area())
            assertEquals(49.6729413289805, ellipse.perimeter())
        }

        @Test
        fun testCone() {
            val cone = Cone(5.0, 10.0)
            assertEquals(254.160184615763, cone.area())
            assertEquals(31.41592653589793, cone.perimeter())
        }

        @Test
        fun testCube() {
            val cube = Cube(5.0)
            assertEquals(150.0, cube.surfaceArea())
            assertEquals(125.0, cube.volume())
        }

        @Test
        fun testCylinder() {
            val cylinder = Cylinder(5.0, 10.0)
            assertEquals(471.23889803846896, cylinder.area())
            assertEquals(31.41592653589793, cylinder.perimeter())
        }

        @Test
        fun testSphere() {
            val sphere = Sphere(5.0)
            assertEquals(314.1592653589793, sphere.area())
            assertEquals(31.41592653589793, sphere.perimeter())
        }

        @Test
        fun testTorus() {
            val torus = Torus(5.0, 10.0)
            assertEquals(1973.9208802178719, torus.area())
            assertEquals(31.41592653589793, torus.perimeter())
        }

        @Test
        fun testHemisphere() {
            val hemisphere = Hemisphere(5.0)
            assertEquals(235.61944901923448, hemisphere.surfaceArea())
            assertEquals(31.41592653589793, hemisphere.perimeter())
        }

}