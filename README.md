# MathifiedKt
This is a Kotlin Multiplatform library for common math functions.

Are you a Kotlin Developer who is tired of writing the same math functions over and over again? Well, this library is for you! This library contains common math functions that you can use in your projects.
This project is intended to scale to from basic math functions such as calculating the area of a circle to more complex math evaluations such as solving Fourier Series Equations.

**NB: The library is currently in development and is not ready for production use. However, you can still use it for your projects. Just be aware that the library is not yet stable and may contain bugs.**

## Table of Contents

- [MathifiedKt](#mathifiedkt)
  - [Table of Contents](#table-of-contents)
  - [Installation](#installation)
  - [Usage](#usage)
    - [Shapes](#shapes)
      - [Circle](#circle)
      - [Rectangle](#rectangle)
      - [Square](#square)
      - [Triangle](#triangle)
      - [Rhombus](#rhombus)
      - [Parallelogram](#parallelogram)
      - [Trapezium](#trapezium)
      - [Cone](#cone)
      - [Cube](#cube)
      - [Cylinder](#cylinder)
      - [Sphere](#sphere)
      - [Hemisphere](#hemisphere)
      - [Torus](#torus)
      - [Ellipse](#ellipse)

## Installation

The library is published on Maven Central. To use it, add the following to your `build.gradle` / `build.gradle.kts` file:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.mathified:mathifiedkt:0.1.0")
}
```
Ensure that you have the `mavenCentral()` repository in your `repositories` block.

## Usage

### Shapes

#### Circle

A Circle is a shape with all points at a fixed distance from the center. The distance from the center is called the radius. The following properties are available for a circle:

```kotlin
import com.rutubishi.mathifiedkt.math.Circle

val circle = Circle(radius = 5.0)
val area = circle.area()
val circumference = circle.perimeter()
```

#### Rectangle

A Rectangle is a shape with four sides and four right angles. The following properties are available for a rectangle:

```kotlin
import com.rutubishi.mathifiedkt.math.Rectangle

val rectangle = Rectangle(length = 5.0, breadth = 10.0)
val area = rectangle.area()
val perimeter = rectangle.perimeter()
```

#### Square

A Square is a shape with four sides and four right angles. The following properties are available for a square:

```kotlin
import com.rutubishi.mathifiedkt.math.Square

val square = Square(side = 5.0)
val area = square.area()
val perimeter = square.perimeter()
```

#### Triangle

A Triangle is a shape with three sides. The following properties are available for a triangle:

```kotlin
import com.rutubishi.mathifiedkt.math.Triangle

val triangle = Triangle(sideA = 5.0, sideB = 10.0, sideC = 15.0)
val area = triangle.area()
val perimeter = triangle.perimeter()
```

#### Rhombus

A Rhombus is a shape with four equal sides with none of the angles being right angles. The following properties are available for a rhombus:

```kotlin
import com.rutubishi.mathifiedkt.math.Rhombus

val rhombus = Rhombus(side = 5.0, height = 10.0)
val area = rhombus.area()
val perimeter = rhombus.perimeter()
```

#### Parallelogram

A Parallelogram is a shape with four sides with opposite sides being parallel and equal. None of the angles in a parallelogram are right-angled. The following properties are available for a parallelogram:

```kotlin

import com.rutubishi.mathifiedkt.math.Parallelogram

val parallelogram = Parallelogram(sideA = 5.0, sideB = 10.0, height = 10.0)
val area = parallelogram.area()
val perimeter = parallelogram.perimeter()
```

#### Trapezium

A Trapezium is a shape with four sides with one pair of opposite sides being parallel. The following properties are available for a trapezium:

```kotlin

import com.rutubishi.mathifiedkt.math.Trapezoid

val trapezium = Trapezoid(sideA = 5.0, sideB = 10.0, sideC = 12.0, sideD = 11.0, height = 10.0)
val area = trapezium.area()
val perimeter = trapezium.perimeter()
```

#### Cone

A Cone is a shape with a circular base and a vertex. The following properties are available for a cone:

```kotlin

import com.rutubishi.mathifiedkt.math.Cone

val cone = Cone(radius = 5.0, height = 10.0)
val volume = cone.volume()
val surfaceArea = cone.surfaceArea()
val perimeter = cone.perimeter() // perimeter of the base
```

#### Cube

A Cube is a shape with six equal square faces. The following properties are available for a cube:

```kotlin

import com.rutubishi.mathifiedkt.math.Cube

val cube = Cube(side = 5.0)
val volume = cube.volume()
val surfaceArea = cube.surfaceArea()
val perimeter = cube.perimeter() // total perimeter of all faces only counting the edges once
```


#### Cylinder

A Cylinder is a shape with two circular bases and a curved surface. The following properties are available for a cylinder:

```kotlin

import com.rutubishi.mathifiedkt.math.Cylinder

val cylinder = Cylinder(radius = 5.0, height = 10.0)
val volume = cylinder.volume()
val surfaceArea = cylinder.surfaceArea()
val perimeter = cylinder.perimeter() // perimeter of the base
```

#### Sphere

A Sphere is a shape with all points at a fixed distance from the center. The distance from the center is called the radius. The following properties are available for a sphere:

```kotlin

import com.rutubishi.mathifiedkt.math.Sphere

val sphere = Sphere(radius = 5.0)
val volume = sphere.volume()
val surfaceArea = sphere.surfaceArea()
val perimeter = sphere.perimeter() // perimeter of the base
```

#### Hemisphere

A Hemisphere is a shape with all points at a fixed distance from the center. The base of this shape is a circle. The distance from the center is called the radius. The following properties are available for a hemisphere:

```kotlin

import com.rutubishi.mathifiedkt.math.Hemisphere

val hemisphere = Hemisphere(radius = 5.0)
val volume = hemisphere.volume()
val surfaceArea = hemisphere.surfaceArea()
val perimeter = hemisphere.perimeter() // perimeter of the base
```

#### Torus

A surface of revolution generated by revolving a circle in three-dimensional space one full revolution about an axis that is coplanar with the circle.

```kotlin

import com.rutubishi.mathifiedkt.math.Torus

val torus = Torus(majorRadius = 5.0, minorRadius = 2.0)
val volume = torus.volume()
val surfaceArea = torus.surfaceArea()
```

#### Ellipse

An ellipse is a shape with all points at a fixed distance from the center. The distance from the center is called the radius. The following properties are available for an ellipse:

```kotlin

import com.rutubishi.mathifiedkt.math.Ellipse

val ellipse = Ellipse(majorRadius = 5.0, minorRadius = 2.0)
val area = ellipse.area()
val perimeter = ellipse.perimeter()
```

## Authors

* **Rutubishi** - *Initial work* - [Ian Okumu](https://github.com/otsembo)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
