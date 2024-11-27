//Escribe un programa para calcular los autovalores de una matriz 2x2.

fun calcularAutovalores(a: Double, b: Double, c: Double, d: Double): Pair<Double, Double> {
    // Calculamos la traza (suma de la diagonal principal)
    val traza = a + d

    // Calculamos el determinante
    val det = a * d - b * c

    // Calculamos el discriminante del polinomio característico
    val discriminante = traza * traza - 4 * det

    // Calculamos los autovalores usando la fórmula cuadrática
    val lambda1 = (traza + Math.sqrt(discriminante)) / 2.0
    val lambda2 = (traza - Math.sqrt(discriminante)) / 2.0

    return Pair(lambda1, lambda2)
}

fun main() {
    val matriz = arrayOf(doubleArrayOf(2.0, -1.0), doubleArrayOf(4.0, 1.0))
    val (autovalor1, autovalor2) = calcularAutovalores(matriz[0][0], matriz[0][1], matriz[1][0], matriz[1][1])
    println("Los autovalores son: $autovalor1 y $autovalor2")
}