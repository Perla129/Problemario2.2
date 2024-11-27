//Aproximación de derivadas Implementa una función que calcule la derivada de
// una función en un punto usando diferencias finitas.

fun derivadaDiferenciasFinitas(funcion: (Double) -> Double, x: Double, h: Double = 0.0001): Double {
    // Calcula la derivada numérica en el punto x utilizando diferencias finitas
    return (funcion(x + h) - funcion(x)) / h
}

fun main() {
    // Definimos la función f(x) = x^2
    fun f(x: Double): Double = x * x

    // Calculamos la derivada de f(x) en x = 2
    val derivada = derivadaDiferenciasFinitas(::f, 2.0)
    println("La derivada de f(x) en x = 2 es aproximadamente: $derivada")
}