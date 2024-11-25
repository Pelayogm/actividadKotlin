fun main () {
    println("Introduzca una palabra:")
    val primeraPalabra = readln()
    println("Introduzca otra palabra:")
    val segundaPalabra = readln()
    compararPalabras(primeraPalabra, segundaPalabra)

}

fun compararPalabras(palabra1: String, palabra2: String ) {
    if (palabra1.length != palabra2.length) {
        println("Las palabras no son de la misma longitud")
    } else {
       var sonAnagramas = false
        var palabraReordenada = palabra2.toCharArray()
        val palabra2Array = palabra2.toCharArray()
        var k = 0
        for (i in palabra2.length - 1 downTo 0) {
            palabraReordenada.set(k, palabra2Array.get(i))
            k++
        }
        val palabraAComparar = StringBuilder().append(palabraReordenada).toString()
        if (palabraAComparar == palabra1) {
            sonAnagramas = true
        }

        println("¿Las palabras $palabra1 y $palabra2 son anagramas? = $sonAnagramas")

    }
}