//Implementa una función que resuelva un sistoma de ecuaciones lineales
// usando el método de eliminación de Gauss

fun resolverSistemaGauss(matriz: Array<DoubleArray>): DoubleArray? {
    // Verificar si la matriz es cuadrada
    val n = matriz.size
    if (n != matriz[0].size) return null // La matriz no es cuadrada

    // Eliminación hacia adelante
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            val factor = matriz[j][i] / matriz[i][i]
            for (k in i until n + 1) {
                matriz[j][k] -= factor * matriz[i][k]
            }
        }
    }

    // Sustitución hacia atrás
    val solucion = DoubleArray(n)
    for (i in n - 1 downTo 0) {
        var suma = 0.0
        for (j in i + 1 until n) {
            suma += matriz[i][j] * solucion[j]
        }
        solucion[i] = (matriz[i][n] - suma) / matriz[i][i]
    }

    return solucion
}

fun main() {
    // Sistema de ecuaciones:
    // 2x + y - z = 8
    // -3x - y + 2z = -11
    // -2x + y + 2z = -3
    val matriz = arrayOf(
        doubleArrayOf(2.0, 1.0, -1.0, 8.0),
        doubleArrayOf(-3.0, -1.0, 2.0, -11.0),
        doubleArrayOf(-2.0, 1.0, 2.0, -3.0)
    )

    val solucion = resolverSistemaGauss(matriz)
    if (solucion != null) {
        println("La solución del sistema es: ${solucion.contentToString()}")
    } else {
        println("El sistema no tiene solución única.")
    }
}