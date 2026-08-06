fun main() {
    var contador = 0
    println("Digite o numero que deseja ver a tabuada completa:")
    val numero = readln().toInt()
    println("Tabuada do $numero")
    do {
        println("$numero x $contador = ${numero * contador}")
        contador++
    } while (contador <= 10)
}