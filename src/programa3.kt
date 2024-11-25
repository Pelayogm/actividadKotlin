fun main () {
    println("Introduce una funcion:")
    var funcion = readln()
    comprobarFunciones(funcion)
}

fun comprobarFunciones (funcion:String) {
    var funcionArray = funcion.toCharArray()
    var delimitadores: MutableList<Boolean> = mutableListOf()
    var estaBalanceada = true
    for (i in funcionArray.indices) {
        when (funcionArray[i]) {
            '(' -> for (x in funcionArray.indices) {
                if (funcionArray[x] == ')') {
                    funcionArray.set(i, '-')
                    funcionArray.set(x, '-')
                    delimitadores.add(true)
                    break
                }

            }

            '[' -> for (x in funcionArray.indices) {
                if (funcionArray[x] == ']') {
                    funcionArray.set(i, '?')
                    funcionArray.set(x, '?')
                    delimitadores.add(true)
                    break
                }
            }

            '{' -> for (x in funcionArray.indices) {
                if (funcionArray[x] == '}') {
                    funcionArray.set(i, '¿')
                    funcionArray.set(x, '¿')
                    delimitadores.add(true)
                    break
                }
            }

            '}' -> funcionArray.set(i, '{')
            ']' -> funcionArray.set(i, '[')
            ')' -> funcionArray.set(i, '(')
        }
    }

    for (k in funcionArray.indices) {
        when (funcionArray[k]) {
            '(' -> estaBalanceada = false
            ')' -> estaBalanceada = false
            '[' -> estaBalanceada = false
            ']' -> estaBalanceada = false
            '{' -> estaBalanceada = false
            '}' -> estaBalanceada = false
        }
    }

    println("$funcion ¿está balanceada? $estaBalanceada")
}