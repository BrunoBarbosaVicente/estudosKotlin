fun main() {
    println("Digite um número para ver a tabuada:")
    val numero = readln().toInt()
    println("Tabuada do $numero")
    var contador = 1
    while (contador <= 10) {
        println("$numero x $contador = ${numero * contador}")
        contador++
    }
}