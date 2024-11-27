//Escribe un programa que encuentre el mínimo o máximo de una función
// cuadrática mediante el cálculo de su derivada.

fun encontrarExtremo(a: Double, b: Double, c: Double): Double {
    // La función cuadrática es ax^2 + bx + c
    // La derivada es 2ax + b

    // En el extremo, la derivada es igual a 0
    val x = -b / (2 * a)

    return x
}

fun main() {
    // Ejemplo: f(x) = 2x^2 - 4x + 3
    val a = 2.0
    val b = -4.0
    val c = 3.0

    val extremo = encontrarExtremo(a, b, c)
    println("El extremo de la función se encuentra en x = $extremo")
}