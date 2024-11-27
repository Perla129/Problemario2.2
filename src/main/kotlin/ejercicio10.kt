//Diseña una función para calcular la integral definida de una función en
// un intervalo utilizando el método del trapecio
fun integralTrapecio(funcion: (Double) -> Double, a: Double, b: Double, n: Int): Double {
    // Calcula la integral definida de una función en el intervalo [a, b]
    // usando el método del trapecio
    val h = (b - a) / n // Tamaño de cada subintervalo
    var suma = 0.0

    for (i in 0 until n) {
        val x0 = a + i * h
        val x1 = a + (i + 1) * h
        suma += (funcion(x0) + funcion(x1)) / 2 * h
    }

    return suma
}

fun main() {
    // Definimos la función f(x) = x^2
    fun f(x: Double): Double = x * x

    // Calculamos la integral de f(x) en el intervalo [0, 2] con 100 subintervalos
    val resultado = integralTrapecio(::f, 0.0, 2.0, 100)
    println("La integral de f(x) en [0, 2] es aproximadamente: $resultado")
}