import kotlin.system.exitProcess

fun main () {
    var listaDeContacto: ArrayList<Contacto> = arrayListOf()

    while (true) {
        println("1. Añadir un contacto")
        println("2. Listar contactos")
        println("3. Buscar contacto")
        println("4. Existe contacto")
        println("5. Eliminar contacto")
        println("6. Contactos disponibles")
        println("7. Agenda llena")
        println("8. Salir")
        println("Escribe una de las opciones")
        try {
            val numero = readln().toInt()
            when (numero) {
                1 -> {
                    var estado = true
                    println("Escribe un nombre")
                    var nombre = readln()
                    println("Escribe un telefono")
                    var telefono = readln()
                    val contacto = Contacto(nombre, telefono)

                    if (listaDeContacto.isNotEmpty()) {
                        if (listaDeContacto.size >= 3) {
                            println("La agenda esta llena, no se pueden meter más contactos")
                        } else {
                            for (i in listaDeContacto.indices) {
                                val contactoLista = listaDeContacto[i]
                                if (contacto.nombre == contactoLista.nombre) {
                                    println("Este contacto con ese nombre ya existe")
                                    estado = false
                                    break
                                }
                            }
                            if (estado) {
                                listaDeContacto.add(contacto)
                                println("Se ha añadido el contacto")
                            }
                        }
                    } else {
                        listaDeContacto.add(contacto)
                        println("Se ha añadido el contacto")
                    }
                }

                2 -> {
                    if (listaDeContacto.isEmpty()) {
                        println("No hay contactos que mostrar")
                    } else {
                        for (i in listaDeContacto.indices) {
                            var contacto = listaDeContacto[i]
                            println("Nombre = ${contacto.nombre}, Teléfono = ${contacto.telefono}")
                        }
                    }
                }

                3 -> {
                    var estado = true
                    println("Escribe un nombre")
                    val nombreContactoBuscado = readln()
                    if (listaDeContacto.isNotEmpty()) {
                        for (i in listaDeContacto.indices) {
                            val contacto = listaDeContacto[i]
                            if (contacto.nombre == nombreContactoBuscado) {
                                println("Su telefono es ${contacto.telefono}")
                                estado = false
                                break
                            }
                        }
                        if (estado) {
                            println("No se ha encontrado el contacto")
                        }
                    } else {
                        println("No se ha encontrado el contacto")
                    }
                }

                4 -> {
                    var estado = true
                    println("Escribe un nombre")
                    val nombreContactoBuscado = readln()
                    if (listaDeContacto.isNotEmpty()) {
                        for (i in listaDeContacto.indices) {
                            val contacto = listaDeContacto[i]
                            if (contacto.nombre == nombreContactoBuscado) {
                                println("Existe contacto")
                                estado = false
                                break
                            }
                        }
                        if (estado) {
                            println("No existe contacto")
                        }
                    } else {
                        println("No existe contacto")
                    }
                }

                5 -> {
                    var estado = true
                    println("Escribe un nombre")
                    val nombreContactoAEliminar = readln()
                    if (listaDeContacto.isNotEmpty()) {
                        for (i in listaDeContacto.indices) {
                            val contacto = listaDeContacto[i]
                            if (contacto.nombre == nombreContactoAEliminar) {
                                listaDeContacto.remove(listaDeContacto[i])
                                println("Se ha eliminado el conctacto")
                                estado = false
                                break
                            }
                        }
                        if (estado) {
                            println("No se ha eliminado el contacto")
                        }
                    } else {
                        println("No se ha eliminado el conctacto")
                    }
                }

                6 -> {
                    if (listaDeContacto.isEmpty()) {
                        println("Hay 3 contacto/s libre/s")
                    } else {
                        var contadorDeVueltas = 0
                        for (i in listaDeContacto.indices) {
                            contadorDeVueltas++
                        }
                        val plazasLibres = 3 - contadorDeVueltas
                        println("Hay $plazasLibres contacto/s libre/s")
                    }
                }

                7 -> {
                    if (listaDeContacto.isEmpty()) {
                        println("Aun se pueden meter contactos")
                    } else {
                        if (listaDeContacto.size < 3) {
                            println("Aun se pueden meter contactos")
                        } else {
                            println("La agenda está llena")
                        }
                    }
                }
                8 -> {
                    exitProcess(0)
                }

                else -> {
                    println("Numero no valido")
                }

            }
        } catch (e: Exception) {
            println("Dato no valido")
        }
    }
}