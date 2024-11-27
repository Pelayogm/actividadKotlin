import kotlin.system.exitProcess

fun main () {
    val tablero = arrayOf(
        arrayOf<String?>("X", "O", "X"),
        arrayOf<String?>("X", "X", "O"),
        arrayOf<String?>("X", "X", "X")

        //NOTA IMPORTANTE: ES IMPRESCINDIBLE PARA EL CORRECTO FUNCIONAMIENTO DEL PROGRAMA QUE SE PONGAS LETRAS "O" EN MAYÚSCULAS Y LETRAS "X" EN MAYÚSCULAS
        //PD: LO SIENTO
    )

    tresEnRaya(tablero)
    }

    fun tresEnRaya (tablero: Array<Array<String?>>) {
    var movimientosX = arrayListOf<String?>()


        for (i in tablero) {
            for (j in i) {
                if (j.equals("X")) {
                    movimientosX.add("X")
                } else if (j.equals("O")) {
                    movimientosX.add("O")
                } else if (j.isNullOrBlank()) {
                    movimientosX.add("N")
                }
            }
        }

        var contadorX = 0
        var contadorO = 0
        for (x in movimientosX.indices) {
            if (movimientosX[x].equals("X")) {
                contadorX++
            } else if (movimientosX[x].equals("O")) {
                contadorO++
            }
        }

        if (contadorX <= 5 && contadorO <= 5) {
            var contador = 0
            if (movimientosX[contador].equals("X") && movimientosX[1].equals("X") && movimientosX[2].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[1].equals("O") && movimientosX[2].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 3
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 1].equals("X") && movimientosX[contador + 2].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 1].equals("O") && movimientosX[contador + 2].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 6
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 1].equals("X") && movimientosX[contador + 2].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 1].equals("O") && movimientosX[contador + 2].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 0
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 3].equals("X") && movimientosX[contador + 5].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 3].equals("O") && movimientosX[contador + 5].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 1
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 3].equals("X") && movimientosX[contador + 5].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 3].equals("O") && movimientosX[contador + 5].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 2
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 3].equals("X") && movimientosX[contador + 5].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 3].equals("O") && movimientosX[contador + 5].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 0
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 4].equals("X") && movimientosX[contador + 8].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 4].equals("O") && movimientosX[contador + 8].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                contador = 2
            }

            if (movimientosX[contador].equals("X") && movimientosX[contador + 2].equals("X") && movimientosX[contador + 4].equals("X")) {
                println("X")
                exitProcess(0)
            } else if (movimientosX[contador].equals("O") && movimientosX[contador + 2].equals("O") && movimientosX[contador + 4].equals("O")) {
                println("O")
                exitProcess(0)
            } else {
                println("EMPATE")
            }
        } else {
            println("NULL")
        }



}