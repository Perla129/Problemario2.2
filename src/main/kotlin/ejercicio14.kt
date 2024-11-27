//Implementa un algoritmo para multiolicar dos matricos disporsas cricientomento.

class SparseMatrix(private val data: MutableMap<Pair<Int, Int>, Double>) {
    // Función para obtener el valor en una posición
    fun get(row: Int, col: Int): Double {
        return data[Pair(row, col)] ?: 0.0
    }

    // Función para establecer el valor en una posición
    fun set(row: Int, col: Int, value: Double) {
        if (value == 0.0) {
            data.remove(Pair(row, col))
        } else {
            data[Pair(row, col)] = value
        }
    }

    // Función para multiplicar dos matrices dispersas
    fun multiply(other: SparseMatrix): SparseMatrix {
        val result = SparseMatrix(mutableMapOf())

        for ((i, v1) in this.data) {
            for ((j, v2) in other.data) {
                if (i == j) {
                    result.set(i.first, j.second, result.get(i.first, j.second) + v1 * v2)
                }
            }
        }

        return result
    }
}

fun main() {
    val matrix1 = SparseMatrix(mutableMapOf(Pair(0, 0) to 1.0, Pair(1, 1) to 2.0))
    val matrix2 = SparseMatrix(mutableMapOf(Pair(0, 1) to 3.0, Pair(1, 0) to 4.0))

    val result = matrix1.multiply(matrix2)
    println(result.data) // Imprime la matriz resultante
}
