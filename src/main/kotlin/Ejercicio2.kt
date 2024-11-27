//crea una funcion que reciba dos numeros iniciales y calcule una
// serie similar a fibonacci pero con estos numeros como punto de partida

fun seriePersonalizada(numero1: Int, numero2: Int, cantidadNumeros: Int): List<Int> {
    val serie = mutableListOf(numero1, numero2)

    for (i in 2 until cantidadNumeros) {
        val siguienteNumero = serie[i - 1] + serie[i - 2]
        serie.add(siguienteNumero)
    }

    return serie
}