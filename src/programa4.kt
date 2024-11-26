fun main () {
    var instrucciones = arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    var pista = ("_|_|_")
    correrPistaDeObstaculos(instrucciones, pista)
}

fun correrPistaDeObstaculos (instrucciones: Array<String>, pista: String) {
    pista.toCharArray()
    var resultado = mutableListOf<String>()
    var haGanado = true

        for (i in pista.indices) {
            if (pista[i] == '_' && instrucciones[i] == "correr") {
                resultado.add("_")
            } else if (pista[i] == '_' && instrucciones[i] == "saltar") {
                resultado.add("x")
                haGanado = false
            } else {
                resultado.add("?")
            }

            if (pista[i] == '|' && instrucciones[i] == "saltar") {
                resultado.add("|")
            } else if (pista[i] == '|' && instrucciones[i] == "correr") {
                resultado.add("/")
                haGanado = false
            } else {
                resultado.add("?")
            }

        }

    println("$resultado $haGanado")

}