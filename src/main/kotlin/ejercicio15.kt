//Creo una función que calculo el determinanto de matrices de hasta 4x4.

fun calcularDeterminante(matriz: Array<DoubleArray>): Double {
    require(matriz.size == matriz[0].size) { "La matriz debe ser cuadrada" }

    return when (matriz.size) {
        1 -> matriz[0][0]
        2 -> matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]
        3 -> {
            matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
            - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
            + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0])
        }
        4 -> {
            // Implementación de la expansión por cofactores para una matriz 4x4
            // ... (similar al caso de 3x3, pero con más términos)
        }
        else -> throw IllegalArgumentException("La matriz debe ser de tamaño máximo 4x4")
    }
}

fun main() {
    val matriz3x3 = arrayOf(
        doubleArrayOf(1.0, 2.0, 3.0),
        doubleArrayOf(4.0, 5.0, 6.0),
        doubleArrayOf(7.0, 8.0, 9.0)
    )

    val determinante = calcularDeterminante(matriz3x3)
    println("El determinante de la matriz es: $determinante")
}