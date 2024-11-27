//Diseña una función que acepte una expresión algebraica
// (por ejemplo, 3x12 + 2x) y calcule su derivada simbólica.
fun derivadaSimple(expresion: String): String {
    val terminos = expresion.split(" + ".toRegex())
    val resultado = terminos.mapNotNull { termino ->
        val regex = Regex("(\\d*)\\*?x\\^(\\d+)")
        val match = regex.matchEntire(termino)

        if (match != null) {
            val (coefStr, exponenteStr) = match.destructured
            val coef = coefStr.toIntOrNull() ?: 1
            val exponente = exponenteStr.toInt()
            "${coef * exponente}*x^${exponente - 1}"
        } else if (termino.contains("x")) {
            // Si es un término lineal como "2x"
            val coef = termino.replace("x", "").toIntOrNull() ?: 1
            "$coef"
        } else {
            null // Ignorar constantes
        }
    }
    return resultado.joinToString(" + ")
}

fun main() {
    val expresion = "3*x^2 + 2*x + 5"
    val derivada = derivadaSimple(expresion)
    println("La derivada de $expresion es: $derivada")
}
