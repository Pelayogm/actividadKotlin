fun main () {
    var i = 0

    while (i < 101) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("triqui")
        } else if (i % 5 == 0) {
            println("qui")
        } else if (i % 3 == 0) {
            println("tri")
        } else {
            println("$i")
        }
        i++
    }


}