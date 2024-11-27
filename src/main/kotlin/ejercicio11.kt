//Dada una función y un punto, calcula la ecuación de la recta tangente
// en ese punto.

fun ecuacionRectaTangente(funcion: (Double) -> Double, punto: Double, h: Double = 0.0001): String {
    // Calcula la derivada numérica (pendiente) en el punto
    val pendiente = (funcion(punto + h) - funcion(punto)) / h

    // Calcula el valor de y en el punto
    val y = funcion(punto)

    // Ecuación punto-pendiente: y - y1 = m(x - x1)
    return "y - $y = $pendiente * (x - $punto)"
}

fun main() {
    // Definimos la función f(x) = x^2
    fun f(x: Double): Double = x * x

    // Calculamos la recta tangente en x = 2
    val ecuacion = ecuacionRectaTangente(::f, 2.0)
    println("La ecuación de la recta tangente es: $ecuacion")
}