//Diseña una función para descomponer un número em sus factores primos
// de forma eficiente.

fun descomponerEnFactoresPrimos(numero: Int): Map<Int, Int> {
    require(numero > 0) { "El número debe ser positivo" }

    var n = numero
    val factoresPrimos = mutableMapOf<Int, Int>()
    var divisor = 2

    while (n > 1) {
        var contador = 0
        while (n % divisor == 0) {
            contador++
            n /= divisor
        }
        if (contador > 0) {
            factoresPrimos[divisor] = contador
        }
        divisor++
    }

    return factoresPrimos
}

fun main() {
    val numero = 360
    val factores = descomponerEnFactoresPrimos(numero)
    println("Los factores primos de $numero son: $factores")
}