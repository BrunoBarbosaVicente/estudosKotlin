fun main() {
    var contador = 0
    var entrada: String
    do {
        println("Deseja continuar? (S/N)")
        entrada = readln().uppercase()
        contador++
            if (entrada != "S" && entrada != "N") {
                println("entrada invalida")
            }
    } while (entrada != "N")
    println("Programa Finalizado")
}