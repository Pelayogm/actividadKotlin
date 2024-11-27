fun main () {
    var instrucciones = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    var pista = ("||_||")
    correrPistaDeObstaculos(instrucciones, pista)
}

fun correrPistaDeObstaculos (instruccionesUsuario: Array<String>, pista: String) {
    var instrucciones = instruccionesUsuario.toMutableList()
    var pistaArray = pista.toMutableList()
    var resultado = mutableListOf<String>()
    var haGanado = true

    if (pistaArray.size < instrucciones.size) {
        for (i in pistaArray.size until instrucciones.size) {
            pistaArray.add(i, '?')
        }
    } else {
        for (i in instrucciones.size until pistaArray.size) {
            instrucciones.add(i, "?")
        }
    }

        for (i in pistaArray.indices) {
            when {
                pistaArray[i] == '_' && instrucciones[i] == "correr" -> {
                   resultado.add("_")
                }

                pistaArray[i] == '_' && instrucciones[i] == "saltar" -> {
                    resultado.add("x")
                    haGanado = false
                }

                pistaArray[i] == '|' && instrucciones[i] == "saltar" -> {
                    resultado.add("|")
                }

                pistaArray[i] == '|' && instrucciones[i] == "correr" -> {
                    resultado.add("/")
                    haGanado = false
                }

                else -> {
                    resultado.add("?")
                    haGanado = false
                }
            }
        }

    println("$resultado $haGanado")

}