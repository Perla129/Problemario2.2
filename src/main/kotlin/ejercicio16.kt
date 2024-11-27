//Diseña un programa que encuentre todas las raíces reales de un polinomio
// de tercer grado.

fun encontrarRaices(a: Double, b: Double, c: Double, d: Double, tolerancia: Double = 1e-6): List<Double> {
    // Función del polinomio
    fun f(x: Double) = a * x * x * x + b * x * x + c * x + d

    // Encontrar un intervalo donde cambia de signo (si existe)
    var intervaloEncontrado = false
    var x1 = -100.0
    var x2 = 100.0
    while (!intervaloEncontrado && x1 < x2) {
        if (f(x1) * f(x2) < 0) {
            intervaloEncontrado = true
            break
        }
        x1 += 1
        x2 -= 1
    }

    if (!intervaloEncontrado) {
        return emptyList() // No se encontró un intervalo con cambio de signo
    }

    // Método de la bisección
    val raices = mutableListOf<Double>()
    var x = (x1 + x2) / 2.0
    while (Math.abs(f(x)) > tolerancia) {
        if (f(x) * f(x1) < 0) {
            x2 = x
        } else {
            x1 = x
        }
        x = (x1 + x2) / 2.0
    }
    raices.add(x)

    // Buscar otras raíces (opcional, puede haber hasta 3 raíces reales)
    // ... (implementar un algoritmo para encontrar otras raíces)

    return raices
}

fun main() {
    val a = 1.0
    val b = -6.0
    val c = 11.0
    val d = -6.0
    val tolerancia = 1e-6

    val raices = encontrarRaices(a, b, c, d, tolerancia)
    println("Las raíces del polinomio son: $raices")
}