//Calcula el número de caminos posibles en una cuadricula NxN, movióndose
//solo hacia la derecha o hacia abajo

fun numeroCaminos(n: Int): Long {
    // Calculamos el factorial de un número
    fun factorial(n: Int): Long {
        var result = 1L
        for (i in 2..n) {
            result *= i
        }
        return result
    }

    // Combinaciones de n elementos tomados de k en k
    fun combinaciones(n: Int, k: Int): Long {
        return factorial(n) / (factorial(k) * factorial(n - k))
    }

    return combinaciones(2 * n, n)
}

fun main() {
    val n = 4 // Tamaño de la cuadrícula
    val caminos = numeroCaminos(n)
    println("Hay $caminos caminos posibles en una cuadrícula de $n x $n")
}