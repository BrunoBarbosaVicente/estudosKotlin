fun main() {
    var contador = 0
    do {
        println("digite um numero:")
        val numero = readln().toInt()
        contador++
        } while (numero >= 0 && numero != 0)
    println("programa encerrado.")
}